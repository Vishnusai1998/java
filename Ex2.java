import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ex2
{
	public static void main(String[] args)
	 {
		System.out.println("enter your employee details");
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your employee name");
		String name= obj.next();
		System.out.println("enter your employee Day of birth");
		int day=obj.nextInt();
		System.out.println("enter your employee month of birth");
		int mon=obj.nextInt();
		System.out.println("enter your employee year of birth");
		int year=obj.nextInt();
		System.out.println("enter your employee monthly salary");
		String sal=obj.next();
		System.out.println("employee name:- "+ name);
		System.out.println("employee Day of birth:- " + day);
		System.out.println("employee month of birth:-"+ mon);
		System.out.println("employee year of birth:-" + year);
		System.out.println("employee monthly salary:-" + sal);
		switch(sal)
		{
			case "2l": System.out.println("your tax is 5%"); break;
			case "3l": System.out.println("your tax is 10%"); break;
			case "4l": System.out.println("your tax is 15%"); break;
			case "5l": System.out.println("your tax is 20%"); break;
			default : System.out.println("invalid salary tax");
		}
	 
			
	}
}