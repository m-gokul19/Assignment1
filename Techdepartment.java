package Assingnments;

public class Techdepartment extends SuperDepartment {
	
	//creating method name "departmentName"
	// override
	public String departmentName()
	{
		return" Tech Department" ;
	}
	
	//creating method name "getTodaysWork"
	
	public String getTodaysWork()
	{
		return "Complete coding of module 1";
	}
	//creating method name"getTechStackInformation"
	
	public String getTechStackInformation()
	{
		return "core Java";
	}
	
	public static void main(String []args) {
	
		//creating object or instance for class superDepartment
		AdminDepartment  obj1=new AdminDepartment ();
		Hrdepartment  obj2=new Hrdepartment();
		Techdepartment obj3=new Techdepartment();
		
		System.out.println("Welcome to "+obj1.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		//
		System.out.println("");
		//
		System.out.println("Welcomeo to "+obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodayDeadline());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		//
		System.out.println();
		//
		System.out.println("Welcome to "+obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj1.isTodayAHoliday());
	}
}