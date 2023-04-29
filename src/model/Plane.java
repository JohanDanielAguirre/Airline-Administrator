package model;

public class Plane {
    
    private String numFlight;

    private MaxHeap<Long,Passenger> entry;

    private HashTable<Long,Passenger> passengers;

    private int rows;

    private int columns;

    public Plane(String numF, int rows, int columns){
        this.numFlight = numF;
        passengers = new HashTable<>(rows*columns);
        entry = new MaxHeap<>();
        this.rows = rows;
        this.columns = columns;
        this.entry = new MaxHeap<>();
    }

}
