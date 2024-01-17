/*
 * Rock paper scissors game
 */
import java.util.Scanner;
import java.util.Random;

class main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        boolean gameIsRunning = true;
        String input, computerOption;
        // array with 
        String [] options = {"rock", "paper", "scissors"};
        Random rand = new Random();
        int select;

        System.out.println("Welcome to rock, paper, scissors! The rules are simple: choose between 3" + 
        " options: rock, paper or scissors and try beat the computer! Rock beats scissors, scissors beats paper and paper beats" +
        " rock. Enter 'exit' to leave the game, goodluck!");
        while (gameIsRunning){
            System.out.println("Choose your weapon: ");
            input = sc.nextLine();

            // randomly chooses option from string array using Random java package
            for (int i = 0; i < 1; i++)
                select = rand.nextInt(options.length);

            //while (!input.equals("exit")){
            switch(input){
                case "rock":
                    break;
                case "paper":
                    break;
                case "scissors":
                    break;
                case "exit":
                    System.out.println("Exiting game, thanks for playing!");
                    System.exit(0);
                default:
                    System.out.println("not a valid option, choose again");
                    break;
            //}
        }
    }
        
    }
}