package Assingnments;

public class Hrdepartment extends SuperDepartment {
	
	//creating method using depatmentName
	//override
	public String departmentName()
	{
		return"Hr Department" ;
	}
	
	//creating method using getTodaysWork
	//override
	
	public String getTodaysWork()
	{
		return"Complete your documents Submission";
	}

	//creating method using getTodayDeadline
	//override
	public String getTodayDeadline()
	{
		return "Fill today’s timesheet and mark your attendance";
	}
	//creating method using doActivity
	public String doActivity()
	{
		return"Team Lunch" ;
	}
	//

}
