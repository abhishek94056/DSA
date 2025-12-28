package C_Array.Sort;
//Time complexity = O(n2)
public class A_Bubble {
//	Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements 
//	and swaps them if they are in the wrong order.
	public static void main(String[] args) {
		int arr[] = { 3, 1, 4, 5, 2 };
		for (int turn = 0; turn < arr.length - 1; turn++) { // no need to check last turn
			for (int j = 0; j < arr.length - 1 - turn; j++) { // no need to check alredy sorted
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
