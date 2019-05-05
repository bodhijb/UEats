package app;

import java.util.HashSet;
import customer.Customer;
import vendor.Eatery;

public class UberApp {
	
	private static HashSet<Customer> customers = new HashSet<>();;
	private static HashSet<Eatery> eateries = new HashSet<>();
	
	
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	
	public void newCustomer(Customer customer) {		
		if(!customers.contains(customer)) {
			customers.add(customer);
			System.out.println("Customer added");
		} else {
			System.out.println("Customer already exists");			
		}
	}
	
	public void newVendor(Eatery restaurant) {		
		if(!eateries.contains(restaurant)) {
			eateries.add(restaurant);
			System.out.println("Eatery added");
		} else {
			System.out.println("Eatery already exists");			
		}	
		
	}
	
	public HashSet<Eatery> seachByTags(String... theseTypes) {
		HashSet<Eatery> set = new HashSet<>();
		one: for(Eatery eatery: eateries) {
			two: for(String tag: theseTypes) {
				if(eatery.getTags().contains(tag.toLowerCase())) {
					set.add(eatery);
					continue one;
				}
			}
		}
		return set;		
	}
	

	
	
	
	
	
	
	
	
	
	
	

}
