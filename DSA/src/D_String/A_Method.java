package D_String;

public class A_Method {
	public static void main(String[] args) {
		String s = "Abhishek";
		System.out.println("Lenth is: "+s.length());
		System.out.println(s.concat(" More"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(4));
		System.out.println(s.startsWith("A"));
		System.out.println(s.endsWith("k"));
		System.out.println(s.codePointAt(0));
		System.out.println(s.contains("Abhi"));
		System.out.println(s.equals("Abhishek"));
		System.out.println(s.equalsIgnoreCase("abhishek"));
		System.out.println(s.indexOf("A"));
		System.out.println(s.lastIndexOf("A"));
		System.out.println(s.repeat(5));
		System.out.println(s.replace("shek","jit"));
		System.out.println(s.substring(4));
		
		String s2 = "I Love Java";
		String[]abc=s2.split(" ");
		for(int i =0;i<abc.length;i++) {
			System.out.println(abc[i]);
		}
		
		String s3="      Abhishek More              ";
		System.out.println(s3.trim());	
	}

}
