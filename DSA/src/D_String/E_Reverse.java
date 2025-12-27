package D_String;

public class E_Reverse {
//	input = I love India
//	output = India love I
	public static void main(String[] args) {
		String str = "I love India";
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);

	}
}
