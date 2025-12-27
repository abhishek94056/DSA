package C_Array;

//Time complexity = O(n)
public class A_Linear_Search {

	public static int Linear_Search(int n[], int key) {
		for (int i = 0; i < n.length; i++) {
			if (key == n[i]) { // check one by one through the loop
				return i;
			}
		}
		return -1;
	}

//--------------------------------------------------------------------------	
	public static void main(String[] args) {
		int n[] = { 54, 12, 64, 88, 23, 42 };
		int key = 88;
		System.out.println(Linear_Search(n, key));
	}
}
