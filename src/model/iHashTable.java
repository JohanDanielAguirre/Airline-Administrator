package model;

public interface iHashTable<K,V> {
    
    public void insert(K key,V val);
    public V search(K key);
    public boolean delete(K key);
    public K hashFunction(K id);
}
