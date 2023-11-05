package Assingnments;

public class AdminDepartment extends SuperDepartment{
	
	//creating method using departmentaname
	// override the method
	public String departmentName()
	{
		return"Admin Department";
	}
	
	//creating method using method name getTodaysWork
	// override the method
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}
	
	//creating method using method name getWorkDeadline
	// override the method
	public String getWorkDeadline()
	{
		return "complete by EOD";
	}

}

