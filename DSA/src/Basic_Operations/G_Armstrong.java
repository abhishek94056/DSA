package Basic_Operations;

public class G_Armstrong {
	public static void main(String[] args) {
		int num = 370, rem, arm = 0, c = num, count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		while (num > 0) {
			rem = num % 10;
			arm += Math.pow(rem, count);
			num = num / 10;
		}
		if (c == arm) {
			System.out.println(c + " is an Armstrong number.");
		} else {
			System.out.println(c + " is not an Armstrong number.");
		}
	}
}