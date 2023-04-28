package model;


@SuppressWarnings("unchecked")

public class HashTable<K,V> implements iHashTable<K,V>{
	
	private PassengerNode<K,V>[] passengersInfo;
	
	private int size;

	//private static final String DELETED = "DELETED";
	
	public HashTable(int capacity) {
		
		this.passengersInfo = new PassengerNode[capacity];
		
		this.size = 0;
	}
	
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

	private PassengerNode<K,V> addWhenNode(PassengerNode<K,V> pointer){

		if(pointer.getNext() == null){
			return pointer;
		}else{
			return addWhenNode(pointer.getNext());
		}
		
		
		
	}
	
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
	
	@Override
	public int hashFunction(K key) {
		int hash = key.hashCode() % this.passengersInfo.length;
		return hash;
	}
}
