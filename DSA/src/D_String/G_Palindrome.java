package D_String;

// Time complexity O(n)
public class G_Palindrome {
	public static void Palindrome(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (sb.toString().equals(str)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}
	}

	public static void main(String[] args) {
		String str = "madam";
		Palindrome(str);
	}

}
