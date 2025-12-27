package D_String;

public class A_Method {
    public static void main(String[] args) {
        String s = "Abhishek More";
        //Length & Character Access

        System.out.println("Length : " + s.length());
        System.out.println("CharAt(0) : " + s.charAt(0));

        //Case Conversion

        System.out.println("Uppercase : " + s.toUpperCase());
        System.out.println("Lowercase : " + s.toLowerCase());

        //String Comparison
           
        System.out.println("Equals : " + s.equals("Abhishek More"));
        System.out.println("Equals Ignore Case : " + s.equalsIgnoreCase("abhishek more"));
        System.out.println("CompareTo : " + s.compareTo("Abhishek"));

        //Searching Methods
           
        System.out.println("Contains 'Abhi' : " + s.contains("Abhi"));
        System.out.println("IndexOf 'A' : " + s.indexOf("A"));
        System.out.println("LastIndexOf 'e' : " + s.lastIndexOf("e"));

        //String Modification

        System.out.println("Concat : " + s.concat(" (Java Developer)"));
        System.out.println("Replace : " + s.replace("More", "Patil"));
        System.out.println("Substring(0,8) : " + s.substring(0, 8));

        //Start & End Check
           
        System.out.println("StartsWith 'A' : " + s.startsWith("A"));
        System.out.println("EndsWith 'e' : " + s.endsWith("e"));

        //Trimming & Splitting

        String s2 = "   I Love Java Programming   ";
        System.out.println("Trim : " + s2.trim());

        String[] words = s2.trim().split(" ");
        System.out.println("Split : ");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
