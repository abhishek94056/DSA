package C_Array.Sort;
//Time complexity = O(n2)
public class B_Selection {
//selecting the smallest element from the unsorted part of the array 
//and placing it at the correct position.
	public static void main(String[] args) {
		int arr[] = { 3, 1, 4, 5, 2 };
		for (int i = 0; i < arr.length - 1; i++) { // check smallest number for this position
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++) { // check smallet number
				if (arr[minPos] > arr[j]) {
					minPos = j;
				}
			}
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
}
