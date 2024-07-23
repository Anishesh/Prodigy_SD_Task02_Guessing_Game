import java.util.Scanner;
import java.util.Random;
public class GuesingGame {
    public static void main(String args[]){
        Random r = new Random();
        int numberToGuess = r.nextInt(100)+1;
        int numberOfAttempts = 0;
        int guess = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("               GUESSING GAME                ");
        System.out.println("==============================================");
        System.out.println("NUMBER IS ALREADY CHOOSEN");
        System.out.println("TRY TO GUESS IT");

        while (guess != numberToGuess) {
            System.out.println("ENTER YOUR GUESS:-");
            guess = sc.nextInt();
            numberOfAttempts++;
        

        if (guess < numberToGuess){
            System.out.println("YOUR GUESS IS TOO LOW :(");
        }
        
        else if (guess > numberToGuess){
            System.out.println("YOUR GUESS IS TOO HIGH ");
        }
        else{
            System.out.println("CONGRATULATIONS YOU'VE GUESSED THE NUMBER CORRECTLY :)");
            System.out.println("YOU'VE TAKEN "+numberOfAttempts+""+" ATTEMPTS GUESS THE NUMBER");
        }
        } 
        
    }
}
