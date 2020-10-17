import java.io.*;
import java.lang.*;
import java.util.*;
class Avenger
{
	void getdetails()
	{
		System.out.println("");
	}
	void getinformation(String arr[])
	{
		
		for (int i=0;i<5;i++ )
		 {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)throws Exception
	 {
	 	System.out.println("enter your details  \n name \n age \n power \n weapon \n planet");
	 	System.out.println("----------------------------------------------------------------");
	 	String arr[]=new String[5];
	 	Scanner obj=new Scanner (System.in);
	 	for (int i=0;i<5;i++ ) 
	 	{
	 		arr[i]=obj.next();
	 	}
	 		
	 	Avenger a1=new Avenger();
	 	Avenger a2=new Avenger();
	 	a1.getdetails();
	 	a2.getinformation(arr);
	 }
}