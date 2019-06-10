package app;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import vendor.FoodVendor;
import vendor.MenuItem;


public class Basket<MenuItem, Integer> implements Map<MenuItem, Integer>{
	
	private MenuItem key;
	private Integer value;
	private Scanner scan = new Scanner(System.in);
	
	
	

	public Basket() {
		super();
	}


	public void basketOrder(FoodVendor eatery) {		
		
		
		
	}


	@Override
	public int size() {
		return this.size();
	}


	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}


	@Override
	public boolean containsKey(Object key) {
		MenuItem item = (MenuItem)key;
		return this.containsKey(item);
	}


	@Override
	public boolean containsValue(Object value) {
		Integer quantity = (Integer)value;
		return this.containsValue(quantity);
	}


	@Override
	public Integer get(Object key) {
		MenuItem menuKey = (MenuItem)key;
		return this.get(menuKey);
	}


	@Override
	public Integer put(MenuItem key, Integer value) {
		if(this.containsKey(key)) {
			Integer oldValue = this.get(key);
			this.put(key, value);
			return oldValue;
		}
		else {
			this.put(key, value);
			return null;
		}		
	}


	@Override
	public Integer remove(Object key) {
		MenuItem menuKey = (MenuItem)key;
		if(this.containsKey(menuKey)) {
			Integer value = this.get(menuKey);
			this.remove(menuKey);
			return value;
		}
		else {
			return null;
		}
		
	}


	@Override
	public void putAll(Map<? extends MenuItem, ? extends Integer> m) {
		for(MenuItem item : m.keySet()) {
			this.put(item, m.get(item));
		}		
	}


	@Override
	public void clear() {
		this.clear();
		
	}


	@Override
	public Set<MenuItem> keySet() {
		return this.keySet();
	}


	@Override
	public Collection<Integer> values() {
		return this.values();

	}


	@Override
	public Set<Entry<MenuItem, Integer>> entrySet() {
		return this.entrySet();
	}
	
	
	

}
