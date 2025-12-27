package D_String;

import java.util.Random;
import java.util.Scanner;

public class K_OTP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ch = "qwertyuioplkjhgfdsazxcvbnm1234567890!@#$%^&*.";
		StringBuffer otp = new StringBuffer();
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int index = r.nextInt(ch.length());
			otp.append(ch.charAt(index));
		}
		System.out.println("OTP is: " + otp);
	}

}
