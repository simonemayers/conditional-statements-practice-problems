import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = n.nextInt();
        System.out.println("Enter another number: ");
        int n2 = n.nextInt();
        if(n1 > n2){
            System.out.println("The first number was larger than the second");
        } else if(n1 < n2){
            System.out.println("The second number was larger than the first");
        } else {
            System.out.println("Both numbers are the same");
        }
    }
}
