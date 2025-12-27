package B_Basic_Operations;

public class F_Palindrome {
	public static void main(String[] args) {
		int num=121,r,s=0,c=num;
		while(num>0) {
			r=num%10;
			s=(s*10)+r;
			num=num/10;
		}if(c==s) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
