package com.datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Map<V, K> {

	protected int size;
	private final int DEFAULT_INITIALCAPACITY = 16;

	Entry<K, V>[] map = new Entry[DEFAULT_INITIALCAPACITY];

	public void add(K key, V value) {
		boolean insert = true;
		for (int i = 0; i < map.length; i++) {
			if (map[i].getKey() != null) {
				if (map[i].getKey().equals(key)) {
					map[i].setValues(value);
					insert = false;
				}
			}
		}
		if (insert) {
			ensureCapacity();
			map[size++] = new Entry<K, V>(key, value);
		}
	}

	private void ensureCapacity() {
		int newSize = 0;
		if (size == map.length) {
			newSize = map.length * 2;
			map = Arrays.copyOf(map, newSize);
		}

	}

	public V get(K key) {
		for (int i = 0; i < map.length; i++) {
			if(map[i].getKey()!=null){
				if(map[i].getKey().equals(key)){
					return map[i].getValues();
				}
			}
		}
		return null;

	}
	
	public void remove(K key){
		for(int i=0;i<size;i++){
			if(map[i].getKey()!=null){
				if(map[i].getKey().equals(key))
					map[i]=null;
				size--;
				condenseArray();
			}
		}
	}

	private void condenseArray() {
		Set<K> set= new HashSet<K>();
		for(int i=0;i<size;i++){
			set.add(map[i].getKey());
		}
		
	}

}

class Entry<K, V> {

	private final K key;
	private V values;

	Entry(K k, V v) {
		this.key = k;
		this.values = v;

	}

	public V getValues() {
		return values;
	}

	public void setValues(V values) {
		this.values = values;
	}

	public K getKey() {
		return key;
	}

}
