package Basic_Operations;

public class C_Factorial {
	public static void main(String[] args) {
		int num=5,fact=1;
		for(int i =1;i<=num;i++) {
			fact=fact*i;                            //5= 5*4*3*2*1 =120
		}
		System.out.println(fact);
	}

}
