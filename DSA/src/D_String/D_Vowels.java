package D_String;

public class D_Vowels {
	public static void main(String[] args) {
		String str = "Shree Krishna";
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.print(ch+",");      
			}
		}
	}

}
