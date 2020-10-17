import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Ex3
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
	 	int sum=0;
	 	for (int i=0;i<n;i++ )
	 	 {
	 		sum=sum+arr[i];
	 	}
	 	System.out.println("sum of array " + sum);
		
	}
}