package AssignmentPatternPrograms;

public class PatternToPrintB {
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(i==0||j==0||i==n||(i==1&&j==10)||(i==2&&j==10)||(i==3&&j==10)||(i==4&&j==10)||(i==6&&j==10)||i==7&&j==10||i==8&&j==10||i==9&&j==10||i==10&&j==10||(i==5&&j==1)||(i==5&&j==2)||(i==5&&j==3)||(i==5&&j==4)||(i==5&&j==5)||(i==5&&j==6)||(i==5&&j==7)||(i==5&&j==8)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
	}

}
