package AssignmentPatternPrograms;

public class PatternToPrintM {
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||j==n||j==n-i&&i<=n/2||i==j&&j<=n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
