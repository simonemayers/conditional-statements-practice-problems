import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 212: ");
        int n = input.nextInt();

        System.out.println(message(n));
    }
    public static String message(int n){
        if(n > 212){
            return "Water is boiling!";
        } else{
            return "Water is not boiling!";
        }
    }
}
