
public class Bicycle {
	String brand;
	String model;
	int year;
	int gearcount;
	String color;
	int price;
	int seats;
	String frameType;
	int weight;
	int wheelsize;
	
	public Bicycle(String brand, String model, int year, int gearcount, String color, int price, int seats,
			String frameType, int weight, int wheelsize) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.gearcount = gearcount;
		this.color = color;
		this.price = price;
		this.seats = seats;
		this.frameType = frameType;
		this.weight = weight;
		this.wheelsize = wheelsize;
	}
	
	void ride()
	{
		System.out.println("I am riding a" +brand+ " "+model+" "+"bicycle");
	}
	void changeGear()
	{
		System.out.println("changing a gear which has" +gearcount+ " "+"number of gears" );
	}


}
