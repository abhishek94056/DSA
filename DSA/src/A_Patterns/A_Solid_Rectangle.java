package A_Patterns;

public class A_Solid_Rectangle {

	public static void main(String[] args) {
		int m = 5, n = 5;
		
		//Outer Loop
				for(int i=0;i<=m;i++) {
					//Inner Loop
					for(int j=0;j<=n;j++) {
						System.out.print("*");
					}
					//Print on next Line
					System.out.println();
				}

	}

}
