package AssignmentPatternPrograms;

public class PatternToPrintA {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if((i==1&&j==3)||(i==2&&j==2||i==3&&j==2)||(i==4&&j==1)||(i==5&&j==1)||(i==2&&j==4)||(i==3&&j==3)||(i==4&&j==5)||(i==5&&j==5)||(j==4&&i==3))
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
