package model;


public class MaxHeap implements iMaxPriorityQueue{

    private Passenger[] passengers;
    int heapSize;

    public MaxHeap(int capacity){
        passengers = new Passenger[capacity];
    }

    @Override
    public void insert(Passenger passenger) {
        heapSize = heapSize + 1;
        passengers[heapSize] = passenger; 
    }

    @Override
    public Passenger Maximum() {
        return passengers[0];
    }

    @Override
    public Passenger extract_Max() {
        if(heapSize < 1){
            return null;
        }

        Passenger max = Maximum();
        
        passengers[0] = passengers[heapSize];

        heapSize = heapSize - 1;

        maxHeapify(0);
        return max;
    }

    @Override
    public void increase_Key(int x, int newKey) {
       
        if(passengers[x].getPriority() > newKey){
            return;
        }

        passengers[0].setPriority(newKey);
        
        
        while(x>0 && passengers[parent(x)].getPriority()<passengers[x].getPriority()){
            Passenger swap = passengers[x];

            passengers[x] = passengers[parent(x)];
            passengers[parent(x)] = swap;

            x = parent(x);
        }

    }

    private void buildMaxHeap(){
        heapSize = passengers.length;

        for(int i = passengers.length/2;i>2;i--){
            maxHeapify(i);
        }
    }

    public void maxHeapify( int i){
        int l = left(i);

        int r = right(i);

        int largest;
        if(l<=heapSize && passengers[l].getPriority() > passengers[i].getPriority()){
            largest = l;
        }else {
            largest = i;
        }

        if(r<=heapSize && passengers[r].getPriority() > passengers[largest].getPriority()){
            largest = r;
        }

        if (largest != i){
            passengers[i] = passengers[largest];
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
    
}
