package D_String;

public class F_Domain_Name {
	public static void main(String[] args) {
		//accept email id of the user and print the domain name only
		String mail = "abhishek@gmail.com";
		int b = mail.indexOf("@")+1;
		int e = mail.indexOf(".");
		System.out.println(mail.substring(b,e));
	}
}
