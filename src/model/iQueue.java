package model;

import Exeptions.DuplicatedObjectExeption;

public interface iQueue<K, V> {
    public int size();

    public boolean isEmpty();

    public void add(PassengerNode<K, V> passenger) throws DuplicatedObjectExeption;

    public V poll();
}