
import java.util.Random;
import java.util.*;

public class GuessTheNum {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        int guessedNum = 0;
        
        Scanner scanner = new Scanner(System.in);
        int guess;
        
        System.out.println("Guess the Number Game!");
        System.out.println("Random guess between 1 and 100");
        do {
            System.out.print("Enter your guess:");
            guess = scanner.nextInt();
            guessedNum++;
            
            if (guess < randomNum) {
                System.out.println("Too low");
            } else if (guess > randomNum) {
                System.out.println("Too high");
                
            } else {
                System.out.println("You've guessed the correct number, Congratulations!");
                System.out.println("Total of guessed numbers:" +guessedNum);
            }
        } while (guess != randomNum);
        
            scanner.close();
            }
    }