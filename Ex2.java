import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Ex2
{
	public static void main(String[] args)throws Exception
	 {
	System.out.println("enter size of array");
	 	Scanner obj=new Scanner (System.in);
	 	int n=obj.nextInt();
	 	System.out.println("enter elements into array");
	 	int arr[]=new int[n];
	 	for (int i=0;i<n ;i++ )
	 	 {
	 		arr[i]=obj.nextInt();
	 	}
	 	System.out.println("odd numbers");
	 	for (int i=0;i<n ;i++ )
	 	 {
	 		if(arr[i]%2!=0)
	 		{
	 			System.out.print(arr[i]);
	 		}	
	 	 }	
	}
}