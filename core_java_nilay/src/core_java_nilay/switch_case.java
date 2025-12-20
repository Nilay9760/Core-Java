package core_java_nilay;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
//		int a=10,b=20;
//		
//		char ch='/';
//		switch (ch) {
//		case '+' :
//			System.out.println("addition is : " + (a+b));
//			break;
//		case '-':
//			System.out.println("subtraction is : " + (a-b));
//			break;
//		case '*':
//			System.out.println("multiplication is : " + (a*b));
//			break;
//		case '/':
//			System.out.println("division is : " + double(a/b));
//			break;
//			
//		default:
//			System.out.println("invalid value : ");
//			break;
//		}
		
//------------------------------------------------------------------------------------------------
//		int num=4;
//		switch(num%2)
//		{
//		case 0:
//			System.out.println("even number : " + num);
//			break;
//		case 1:
//			System.out.println("odd number : " + num);
//			break;
//		default :
//			System.out.println("invalid number ");
//			break;
//		}

//----------------------------------------------------------------------------------------------

//		String dept="B.COM";
//		int sem=3;
//		
//		switch(dept)
//		{
//			case "IT":
//				switch(sem) {
//				case 1:
//					System.out.println("IT department -sem 1 subject are java,jdbc,.net ");
//					break;
//				case 2:
//					System.out.println("IT department -sem 2 subject are html,css,javascript");
//					break;
//				case 3:
//					System.out.println("IT department -sem 3 subject are corejava,dbms");
//					break;
//				}
//				break;
//			
//			case "CSE":
//				switch(sem) {
//				case 1:
//					System.out.println("CSE department -sem 1 subject are java,jdbc,.net ");
//					break;
//				case 2:
//					System.out.println("CSE department -sem 2 subject are html,css,javascript");
//					break;
//				case 3:
//					System.out.println("CSE department -sem 3 subject are corejava,dbms");
//					break;
//				}
//				break;
//				
//			case "B.COM":
//				switch(sem) {
//				case 1:
//					System.out.println("B.COM department -sem 1 subject are account,statistic ");
//					break;
//				case 2:
//					System.out.println("B.COM department -sem 2 subject are economics,social science");
//					break;
//				case 3:
//					System.out.println("B.COM department -sem 3 subject are computer,accountancy");
//					break;
//				}
//				break;		
//		}
		
//------------------------------------------------------------------------------------------------
		
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			
		
		System.out.println("enter choice between 1,2,3,4,5,6,7 : ");
		 
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
	
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Invalid Days choice!...");
			break;
		}
		System.out.println("Do you want to continue press(1 yes/0 no):");
		choice=sc.nextInt();
		}while(choice==1);
		
			
	
	}
}
