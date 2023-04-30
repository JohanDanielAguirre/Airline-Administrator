package model;

public interface iMaxPriorityQueue<K,V> {
    public void insert(K key, V val);    
    public V Maximum();
    public V extract_Max();
    public K increase_Key(int x, K newKey);
}
