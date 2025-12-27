package B_Basic_Operations;

public class J_binaryTOdecimal {
	public static void main(String[] args) {
		int bin = 010;
		int dec = 0;
		int pow = 0;
		while (bin > 0) {
			int lastdigit = bin % 10;
			dec = (dec + (int) (lastdigit * Math.pow(2, pow)));
			pow++;
			bin = bin / 10;
		}
		System.out.println(dec);
	}

}
