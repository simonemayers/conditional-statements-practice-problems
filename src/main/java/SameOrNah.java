import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = input.next();
        System.out.println("Enter another word: ");
        String word2 = input.next();
        System.out.println(compareWords(word1, word2));
    }
    public static String compareWords(String word1, String word2){
        if(word1.equals(word2)){
            return "The words are the same";
        } else {
            return "The words are different";
        }
    }
}
