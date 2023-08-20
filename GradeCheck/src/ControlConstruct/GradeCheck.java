package ControlConstruct;

import java.util.Scanner;

class GradeCheck{
	public static void checkGrade(int grade) {
		if(grade>50)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int grade=scan.nextInt();
		checkGrade(grade);
		scan.close();
		
		
	}
}
