package core_java_nilay;

import java.util.Scanner;

public class coditional_statement {
	
	// check number is even or odd
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//------------------------------------------------------------------------------------------
//	System.out.println("enter the number :");
//	int num=sc.nextInt();
//	
//	if (num%2==0)
//	{
//		System.out.println(num + " is even number" );
//	}
//	else
//	{
//		System.out.println(num + " is odd number ");
//	}

//------------------------------------------------------------------------------------------
//
//	System.out.println("enter a range number : ");
//	int num=sc.nextInt();
//	int oddnumber=0,evennumber=0;
//	
//	for(int i=1;i<=num;i++)
//		if (i%2==0)
//	{
//			evennumber++;
//		System.out.println(i +" is even");
//	} 
//		else {
//			oddnumber++;
//			System.out.println(i + " is odd");
//		}
//System.out.println("\n");
//System.out.println("total even number " + evennumber);
//System.out.println("total odd number " + oddnumber);
	
//-------------------------------------------------------------------------------------------
// find maximum number using else if 
	
//	int a=10,b=20,c=30;
//	if(a>=b && b>=c)
//	{
//		System.out.println(a + " is maximum");
//	}
//	else if(b>=a && b>=c)
//	{
//		System.out.println(b + " is maximum");
//	}
//	else
//	{
//		System.out.println(c + " is maximum");
//	}
//-------------------------------------------------------------------------------------------	
// find maximum number using nested if
//	int x=40,y=50,z=60;
//	if(x>=y)
//	{
//		if (x>=z) {
//			System.out.println(x + " is maximum");
//		}
//		else {
//			System.out.println(y + " is maximum");
//		}
//	} else {
//		if(y>=z) 
//			
//			{
//				System.out.println(y + " is maximum");
//			}
//			else
//			{
//				System.out.println(z + " is maximum");
//			}
//	}
//----------------------------------------------------------------------------------------------
	System.out.println("enter marks : ");
	int m=sc.nextInt();
	
    if(m<=100 && m>=80)
    {
    	System.out.println(m + " A GRADE");
    }
    else if(m<=79 && m>=70)
    {
    	System.out.println(m + " B GRADE");
    }
    else if(m<=69 && m>=60)
    {
    	System.out.println(m + " C GRADE");
    }
    else if(m<=59 && m>=50)
    {
    	System.out.println(m + " D GRADE");
    }
    else if(m<=49 && m>=36)
    {
    	System.out.println(m + " E GRADE");
    }
    else if (m<=35 && m>=1)
    {
    	System.out.println(m + " FAIL");
    }
    else
    {
    	System.out.println("INVALID VALUE");
    }
	
}
	
}
