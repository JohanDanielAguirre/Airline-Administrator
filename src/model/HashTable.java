package model;

import java.util.LinkedList;

public class HashTable<K,V> implements iHashTable<K,V>{
	// An array to store the lists of elements in the table
	private LinkedList<Cube<K,V>>[] table;
	// The number of elements in the table
	private int size;
	// Constructor to create a table with a specific size
	public HashTable(int capacity) {
		// Create an empty array of lists
		this.table = new LinkedList[capacity];
		// Initialize the size to zero
		this.size = 0;
	}
	// Method to insert an element into the table
	@Override
	public void insert(K key, V val) {
		// Get the position in the table for the key
		int position = this.hashFunction(key);
		// If the list at that position is empty, create a new list
		if (this.table[position] == null) {
			this.table[position] = new LinkedList<>();
		}
		// Add the element to the corresponding list
		this.table[position].add(new Cube<>(key, val));
		this.size++;
	}
	// Method to search for an element in the table
	@Override
	public V search(K key) {
		// Get the position in the table for the key
		int position = this.hashFunction(key);
		// Search for the element in the list at that position
		if (this.table[position] != null) {
			for (Cube<K,V> cube : this.table[position]) {
				if (cube.getKey().equals(key)) {
					// If we find the element, return its value
					return cube.getValue();
				}
			}
		}
		// If we don't find the element, return null
		return null;
	}
	// Method to delete an element from the table
	@Override
	public boolean delete(K key) {
		// Get the position in the table for the key
		int position = this.hashFunction(key);
		// Search for the element in the list at that position
		if (this.table[position] != null) {
			for (Cube<K,V> cube : this.table[position]) {
				if (cube.getKey().equals(key)) {
					// If we find the element, remove it from the list and update the size
					this.table[position].remove(cube);
					this.size--;
					return true;
				}
			}
		}
		// If we don't find the element, return false
		return false;
	}
	// Method to calculate the position in the table for a key
	@Override
	public K hashFunction(K key) {
		// This implementation simply returns the hashcode of the key modulo the size of the table
		int hash = key.hashCode() % this.table.length;
		return (K) Integer.valueOf(hash);
	}
}
