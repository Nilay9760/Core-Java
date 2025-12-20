package core_java_nilay;

import java.util.Scanner;

//take input from user
public class user_defined_val {
public static void main(String[] args) {
	
	//create scanner class
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value : ");
	int a=sc.nextInt();  // nextInt() => take input from user
	
	System.out.println("enter the string value : ");
	String s=sc.next();
	
	System.out.println("enter the double val : ");
	Double d=sc.nextDouble();
	
	System.out.println("enter the char val : ");
	char c=sc.next().charAt(0);
	
	System.out.println(a+" "+s+" "+d+" "+c);

}
}
