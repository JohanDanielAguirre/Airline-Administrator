package model;

import java.util.LinkedList;

public class HashTable<K,V> implements iHashTable<K,V>{
	
	private PassengerNode<K,V>[] passengersInfo;
	
	private int size;

	private static final String DELETED = "DELETED";
	
	public HashTable(int capacity) {
		
		this.passengersInfo = new PassengerNode[capacity];
		
		this.size = 0;
	}
	
	@Override
	public void insert(K key, V val,PassengerNode<K,V> pointer) {
		
		int position = this.hashFunction(key);
		
		
		if (this.passengersInfo[position] == null) {
			this.passengersInfo[position] = new PassengerNode<>(key, val);
		
		}else if(pointer != null && passengersInfo[position] != null && passengersInfo[position].getNext() == null){
			pointer.setNext(new PassengerNode<>(key, val));
		}else{
			pointer = passengersInfo[position];
			insert(key, val,pointer.getNext());
		} 


	}
	
	@Override
	public V search(K key) {
		
		int position = this.hashFunction(key);
		
		if (this.passengersInfo[position] != null) {
			for (int i = 0;i<passengersInfo.length;i++) {
				if (passengersInfo[i].getKey().equals(key)) {
					// If we find the element, return its value
					return passengersInfo[i].getValue();
				}
			}
		}
		return null;
    }
	
	@Override
	public boolean delete(K key) {
		
		int position = this.hashFunction(key);
		
		if (this.passengersInfo[position] != null) {
			for (int i = 0;i<passengersInfo.length;i++) {
				if (passengersInfo[i].getKey().equals(key)) {
					// If we find the element, remove it from the list and update the size
					this.passengersInfo[position].remove(passengersInfo[i]);
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
