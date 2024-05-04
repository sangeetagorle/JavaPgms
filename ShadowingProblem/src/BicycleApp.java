import java.util.*;
public class BicycleApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Brand");
	String brand=scan.nextLine();
	
	System.out.println("Enter Model");
	String model=scan.nextLine(); 
	
	System.out.println("Enter Year");
	int year=scan.nextInt();
	
	System.out.println("Enter number of gears");
	int gearcount=scan.nextInt();
	
	System.out.println("Enter Color");
	scan.nextLine();
	String color=scan.nextLine();
	
	System.out.println("Enter Price");
	int price=scan.nextInt();
	
	System.out.println("Enter number of seats");
	int seats=scan.nextInt();
	
	System.out.println("Enter type of frame");
	scan.nextLine();
	String frameType=scan.nextLine();
	
	System.out.println("Enter weight of bicycle");
	int weight=scan.nextInt();
	
	System.out.println("Enter the Wheel Size");
	int wheelsize=scan.nextInt();
	
	Bicycle b=new Bicycle(brand,model,year,gearcount,color,price,seats,frameType,weight,wheelsize);
	System.out.println(b.brand+" "+b.model+" "+b.year+" "+b.gearcount+" "+b.color+" "+b.price+" "+b.seats+" "+b.frameType+" "+b.weight+" "+b.wheelsize);
	b.ride();
	b.changeGear();
	
	
	

	}

}
