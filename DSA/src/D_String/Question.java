package D_String;

public class Question {
		public static void reverseString(String[] s) {
			int left = 0;
			int right = s.length - 1;

			while (left < right) {
				String temp = s[left];
				s[left] = s[right];
				s[right] = temp;
				left++;
				right--;
			}

			for (String ch : s) {
				System.out.print(ch + " ");
			}
		}


	public static void main(String[] args) {
		String s[] = { "h", "e", "l", "l", "o" };
		reverseString(s);
	}

}
