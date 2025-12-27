package C_Array;

public class B_LargestAndSmallest {
	public static void main(String[] args) {
		int n[] = { 54, 12, 64, 88, 23, 42 };
		int largest = Integer.MIN_VALUE; // infinity
		int smallest = Integer.MAX_VALUE;
		for (int i : n) {
			if (i > largest) {
				largest = i;
			}
			if (i < smallest) {
				smallest = i;
			}
		}
		System.out.println("largest value is " + largest);
		System.out.println("smallest value is " + smallest);
	}
}
