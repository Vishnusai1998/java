import java.io.*;
import java.util.*;
import java.lang.*;
class Employee
{
	
	void fun(String name,String city,int age)
	{

	System.out.println("The name is " + name);
	System.out.println("The age is  " + age);
	System.out.println("The city is " + city);
	}
public static void main(String[] arr)
{
 Employee obj1=new Employee();
 obj1.fun("vishnusai", "Nellore", 21);
 Employee obj2=new Employee();
 obj2.fun("Shurib","chennai",23);
 
}}