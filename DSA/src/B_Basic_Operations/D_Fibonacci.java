package B_Basic_Operations;

public class D_Fibonacci {
	public static void main(String[] args) {
		int num=10, first=0, second=1;
		for(int i =0;i<=num;i++) {
			System.out.println(first+" ");
			int next = first+second;
			first=second;
			second=next;
		}
	}

}
