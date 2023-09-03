package AssignmentPatternPrograms;

public class PatternToPrintJ {
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0&&j<=7||j==n/2||i==9&&j==2||i==8&&j==2||j>=2&&i==0||i==10&&j==2||i==10&&j==3||i==10&&j==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
