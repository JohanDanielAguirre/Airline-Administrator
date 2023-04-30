package model;

public interface iMaxPriorityQueue {
    public void insert(Passenger passenger);    
    public Passenger Maximum();
    public Passenger extract_Max();
    public void increase_Key(int x, int newKey);
}
