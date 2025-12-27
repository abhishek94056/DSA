package B_Basic_Operations;

public class E_Prime {
	public static void main(String[] args) { 
		int num = 4; 
		if(num<=1) {
			System.out.println("Not Prime");
		}else {
			boolean b = true;
			for(int i =2;i<=Math.sqrt(num);i++) {    //  till the 2
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
