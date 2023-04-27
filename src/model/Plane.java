package model;

public class Plane {
    
    private String numFlight;

    private MaxHeap<Long,Passenger> entry;

    private MinHeap exit;

    private HashTable<Long,Passenger> passengers;

    public Plane(String numF, int capacity){
        this.numFlight = numF;
        passengers = new HashTable<>(capacity);
        entry = new MaxHeap<>();
    }
}
