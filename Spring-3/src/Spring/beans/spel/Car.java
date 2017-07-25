package Spring.beans.spel;

public class Car {

	private String brand;
	private double price;
	
	private double tyre;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTyre() {
		return tyre;
	}

	public void setTyre(double tyre) {
		this.tyre = tyre;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyre=" + tyre + "]";
	}
	
	
}
