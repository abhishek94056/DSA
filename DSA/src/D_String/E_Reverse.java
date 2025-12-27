package D_String;

public class E_Reverse {
//	input = I love India
//	output = India love I
	public static void main(String[] args) {
		String str = "I love India";
		String sp[] = str.split(" ");
		for(int i=sp.length -1;i>=0;i--){
			System.out.print(sp[i]+" ");
		}
	}
}
