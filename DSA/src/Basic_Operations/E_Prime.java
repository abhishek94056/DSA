package Basic_Operations;

public class E_Prime {
	public static void main(String[] args) {
		int num = 5;
		if(num<=1) {
			System.out.println("Not Prime");
		}else {
			boolean b = true;
			for(int i =2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					b=false;
					break;
				}
			}
			if(b){
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
		}
	}

}
