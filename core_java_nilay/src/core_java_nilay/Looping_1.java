package core_java_nilay;

import java.util.Scanner;

public class Looping_1 {
public static void main(String[] args) {
	
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
	}
	int sum=0;
	
	for(int i=0;i<=10;i++)
		sum=sum+i;
	{
		System.out.println("total is : " + sum);
	}
	
	int fact = 1;
	for(int i=0;i<=10;i++)
		fact=fact*i;
	{
		System.out.println("factorial is : " + fact);
	}
	
	int ans= 0, num=5;
	for(int i=0;i<=10;i++) {
		ans=num*i;
	System.out.println(num + "*" +i+ "=" + ans);
	}
	
	
	//print even number & odd number 
	
	for(int i=0;i<=10;i++)
	{
	 if( i % 2 == 0)
	{
	System.out.println("even number : " + i);
	}
	 else 
	 {
		 System.out.println("odd number : " + i);
	 }
	 
	}
	
	// 
	
}
}

