import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = input.next();
        System.out.println("Enter another word: ");
        String word2 = input.next();
        if(word1.equals(word2)){
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}
