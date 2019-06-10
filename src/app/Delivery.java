package app;

public class Delivery {
	
	private String name;
	private Point address;
	private Point currentLocation;
	
	class Point {
		int x;
		int y;
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		
		
		
		
	}

	public Delivery(String name, Point address, Point currentLocation) {
		super();
		this.name = name;
		this.address = address;
		this.currentLocation = currentLocation;
	}
	
	

	public Delivery() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point getAddress() {
		return address;
	}

	public void setAddress(Point address) {
		this.address = address;
	}

	public Point getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Point currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	
	
	

	
	

}
