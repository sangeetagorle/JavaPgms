
public class Smartphone {
	String brand;
	String model;
	String os;
	int price;
	int ram;
	int storage;
	String color;
	String sim;
	int battery;
	int camera_px;
	
	public Smartphone(String brand, String model, String os, int price, int ram, int storage, String color, String sim,
			int battery, int camera_px) {
		super();
		this.brand = brand;
		this.model = model;
		this.os = os;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
		this.color = color;
		this.sim = sim;
		this.battery = battery;
		this.camera_px = camera_px;
	}
	
	void makeCall() {
		System.out.println("Dial number from"+ brand+" "+ model+ " " +"phone which has"+" "+sim+" "+"SIM Card" );
	}
	
	void sendText() {
		System.out.println("Send text from"+" " +sim+" "+"number");
	}
	
	void captureImage() {
		System.out.println(brand+" "+model+" "+ "has"+" "+camera_px+" "+ "pixel camera clicks a good picture" );
	}

}
