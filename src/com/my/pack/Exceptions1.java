package com.my.pack;

public class Exceptions1 
{
	
	public static void main(String[] args)
	{
		try {
			float num=5/0;
			System.out.println(num);
		} 
		catch(ArithmeticException a)
		{
			System.out.println("arthemtic exp");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	/*	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at com.my.pack.Exceptions1.main(Exceptions1.java:8)*/
	}
}
		
		/*}
		try
		{
			//badMethod();
			System.out.print("A");
		}
		catch(Exception e)
		{
			System.out.print("B");  //B
			
		}
		finally
		{
			System.out.print("C"); //c
		}
		System.out.print("D");//D
		
	}
	public static void badMethod()
	{
		throw new RuntimeException();
	}*/
	



//BC or BCD
