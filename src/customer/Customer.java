package customer;

import app.UberApp;

public class Customer {
	
	private String username;
	private Integer account;
	private UberApp app = new UberApp();
	
	
	private Customer(String username) {
		this.username = username;
		
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Integer getAccount() {
		return account;
	}


	public void setAccount(Integer account) {
		this.account = account;
	}


	public UberApp getApp() {
		return app;
	}
	
	
	
	
	
	
	
	
	


}
