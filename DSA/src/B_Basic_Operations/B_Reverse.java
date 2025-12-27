package B_Basic_Operations;

public class B_Reverse {
	public static void main(String[] args) {
		int num = 234, r;
		while(num>0) {
			r=num%10;
			System.out.print(r);
			num=num/10;
		}
	}
}
