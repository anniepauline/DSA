public class CarArr {
    public static void main(String[] args) {
        String s = "pentagon";
        String ns = "";
        for (int i = 0; i < s.length(); i += 1) {
            char c = s.charAt(i);
            // System.out.println(c);
            ns = c + ns;

        }
        System.out.println(ns);
    }

}
