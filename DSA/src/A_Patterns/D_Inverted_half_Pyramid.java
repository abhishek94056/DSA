package A_Patterns;

public class D_Inverted_half_Pyramid {

	public static void main(String[] args) {
		int n = 5;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=(n-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
