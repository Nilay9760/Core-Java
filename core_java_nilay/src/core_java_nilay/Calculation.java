package core_java_nilay;

import java.util.Scanner;

public class Calculation {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a and b val : ");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	
	System.out.println("addition is : " + (a+b) + "subtraction is " + (a-b)  + "multiplication is :" + (a*b) + "devision is :"
			+ (a/b)   + "mudulo is : " + (a%b));
	
	double total = a+b;
	double avg = total/2;
	System.out.println(" total of value is :" + total);
	System.out.println("average of value is : " + avg );
}
}
