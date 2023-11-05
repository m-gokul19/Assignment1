package com.gradedproject.q2;

public class Power {
	
	
	public static int powerOfValue(int x,int n)
	{
		//condition to stop recursion
		if(n==0) 
		{
		return 1;
		}
		else//recursion.check  again & again until find powerofvalue(2,0)
		{
			// in return multilplicating the power value 2*2...........
			return x*powerOfValue(x,n-1);
		}
	}

	public static void main(String[] args) {
		
        //Declaration value
		//passing agruments
		int result=powerOfValue(2,10);
		System.out.println(result);

	}

}
