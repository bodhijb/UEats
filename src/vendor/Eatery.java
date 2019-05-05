package vendor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;

public class Eatery {
	
	private String name;
	private HashSet<String> tags;
	HashMap<String, Double> menu;
		
	
	public Eatery(String name) {
		this.name = name;

	}
		
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public HashSet<String> getTags() {
		return tags;
	}



	public void addTags(String... addThese) {
		for(String tag: addThese) {
		tags.add(tag.toLowerCase());
		}
	}



	public HashMap<String, Double> getMenu() {
		return menu;
	}



	public void setMenu(HashMap<String, Double> menuItems) {
		this.menu = menuItems;
	}
	
	public void addMenuItem(String item, Double price) {
		getMenu().put(item, price);
	}




	

	
	

}
