package model;

public class Queue<K, V> implements iQueue<K,V>{
    private PassengerNode<K,V> head;
    private PassengerNode<K,V> tail;
    private int size;

    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(PassengerNode<K,V> passenger) {
        if (isEmpty()) {
            head = passenger;
            tail = passenger;
        } else {
            tail.setNext(passenger);
            tail = passenger;
        }
        size++;
        return;
    }

    public V poll() {
        if (isEmpty()) {
            return null;
        } else {
            V data = head.getValue();
            head = head.getNext();
            size--;
            if (isEmpty()) {
                tail = null;
            }
            return data;
        }
    }
}
