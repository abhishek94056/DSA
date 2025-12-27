package C_Array;

public class D_BinarySearch {
	// Time complexity = O(log n)
	public static int BinarySearch(int n[], int key) {
		int start = 0;
		int end = n.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2; // find mid
			// comparison
			if (n[mid] == key) { // in array only one number
				return mid;
			}
			if (n[mid] < key) { // Right
				start = mid + 1;
			} else { // left
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n[] = { 2, 4, 6, 8, 9 }; // required Sorted
		int key = 8;
		System.out.println(BinarySearch(n, key));
	}
}
