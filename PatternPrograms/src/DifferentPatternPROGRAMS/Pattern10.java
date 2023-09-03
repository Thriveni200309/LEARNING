package DifferentPatternPROGRAMS;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n/2;i++) {
			for(int j=0;j<=n/2;j++) {
				if(i==0||j==0||j==n/2||i==n/2||i==n/4||j==n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
