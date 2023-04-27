package model;

public interface iHashTable<K,V> {
    
    public void insert(K key,V val,PassengerNode<K,V> pointer);
    public V search(K key);
    public boolean delete(K key);
    public int hashFunction(K id);
}
