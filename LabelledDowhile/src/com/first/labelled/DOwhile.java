package com.first.labelled;

public class DOwhile {
	public static void main(String[] args) {
		int i=1;
		veni:do {
			i++;
			System.out.println("*");
			int j=1;
			do {
				System.out.print("# ");
				j++;
				
			}while(j<=5);
			break veni;
		}while(i<=5);
		System.out.println();
	}

}
