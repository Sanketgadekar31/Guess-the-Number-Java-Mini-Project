import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Mini Project
        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);
        int userNumber;
        do {
            System.out.println("Guess the number (1 - 100) : ");
            userNumber = sc.nextInt();

            if (myNumber == userNumber){
                System.out.println("WHOOH.. CORRECT NUMBER!!");
                break;
            }
            else if (myNumber < userNumber){
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }
        } while (userNumber >= 0);

        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}