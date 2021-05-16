package xxx;

public abstract class Pen {
	
	private String brand;
	private double price;
	
	public Pen() {
		
	}
	
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	
	
	
	public abstract void write();
}
