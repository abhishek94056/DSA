package D_String;

public class J_Lexicographic { // largest string
	public static void main(String[] args) {
		String str[] = { "Banana", "Apple", "Grape" };
		// Assume first string is the largest
		String largest = str[0];
		// Compare remaining strings
		for (int i = 0; i < str.length; i++) {
			if (largest.compareTo(str[i]) < 0) {
				largest = str[i]; // update largest
			}
		}
		System.out.println(largest);
	}
}