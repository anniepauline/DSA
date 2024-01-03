package StringPatterns;

public class replaceEnd {

    public static void main(String[] args) {
        String sentence = "India is my country ";
        String toReplace = "country";
        String newStr = "home";

        String word = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = (sentence.charAt(i));
            if (c == 32) {
                if (word.equalsIgnoreCase(toReplace)) {
                    System.out.print(newStr + " ");
                    word = "";
                } else {
                    System.out.print(word + " ");
                    word = "";
                }
            } else {
                word += c;
            }
        }
    }
}
