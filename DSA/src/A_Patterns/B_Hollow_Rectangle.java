package A_Patterns;

public class B_Hollow_Rectangle {
	public static void main(String[] args) {
		int m = 5, n = 5;
		
		for(int i = 1;i<=m;i++) {
			for(int j =1;j<=n;j++) {
				if(i==m || j==n || i==1 || j ==1) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
