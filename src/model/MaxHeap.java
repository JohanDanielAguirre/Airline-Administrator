package model;

import Exeptions.KeyExeption;
import Exeptions.NonexistObjectExeption;
import Exeptions.SizePlaneExeption;

import Exeptions.*;

import java.util.ArrayList;

public class MaxHeap implements iMaxPriorityQueue{

    private ArrayList<Passenger> passengers;
    int heapSize;

    public MaxHeap(int capacity){
        passengers = new ArrayList<>();
        heapSize = passengers.size();
    }
    

    @Override
    public void insert(Passenger passenger) throws SizePlaneExeption, KeyExeption, NonexistObjectExeption {
		if(heapSize>1000){
		   throw new SizePlaneExeption("maximum size reached");
		}else if(passenger ==null){
			throw new NonexistObjectExeption("non exist object");
		}
		try{
			passengers.add(passenger);
			heapSize = passengers.size();
			increase_Key(passengers.size()-1, passengers.lastIndexOf(passenger)); 
		}catch (Exception e){
			throw new KeyExeption("something is wrong");
		}
       
    }

    @Override
    public Passenger Maximum() {
        return passengers.get(0);
    }

    @Override
    public Passenger extract_Max() {
        if(heapSize < 1){
            return null;
        }

        Passenger max = Maximum();
        
        passengers.set(0,passengers.get(heapSize-1));

        heapSize = heapSize - 1;

        maxHeapify(0);
        return max;
    }

    @Override
    public void increase_Key(int x, int newKey) throws KeyExeption,SizePlaneExeption,NonexistObjectExeption{
		if(newKey<0){
			throw new KeyExeption("invalid key type");
		}else if(newKey>1000){
			throw new SizePlaneExeption("maximum size reached");
		}

        if(passengers.get(x).compareTo(passengers.get(newKey)) > 0){
            return;
        }
		try{
				Passenger swap1 = passengers.get(0);

			passengers.set(0, passengers.get(newKey));
			passengers.set(newKey, swap1);
			
			
			while(x>0 && passengers.get(parent(x)).compareTo(passengers.get(x))<0){
				Passenger swap = passengers.get(x);

				passengers.set(x, passengers.get(parent(x)));
				passengers.set(parent(x), swap);

				x = parent(x);
			}
		}catch (Exception e){
			throw new NonexistObjectExeption("imposible change");
		}
        
    }

    public Passenger searhPassenger(Passenger p){
        Passenger passenger = null;
        boolean flag = false;
        for (int i = 0; i < passengers.size()&&!flag; i++) {
            if(passenger == passengers.get(i)){
                passenger = passengers.get(i);
                flag = true;
            }
        }

        return passenger;
    }

    private void buildMaxHeap(){
        heapSize = passengers.size();

        for(int i = passengers.size()/2;i>2;i--){
            maxHeapify(i);
        }
    }

    public void maxHeapify( int i){
        int l = left(i);

        int r = right(i);

        int largest;
        if(l<=heapSize && passengers.get(l).compareTo(passengers.get(i)) > 0){
            largest = l;
        }else {
            largest = i;
        }

        if(r<=heapSize && passengers.get(r).compareTo(passengers.get(largest)) > 0){
            largest = r;
        }

        if (largest != i){
            passengers.set(i, passengers.get(largest));
            maxHeapify(largest);
        }

    }

    private int left(int i){
        return 2*i;
    }

    private int right(int i){
        return 2*i+1;
    }

    private int parent(int i){
        return Math.floorDiv(i, 2);
    }

    public String print(){

        String msg = "";
        
        for (int i = 0; i < passengers.size(); i++) {
            msg += passengers.get(i).toString() + "\n";
        }
    
        return msg;
    }

    public int getHeapSize() {
        return heapSize;
    }

    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }

    
}
