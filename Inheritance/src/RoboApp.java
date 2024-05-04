
public class RoboApp {

	public static void main(String[] args) {
		TeacherRobo tr=new TeacherRobo();
		tr.name="Chitti";
		tr.type="Humanoid";
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();
		
		ChefRobo cr=new ChefRobo();
		cr.name="mitti";
		cr.type="AndroidBrainoid";
		cr.talk();
		cr.walk();
		cr.charge();
		cr.cooking();
		
		DriverRobo dr=new DriverRobo();
		dr.name="Wells Smith";
		dr.type="Humanfienoid";
		dr.talk();
		dr.walk();
		dr.charge();
		dr.drive();

	}

}
