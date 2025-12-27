package C_Array;

public class F_SubArray {

	public static void SubArray(int n[]) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			int start = i;
			for (int j = i; j < n.length; j++) {
				int end = j;
				for (int k = start; k < end; k++) {
					System.out.print(n[k] + ", ");
					sum = sum + n[k];
					count++;
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("count = " + count);
		System.out.println("sum = " + sum);
	}

	public static void main(String[] args) {
		int n[] = { 2, 4, 7, 5, 9 };
		SubArray(n);
	}

}
