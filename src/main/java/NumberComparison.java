import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = n.nextInt();
        System.out.println("Enter another number: ");
        int n2 = n.nextInt();
        System.out.println(compare(n1, n2));
    }

    public static String compare(int n1, int n2){
        if(n1 > n2){
            return "The first number was larger than the second";
        } else if(n1 < n2){
            return "The second number was larger than the first";
        } else {
            return "Both numbers are the same";
        }
    }
}
