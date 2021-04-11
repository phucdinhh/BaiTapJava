import java.util.Scanner;
import java.util.Random;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number > 0 to set range: ");
        int n = scanner.nextInt();
        Random random = new Random();
        int min = 0;
        int max = n;
        int secretNumber = random.nextInt(n);
        int guess;
        
        do {
            if (max == min) {
                System.out.println("YOU LOSE!"); 
                break; 
            }
            else{
                System.out.println("Find the secret number in ("+min+", " + max + ") ?");
                System.out.print("Enter the number you guess: ");
                guess = scanner.nextInt();
                if(guess == secretNumber) System.out.println("BINGO!");
                else if (guess > max || guess < min) System.out.println("Out of range. Try again?");
                else if (guess >= min && guess <= max && guess != secretNumber){
                    if (guess < secretNumber) {
                        min = guess+1;
                        if (max == min) {
                            System.out.println("YOU LOSE! The secret number is " + secretNumber); 
                            break; 
                        }
                        System.out.println("Too small.");
                    }
                    else if (guess > secretNumber){
                        max = guess-1;
                        if (max == min) {
                            System.out.println("YOU LOSE! The secret number is " + secretNumber); 
                            break; 
                        }
                        System.out.println("Too large.");
                    }
                }
            }
        } while(guess != secretNumber);
        scanner.close();
    }
}
