package customer;

import java.util.HashSet;

import app.UberApp;

public class Customer {

	private String username;
	private Integer accountNo;
	private UberApp app = new UberApp();
	
	
	
	public Customer(String username, Integer accountNo, UberApp app) {
		super();
		this.username = username;
		this.accountNo = accountNo;
		this.app = app;
	}
	
	

	public Customer() {
		super();
	}



	public void customerOrder() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAccount() {
		return accountNo;
	}

	public void setAccount(Integer account) {
		this.accountNo = account;
	}

	public UberApp getApp() {
		return app;
	}

}
