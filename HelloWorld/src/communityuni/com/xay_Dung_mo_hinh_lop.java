package communityuni.com;
import java.util.ArrayList;
public class xay_Dung_mo_hinh_lop {
	private ArrayList<StaffMember> staffList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	//StaffMember
	public abstract class StaffMember {
	    protected String name;
	    protected String address;
	    protected String phone;

	    
	    
	}
	//Volunteer
	public class Volunteer extends StaffMember
	{
		
	}
	// Employee
	public class Employee extends StaffMember {
	    protected String socialSecurityNumber;
	    protected double payRate;
	}
	//Executive
	public class Executive extends Employee {
	    private double bonus;
	}
	//Hourly
	public class Hourly extends Employee {
	    private int hoursWorked;
	}
	

	

}
