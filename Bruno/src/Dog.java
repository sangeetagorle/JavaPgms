public class Dog {
	String name;
	int age;
	String breed;
	String color;
	
	void eat() 
	{
		System.out.println(name+" Dog is Eating");
	}
	void sleep() 
	{
		System.out.println(name+" " +color+" coloured  Dog is Sleeping ");
	}
	void bark() 
	{
		System.out.println("Angry " +name+" " +color+" coloured  Dog which is aged " +age+ "years dog is barking");
	}
	//Constructors
	public Dog() {
		name="lobo";
		breed="bull dog";
		age=5;
		color="brown";
	}
	public Dog(String a) {
		name=a;
		breed="GS";
		age=4;
		color="black";
	}
	public Dog(String a,String b) {
		name=a;
		breed=b;
		age=6;
		color="Golden";
	}
	public Dog(String a,String b,int c) {
		name=a;
		breed=b;
		age=c;
		color="white";
	}
	public Dog(String a,String b,int c,String d) {
		name=a;
		breed=b;
		age=c;
		color=d;
	}
	public Dog(String a,int c,String d) {
		name=a;
		breed="Pomerian";
		age=c;
		color=d;
	}
	public Dog(String a,String b,String d) {
		name=a;
		breed=b;
		age=9;
		color=d;
	}
	public Dog(String b,int c) {
		name="zoozo";
		breed=b;
		age=c;
		color="white";
	}

}
