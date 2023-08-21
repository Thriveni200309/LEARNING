package Methods;

import java.util.Scanner;

public class CharacterIdentifier {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter alphabet");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
		scan.close();
		
	}public static void identifyCharacter(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Lower-case vowel");
		}
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("Upper-case vowel");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("Digit");
		}
		else if(ch>=65&&ch<=90) {
			System.out.println("Upper-case consonants");
		}
		else if(ch>=97&&ch<=122) {
			System.out.println("Lower-case consonants");
		
		}else {
			System.out.println("Special Character");
		}
	}

}
