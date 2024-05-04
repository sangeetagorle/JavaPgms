import java.util.*;
public class StudentApp{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student student=new Student();
		student.setId(scan.nextInt());
		student.setName(scan.next());
		student.setMarks(scan.nextInt());
		student.setGender(scan.next());
		
		System.out.println(student.getId()+" "+student.getName()+" "+student.getMarks()+" "+student.getGender());
	
		Student student1=new Student();
		student1.setId(scan.nextInt());
		student1.setName(scan.next());
		student1.setMarks(scan.nextInt());
		student1.setGender(scan.next());
		
		System.out.println(student1.getId()+" "+student1.getName()+" "+student1.getMarks()+" "+student1.getGender());
	}
	
}