import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Ex1
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("enter your marks");
		/*Scanner obj=new Scanner(System.in);
		System.out.println("enter your sub1 marks");
		int sub1=obj.nextInt();
		System.out.println("enter your sub2 marks");
		int sub2=obj.nextInt();
		System.out.println("enter your sub3 marks");
		int sub3=obj.nextInt();
		System.out.println("enter your sub4 marks");
		int sub4=obj.nextInt();
		System.out.println("enter your sub5 marks");
		int sub5=obj.nextInt();
		int tot=0;
		float per=0;*/
		int  marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("failed");
        }
    }
		/*if((sub1>=35 && sub1<=100) && (sub2>=35 && sub2<=100) && (sub3>=35 && sub3<=100) && (sub4>=35 && sub4<=100) && (sub5>=35 && sub5<=100))
		{
			tot=tot+sub1+sub2+sub3+sub4+sub5;
			System.out.println("total is" + tot);
			per=(int)((tot/600)*100);
		}	

		     if (per>=85 && per<=100)
		     	System.out.println("A grade ");
		     else if(per>=70 && per<85)
		     	System.out.println("B grade");
		     else if(per>=55 && per<70)
		     	System.out.println("C grade");
		     else if (per>40 && per<55)
		     	System.out.println("D grade");
		     else if(per>=35 && per<40)
		     	System.out.println("E grade");
		     else 
		     	System.out.println("failed");
		    
	}*/
}