// Recursive version of my simple rock paper scissors function
// inefficient time complexity: O(n) compared to normal function

import java.util.Scanner;
import java.util.Random;
public class RecursiveRPS {

    //private global variables, only accessible in this class
    private static String [] moves = {"rock", "paper", "scissors"};
    private static Random rand = new Random();
    private static boolean gameIsRunning = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to rock, paper, scissors! The rules are simple: choose between 3" + 
        " options: rock, paper or scissors and try beat the computer! Rock beats scissors, scissors beats paper and paper beats" +
        " rock. Enter 'exit' to leave the game, goodluck!");
        play(sc);
    }

    public static void play(Scanner sc) {
        System.out.println("\nChoose your weapon: ");
        String userMove = sc.nextLine();

        // not standard base case, but still base case
        if (userMove.equals("exit")){
            System.out.println("Exiting game, thanks for playing!");
            System.exit(0);
        }
        //recursive call
        if (!(userMove.equals("exit") || userMove.equals("rock") || userMove.equals("paper")|| userMove.equals("scissors"))){
            System.out.println("Invalid input, choose 'rock', 'paper', 'scissors' or 'exit'");
            play(sc);
        }
        String computerMove = moves[rand.nextInt(moves.length)];
        System.out.println("Computer chose: " + computerMove);

        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie try again!");
            play(sc);
        }
        else {
            determineWinner(userMove, computerMove);
            play(sc);
        }
    }

    private static void determineWinner(String userMove, String computerMove) {
        if ((userMove.equals("rock") && computerMove.equals("scissors"))
                || (userMove.equals("paper") && computerMove.equals("rock"))
                || (userMove.equals("scissors") && computerMove.equals("paper"))) {
            System.out.println("Well done! You win!");
            return;
        } else {
            System.out.println("You lose! Try again!");
            return;
        }
    }
}
