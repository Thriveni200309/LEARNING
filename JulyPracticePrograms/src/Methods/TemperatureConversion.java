package Methods;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the temperature conversion Tool!");
		System.out.println("Enter an option: \n 1.Convert Celsius to Farenheit\n 2.Convert Farenheit to Celsius");
		System.out.println("Enter your choice: ");
		int choice=scan.nextInt();
		
	
		switch(choice) {
		case 1:System.out.println("Enter the temperature");
		
		double celsius=scan.nextDouble();
		double res=celsiusToFarenheit(celsius);
		System.out.println("The temperature in celsius is: "+res);
		break;
		case 2:
			System.out.println("Enter the temperature:");
			double farenheit=scan.nextDouble();
			double res1=farenheitToCelsius(farenheit);
			System.out.println("The temperature in farenheit is: "+res1);
			break;


		}
		scan.close();
	}
	
	
	
	public static double celsiusToFarenheit(double celsius) {
		
		
		double farenheit=(celsius*9/5)+32;
		return farenheit;
		}
		
	public static double farenheitToCelsius(double farenheit) {
		
		
		double celsius=(farenheit-32)*5/9;
		return celsius;
		}
	}



