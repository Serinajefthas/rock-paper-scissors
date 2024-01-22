// Recursive version of my simple rock paper scissors function
// inefficient time complexity: O(n) compared to normal function

import java.util.Scanner;
import java.util.Random;
public class RecursiveRPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userMove, computerMove;
        String [] moves = {"rock", "paper", "scissors"};
        Random rand = new Random();

        System.out.println("\nWelcome to rock, paper, scissors! The rules are simple: choose between 3" + 
        " options: rock, paper or scissors and try beat the computer! Rock beats scissors, scissors beats paper and paper beats" +
        " rock. Enter 'exit' to leave the game, goodluck!");
        
        System.out.println("\nChoose your weapon: ");
        userMove = sc.nextLine();
    }
    public static void recursive(String userMove) {
        
        // base case
        if (userMove.equals("exit")){
            System.out.println("Exiting game, thanks for playing!");
            System.exit(0);
        }
        //recursive call
    }
}
