package D_String;

import java.util.Arrays;

public class L_Anagram {

	public static void main(String[] args) {

		String str1 = "listen  o";
		String str2 = "o silent";

		// Remove spaces and convert to lowercase
		str1 = str1.replace(" ", "").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();

		boolean isAnagram = true;

		// Length check
		if (str1.length() != str2.length()) {
			isAnagram = false;
		} else {
			// Convert to char arrays
			char a[] = str1.toCharArray();
			char b[] = str2.toCharArray();

			// Sort both arrays
			Arrays.sort(a);
			Arrays.sort(b);

			// Compare arrays
			if (!Arrays.equals(a, b)) {
				isAnagram = false;
			}
		}

		// Output
		if (isAnagram) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not anagram");
		}
	}
}
