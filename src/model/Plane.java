package model;

import Exeptions.DuplicatedObjectExeption;
import Exeptions.IncorrectObjectExeption;
import Exeptions.NonexistObjectExeption;
import Exeptions.SizePlaneExeption;

public class Plane {
    
    private String numFlight;

    private MaxHeap entry;

    private HashTable<String,Passenger> passengers;

    private int rows;

    private int columns;

    private int firstClassRows;

    public Plane(String numF, int rows, int columns, int firstClassRows){
        this.numFlight = numF;
        passengers = new HashTable<>(1001);
        entry = new MaxHeap(rows*columns);
        this.rows = rows;
        this.columns = columns;
        this.firstClassRows = firstClassRows;
    }

    public String getNumFlight() {
        return numFlight;
    }

    public void setNumFlight(String numFlight) {
        this.numFlight = numFlight;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getFirstClassRows() {
        return firstClassRows;
    }

    public void setFirstClassRows(int firstClassRows) {
        this.firstClassRows = firstClassRows;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "numFlight=" + numFlight + '\'' +
                ", entry=" + entry +
                ", passengers=" + passengers +
                ", rows=" + rows +
                ", columns=" + columns +
                '}';
    }

    public MaxHeap getEntry() {
        return entry;
    }

    public void fillPassengers() throws IncorrectObjectExeption, DuplicatedObjectExeption, NonexistObjectExeption {
        for(int i = 0; i<rows*columns;i++){
            Passenger passenger = entry.Maximum();
            try {
                passengers.insert(passenger.getTicket(), passenger);
            } catch (DuplicatedObjectExeption | IncorrectObjectExeption | NonexistObjectExeption e) {
                e.printStackTrace();
            }
        }
    }
}
