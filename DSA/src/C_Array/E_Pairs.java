package C_Array;

//Time complexity = O(n2)
public class E_Pairs {

	public static void Pairs(int n[]) {
		int tp = 0;
		for (int i = 0; i < n.length; i++) {
			int curr = n[i]; // 2,4,7,5,9
			for (int j = i + 1; j < n.length; j++) {
				System.out.print("(" + curr + "," + n[j] + ")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total Pairs is " + tp);
	}

	public static void main(String[] args) {
		int n[] = { 2, 4, 7, 5, 9 };
		Pairs(n);
	}

}
