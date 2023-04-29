package model;


@SuppressWarnings("unchecked")

public class HashTable<K,V> implements iHashTable<K,V>{
	/**
	 * passengersInfo is the array of nodes that store the passengers
	 */
	private PassengerNode<K,V>[] passengersInfo;
	/**
	 * size is the total amount of spaces occupied in the table
	 */
	private int size;

	//private static final String DELETED = "DELETED";
	/**
	 * constructor method of the class HashTable
	 * @param capacity int, the capacity of the array
	 */
	public HashTable(int capacity) {
		
		this.passengersInfo = new PassengerNode[capacity];
		
		this.size = 0;
	}
	
	/**
	 * method to insert a new passenger in the hashTable 
	 * @param key K, is the k that will store the passenger
	 * @param value V, the value is the passenger that is being stored
	 */
	@Override
	public void insert(K key, V val) {
		
		int position = hashFunction(key);
		
		PassengerNode<K,V> toAdd = new PassengerNode<>(key, val);
		
		if (this.passengersInfo[position] == null) {
			passengersInfo[position] = toAdd;
		}else if(passengersInfo[position] != null && passengersInfo[position].getNext() == null){
			passengersInfo[position].setNext(new PassengerNode<>(key, val));
			toAdd.setPrevious(passengersInfo[position]);
		}else{
			PassengerNode<K,V> pointer = addWhenNode(passengersInfo[position]);
			pointer.setNext(toAdd);
			toAdd.setPrevious(pointer);
		}
		
		size++;


	}

	/**
	 * method to search the last position in the linked list to add a new node
	 * @param pointer PassengerNode, is the initial node where is going to start the search
	 * @return pointer PassengerNode, the node that its next is null
	 */
	private PassengerNode<K,V> addWhenNode(PassengerNode<K,V> pointer){

		if(pointer.getNext() == null){
			return pointer;
		}else{
			return addWhenNode(pointer.getNext());
		}
		
		
		
	}
	

	/**
	 * search: method to search a node by a given key 
	 * @param key K, is the key of the object that is going to be found
	 * @return the value V of the node found
	 */
	@Override
	public V search(K key) {
		
		int position = this.hashFunction(key);
		
		PassengerNode<K,V> toSearch = passengersInfo[position];
		boolean flag = true;
		if (toSearch != null) {
			while(flag){
				if(toSearch.getKey().equals(key)){
					flag = false;
				}

				if(flag){
					toSearch = toSearch.getNext();
					if(toSearch == null){
						flag = false;
					}
				}
			}
		}
		return toSearch == null? null : toSearch.getValue();
    }

	/**
	 * search: method to search a node by a given key 
	 * @param key K, is the key of the object that is going to be found
	 * @return the node that has the same key as the given param
	 */
	private PassengerNode<K,V> search2(K key) {
		
		int position = this.hashFunction(key);
		
		PassengerNode<K,V> toSearch = passengersInfo[position];
		boolean flag = true;
		if (toSearch != null) {
			while(flag){
				if(toSearch.getKey().equals(key)){
					flag = false;
				}

				if(flag){
					toSearch = toSearch.getNext();
					if(toSearch == null){
						flag = false;
					}
				}
			}
		}
		return toSearch;
    }
	
	/**
	 * delete: method to delete a node searched by the given key
	 * @param key K, is the key of the object that it wants to be deleted
	 * @return true if it was deleted or false if it couldn't delete the node
	 */
	@Override
	public boolean delete(K key) {
		
		int position = this.hashFunction(key);
		
		PassengerNode<K,V> toDelete = search2(key);
		
		if(toDelete != null){
			if(toDelete == passengersInfo[position]){
				passengersInfo[position] = toDelete.getNext();
			}else{
				PassengerNode<K,V> toReplace = toDelete.getPrevious();
				toDelete.getNext().setPrevious(toReplace);
				toReplace.setNext(toDelete.getNext());
			}
			size--;
			return true;
		}
		
		return false;
	}
	
	/**
	 * hashFunction to put the object in the position that determine the function itself
	 * @param key K, the key that is going to be trahnsformed in the position of the array
	 * @return the hashCode % passenger.lenthg and the result is the position in the array
	 */
	@Override
	public int hashFunction(K key) {
		int hash = key.hashCode() % 100;
		return hash;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
