package D_String;

// Time Complexity: O(n)
public class H_ToUpperCase {

	public static void main(String[] args) {

		String str = "ram krishan hari..!";
		StringBuffer sb = new StringBuffer();

		// First character uppercase
		sb.append(Character.toUpperCase(str.charAt(0)));

		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				sb.append(' ');        // add space
				i++;                   // move to next character
				sb.append(Character.toUpperCase(str.charAt(i))); // uppercase after space
			} else {
				sb.append(str.charAt(i)); // normal character
			}
		}

		System.out.println(sb.toString());
	}
}
