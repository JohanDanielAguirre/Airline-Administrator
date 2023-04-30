package model;

public interface iQueue<K, V> {
    public int size();

    public boolean isEmpty();

    public void add(PassengerNode<K, V> passenger);

    public V poll();
}