package StringPatterns;

public class replace {
    public static void main(String[] args) {
        String sentence = "India is my country ";

        String toReplace = "India";

        String newStr = "Bharath";
        // System.out.println(sentence);
        // System.out.println(sentence.replace(toReplace, newStr));
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
        // System.out.print(word);
    }
}
