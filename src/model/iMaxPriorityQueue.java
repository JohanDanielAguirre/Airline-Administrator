package model;

import Exeptions.KeyExeption;
import Exeptions.NonexistObjectExeption;
import Exeptions.SizePlaneExeption;

public interface iMaxPriorityQueue {
    public void insert(Passenger passenger) throws SizePlaneExeption, KeyExeption, NonexistObjectExeption;    
    public Passenger Maximum() throws Exception;
    public Passenger extract_Max();
    public void increase_Key(int x, int newKey) throws KeyExeption, SizePlaneExeption, NonexistObjectExeption;
}
