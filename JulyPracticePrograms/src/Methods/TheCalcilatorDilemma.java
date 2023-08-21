package Methods;

import java.util.Scanner;

public class TheCalcilatorDilemma {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a choice from 1 to 4");
		int choice=scan.nextInt();
		System.out.println("Enter a  first number");
		int num1=scan.nextInt();
		System.out.println("Enter a second number");
		int num2=scan.nextInt();
		performOperations(num1,num2,choice);
		scan.close();
		
	}
	public static void performOperations(int num1,int num2,int choice) {
		
		switch(choice)
		{
		case 1:int a=num1+num2;
			System.out.println("Addition is: "+a);
			break;
		case 2:
			int b=num1-num2;
			System.out.println("Substraction is: "+b);
			break;
		case 3:
			int c=num1*num2;
			System.out.println("Multiplicaton is: "+c);
			break;
		case 4:
			int d=num1/num2;
			System.out.println("Division is: "+d);
			break;
		default:
			System.out.println("Choose the above options...");
			
		}
		
	}

}
