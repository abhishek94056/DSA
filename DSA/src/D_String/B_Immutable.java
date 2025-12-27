package D_String;

public class B_Immutable {
	public static void main(String[] args) {
		String str = "Krishna";
		StringBuffer sb = new StringBuffer(str);
//		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.length());
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("r"));
	}
}
