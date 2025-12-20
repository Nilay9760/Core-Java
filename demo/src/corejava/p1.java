package corejava;

import java.util.Scanner;

public class p1 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter first numebr : ");
		int a=sc.nextInt();
		
		System.out.println("enter second numebr : ");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("sum of two number is : " +c);
	}
}
