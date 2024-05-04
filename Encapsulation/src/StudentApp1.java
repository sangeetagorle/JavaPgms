import java.util.Scanner;

public class StudentApp1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student1 student1=new Student1(1,"Raj",89,"male");
		System.out.println(student1.id());
		System.out.println(student1.name());
	}

}
