import java.util.*;
public class SmartphoneApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Brand");
		String brand=scan.nextLine(); 
		
		System.out.println("Enter Model");
		String model=scan.nextLine(); 
		
		System.out.println("Enter Operating System");
		String os=scan.nextLine(); 
		
		System.out.println("Enter Price");
		int price=scan.nextInt(); 
		
		System.out.println("Enter RAM");
		int ram=scan.nextInt(); 
		
		System.out.println("Enter Storage");
		int storage=scan.nextInt();
		
		System.out.println("Enter Color");
		scan.nextLine();
		String color=scan.nextLine(); 
		
		System.out.println("Enter SIM");
		String sim=scan.nextLine(); 
		
		System.out.println("Enter Battery backup");
		int battery=scan.nextInt();
		
		System.out.println("Enter Camera pixel");
		int camera_px=scan.nextInt();
		
		Smartphone s=new Smartphone(brand,model,os,price,ram,storage,color,sim,battery,camera_px);
		System.out.println(s.brand+" "+s.model+" "+s.os+" "+s.price+" "+s.ram+" "+s.storage+" "+s.color+" "+s.sim+" "+s.battery+" "+s.camera_px);
		s.makeCall();
		s.sendText();
		s.captureImage();
		
		
		

	}

}
