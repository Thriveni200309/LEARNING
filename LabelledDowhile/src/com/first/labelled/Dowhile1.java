package com.first.labelled;

import java.util.Scanner;

public class Dowhile1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		scan.close();
		thriveni:do {
			System.out.println("*");
			i++;
			break thriveni;
		}while(i<=15);
		
		
	}

}
