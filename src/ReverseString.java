// reverse a string

public class ReverseString {
    public static void main(String[] args) {
        String word = "Kevin";
        String reversedWord = reverseWord(word);
        System.out.println("Reverse word is " + reversedWord);

    }

    public static String reverseWord(String word) {
        String reversedWord = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            reversedWord = letter + reversedWord;
        }
        return reversedWord;
    }

}
