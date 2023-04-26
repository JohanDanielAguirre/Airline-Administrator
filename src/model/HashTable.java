package model;

import java.util.LinkedList;

public class HashTable<K,V> implements iHashTable<K,V>{
	
	private LinkedList<PassengerNode<K,V>>[] passengersInfo;
	
	private int size;
	
	public HashTable(int capacity) {
		
		this.passengersInfo = new LinkedList[capacity];
		
		this.size = 0;
	}
	
	@Override
	public void insert(K key, V val) {
		
		int position = this.hashFunction(key);
		
		if (this.passengersInfo[position] == null) {
			this.passengersInfo[position] = new LinkedList<>();
		}
		
		this.passengersInfo[position].add(new PassengerNode<>(key, val));
		this.size++;
	}
	
	@Override
	public V search(K key) {
		
		int position = this.hashFunction(key);
		
		if (this.passengersInfo[position] != null) {
			for (PassengerNode<K,V> cube : this.passengersInfo[position]) {
				if (cube.getKey().equals(key)) {
					// If we find the element, return its value
					return cube.getValue();
				}
			}
		}
		return null;
    }
	
	@Override
	public boolean delete(K key) {
		
		int position = this.hashFunction(key);
		
		if (this.passengersInfo[position] != null) {
			for (PassengerNode<K,V> cube : this.passengersInfo[position]) {
				if (cube.getKey().equals(key)) {
					// If we find the element, remove it from the list and update the size
					this.passengersInfo[position].remove(cube);
					this.size--;
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public int hashFunction(K key) {
		int hash = key.hashCode() % this.passengersInfo.length;
		return hash;
	}
}
