import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int MIN_RANGE = 1;
        int MAX_RANGE = 100;
        int MAX_ATTEMPTS = 10;
        int MAX_ROUNDS = 2;
        int k = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("\n \t\t\t************* NUMBER GUESSING GAME ************* \n");
        System.out.println("Total Number Of Rounds : 2");
        System.out.println("Total Number of Attempts In Each Round : 10\n");
        do{
        for (int i = 1; i <= MAX_ROUNDS; i++) {
            int attempts = 0;
            int number = 0;
            System.out.println("Round "+ i +": Guess the number between "+ MIN_RANGE +" and "+ MAX_RANGE +" in "+ MAX_ATTEMPTS +" attempts.\n");
            while (attempts < MAX_ATTEMPTS) {
                number = random.nextInt(MAX_RANGE);
                System.out.println("Enter your guess : ");
                int guess_number = scanner.nextInt();
                attempts = attempts + 1;
                if (guess_number == number) {
                    totalScore = totalScore + 5;
                    if(i == 2){
                        totalScore = totalScore + 5;
                    }
                    System.out.println("Hurray! Number Guessed Successfully. Attempts = " +  attempts + ". Round Score = "+ totalScore + ". \n");
                }

                else if (guess_number < number) {
                    System.out.println("The number is greater than " + guess_number + ". Attempts Left = " + (MAX_ATTEMPTS - attempts) + ". \n");
                    totalScore = totalScore + 2;
                }

                else if (guess_number > number) {
                    System.out.println("The number is less than "+ guess_number +". Attempts Left = " + (MAX_ATTEMPTS - attempts) + ". \n");
                    totalScore = totalScore + 2;
                }

            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("\nRound = " + i + "\n");
                System.out.println("Score : " + totalScore + "\n");

            }
        }
        System.out.println("Total Points = 150.");
        System.out.println("Game Over. Total Score = " + totalScore + "\n");
        System.out.println("\t \t Do you want to continue press 1. PLAY \n 2. EXIT.");
        k = scanner.nextInt();
        }while( k == 1);
        scanner.close();
    }
}