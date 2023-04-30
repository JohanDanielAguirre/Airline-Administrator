package model;

@SuppressWarnings("unchecked")

public class MaxHeap<K extends Comparable<K>,V> implements iMaxPriorityQueue<K,V>{

    private PassengerNode<K,V>[] passengers;
    int heapSize;

    public MaxHeap(int capacity){
        passengers = new PassengerNode[capacity];
    }

    @Override
    public void insert(K key, V val) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public V Maximum() {
        return passengers[0].getValue();
    }

    @Override
    public V extract_Max() {
        if(heapSize < 1){
            return null;
        }

        V max = Maximum();
        
        passengers[0] = passengers[heapSize];

        heapSize = heapSize - 1;

        maxHeapify(0);
        return max;
    }

    @Override
    public K increase_Key(int x, K newKey) {
        
        

        

        return newKey;
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
        if(l<=heapSize && passengers[l].getKey().compareTo(passengers[i].getKey()) > 0){
            largest = l;
        }else {
            largest = i;
        }

        if(r<=heapSize && passengers[r].getKey().compareTo(passengers[largest].getKey()) > 0){
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
