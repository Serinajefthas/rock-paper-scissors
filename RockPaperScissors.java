/*
 * Rock paper scissors game
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        boolean gameIsRunning = false;
        String userMove, computerMove;
        // array with 
        String [] moves = {"rock", "paper", "scissors"};
        Random rand = new Random();

        System.out.println("\nWelcome to rock, paper, scissors! The rules are simple: choose between 3" + 
        " options: rock, paper or scissors and try beat the computer! Rock beats scissors, scissors beats paper and paper beats" +
        " rock. Enter 'exit' to leave the game, goodluck!");
        gameIsRunning = true;
        while (gameIsRunning){
            customBreak : {
                System.out.println("\nChoose your weapon: ");
                userMove = sc.nextLine();

                if (!(userMove.equals("exit") || userMove.equals("rock") || userMove.equals("paper")|| userMove.equals("scissors"))){
                    System.out.println("Invalid input, choose 'rock', 'paper', 'scissors' or 'exit'");
                    break customBreak;
                }

                if (userMove.equals("exit")){
                    System.out.println("Exiting game, thanks for playing!");
                    System.exit(0);
                }
                // computer randomly chooses index from string array using Random java package
                computerMove = moves[rand.nextInt(moves.length)];
                System.out.println("Computer chose: " + computerMove);
                
                // case for draw
                if (userMove.equals(computerMove)) System.out.println("It's a tie try again!");
                
                if (userMove.equals("rock")) {
                    if (computerMove.equals("scissors")) System.out.println("Well done you win!");
                    else if (computerMove.equals("paper")) System.out.println("You lose, try again!");
                }
                if (userMove.equals("paper")) {
                    if (computerMove.equals("rock")) System.out.println("Well done you win!");
                    else if (computerMove.equals("scissors")) System.out.println("You lose, try again!");
                }
                if (userMove.equals("scissors")) {
                    if (computerMove.equals("paper")) System.out.println("Well done you win!");
                    else if (computerMove.equals("rock")) System.out.println("You lose, try again!");
                }
            }
        }
    }
}