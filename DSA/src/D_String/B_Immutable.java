package D_String;

public class B_Immutable {
    public static void main(String[] args) {

        String str = "Krishna";

        // StringBuffer is mutable
        StringBuffer sb = new StringBuffer(str);
        // StringBuilder sb = new StringBuilder(str); // same methods, faster

        //Basic Methods
        
        System.out.println("Length : " + sb.length());
        System.out.println("CharAt(0) : " + sb.charAt(0));
        System.out.println("IndexOf 'r' : " + sb.indexOf("r"));

        sb.append(" Dev");
        System.out.println("Append : " + sb);

        sb.insert(7, " Java");
        System.out.println("Insert : " + sb);

        sb.replace(0, 7, "Radha");
        System.out.println("Replace : " + sb);

        sb.delete(5, 10);
        System.out.println("Delete : " + sb);

        sb.reverse();
        System.out.println("Reverse : " + sb);

        sb.setCharAt(0, 'R');
        System.out.println("SetCharAt : " + sb);

        System.out.println("Capacity : " + sb.capacity());
    }
}
