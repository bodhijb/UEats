package app;

import java.util.HashSet;

import customer.Customer;
import vendor.FoodVendor;

public class UberApp {
		
	private Customer customer;
	private FoodVendor vendor; 
	private Basket basket;
	private Delivery delivery;
	private static HashSet<FoodVendor> vendors = new HashSet<>();
	private static HashSet<Customer> customers = new HashSet<>();


	public UberApp(String appCustomer, String appEatery, String appBasket, String appDelivery) {
		super();
		this.customer = new Customer();
		this.vendor = new FoodVendor();
		this.basket = new Basket();
		this.delivery = new Delivery();
	}
	
	public UberApp() {
		
	}


	public static void main(String[] args) {

		System.out.println("Hello Uber");
		
		




	}
	
	
	public void makeAnOrder(FoodVendor eatery) {
		basket.basketOrder(eatery);
		
	}
	
	
	public void addNewEatery(FoodVendor restaurant) {
		if(!vendors.contains(restaurant)) {
			vendors.add(restaurant);
			System.out.println("Eatery added");
		} 
	}
	


	public HashSet<FoodVendor> seachByTags(String... theseTypes) {
		HashSet<FoodVendor> set = new HashSet<>();
		one: for(FoodVendor eatery: vendors) {
			two: for(String tag: theseTypes) {
				if(eatery.getTags().contains(tag.toLowerCase())) {
					set.add(eatery);
					continue one;
				}
			}
		}
		System.out.println("Set being returned");
		return set;
	}
















}
