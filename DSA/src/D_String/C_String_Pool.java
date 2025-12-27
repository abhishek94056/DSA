package D_String;

public class C_String_Pool {
	public static void main(String[] args) {
		String str = "Krishna";
		String str2 = "Krishna";
		if(str==str2) {
			System.out.println("Same Memory");
		}else {
			System.out.println("Not Same Memory");
		}
		
		String Obj1 = new String(str);
		String Obj2 = new String(str);
		if(Obj1==Obj2) {
			System.out.println("Same Memory");
		}else {
			System.out.println("Not Same Memory");
		}
	}
}
