package model;

import Exeptions.DuplicatedObjectExeption;
import Exeptions.IncorrectObjectExeption;
import Exeptions.NonexistObjectExeption;

public interface iHashTable<K,V> {
    
    public void insert(K key,V val) throws DuplicatedObjectExeption, IncorrectObjectExeption, NonexistObjectExeption;
    public V search(K key) throws IncorrectObjectExeption;
    public boolean delete(K key) throws IncorrectObjectExeption;
    public int hashFunction(K id);
}
