package model;


public class PassengerNode<K,V>{

    private K key;

    private V value;

    private PassengerNode<K,V> next;

    public PassengerNode(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public PassengerNode<K, V> getNext() {
        return next;
    }

    public void setNext(PassengerNode<K, V> next) {
        this.next = next;
    }
}