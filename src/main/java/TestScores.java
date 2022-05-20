import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100");
        int n = input.nextInt();
        if(n >= 90){
            System.out.println("Your grade is an A :) ");
        }else if(n>= 80){
            System.out.println("Your grade is a B :)");
        } else if(n >= 70){
            System.out.println("Your grade is a C :|");
        } else if(n>=60){
            System.out.println("Your grade is a D :/");
        } else if(n<=59){
            System.out.println("Your grade is an F :(");
        }
    }
}
