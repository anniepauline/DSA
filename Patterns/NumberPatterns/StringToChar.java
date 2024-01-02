public class StringToChar {
    public static void main(String[] args) {
        String st = "$Pe56NTAGoN23@";

        char[] arr = st.toCharArray();
        int upper = 0;
        // System.out.println(st);

        for (int i = 0; i < st.length(); i++) {
            // counting caps
            if (arr[i] >= 48 && arr[i] <= 57) {

                upper += arr[i] - 48;
            }
            arr[i] = st.charAt(i);
        }
        System.out.print(upper);

    }
}
