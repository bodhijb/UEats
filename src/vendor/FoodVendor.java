package vendor;

import java.util.HashSet;

public class FoodVendor {
	
	private String name;
	private HashSet<MenuItem> menu;
	private HashSet<String> tags;

	
	public FoodVendor(String name, HashSet<MenuItem> menu, HashSet<String> tags) {
		super();
		this.name = name;
		this.menu = menu;
		this.tags = tags;
	}
	
	
	public FoodVendor() {
		super();
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public HashSet<String> getTags() {
		return this.tags;
	}



	public void addTags(String... addThese) {
		for(String tag: addThese) {
		this.tags.add(tag.toLowerCase());
		}
	}



	public HashSet<MenuItem> getMenu() {
		return this.menu;
	}



	public void setMenu(HashSet<MenuItem> menuItems) {
		this.menu = menuItems;
	}
	
	public void addMenuItem(String item, Double price) {
		getMenu().add(new MenuItem(item, price));
	}



}
