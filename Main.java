import java.util.Random;
import java.util.Scanner;
public class Main {
    static int points = 0;
    static int computerPoints = 0;
    static int tie = 0;

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String comName = "Nanmone";

        System.out.print("Please Enter your name: ");
        String name = scanner.nextLine();
        greet(name);
        System.out.println("Computer is generating its name!");
        System.out.println();
        System.out.println("Please wait...");
        System.out.println();
        int comNameint = random.nextInt(5)+1;
        if (comNameint == 1){
            comName = "Kudasai";
        } else if (comNameint == 2) {
            comName = "Henti";
        }else if (comNameint == 3) {
            comName = "Oppai";
        }else if (comNameint == 4) {
            comName = "Nyako";
        }else if (comNameint == 5) {
            comName = "Yaru";
        }

        System.out.println("Computer's name is "+ comName);
        System.out.println();
        System.out.println("Let the games begin...");
        System.out.println();
        System.out.println("===ROCK PAPER SCISSORS===");
        System.out.print("Enter number of rounds: ");
        int noRounds = scanner.nextInt();

        for (int i = 1; i <= noRounds; i++) {
            round(scanner, random);
        }

        System.out.println("====FINAL SCORE====");
        System.out.println("Player Wins    :" + points);
        System.out.println("Computer Wins  :" + computerPoints);
        System.out.println("Ties           :" + tie);
        System.out.println();
        System.out.println("====OVERALL WINNER====");
        if (points > computerPoints) {
            System.out.println(name +"!");
        } else if (computerPoints > points) {
            System.out.println("Computer!");
        } else {
            System.out.println("The game ended in a Draw!");
        }

    }

    public static void greet(String name) {
        System.out.println("Player's name is " + name);
    }

    public static void round(Scanner scanner, Random random) {
        System.out.println("Choose a Hand:");
        System.out.println("1-Rock");
        System.out.println("2-Paper");
        System.out.println("3-Scissors");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose Rock");
                break;
            case 2:
                System.out.println("You chose Paper");
                break;
            case 3:
                System.out.println("You chose Scissors");
                break;
            default:
                System.out.println("You is a BITCH!");
                return;
        }

        System.out.println();
        int computerChoice = random.nextInt(3) + 1;

        switch (computerChoice) {
            case 1:
                System.out.println("Computer chose Rock");
                break;
            case 2:
                System.out.println("Computer chose Paper");
                break;
            case 3:
                System.out.println("Computer chose Scissors");
                break;
            default:
                System.out.println("Computer is a BITCH!");
                break;

        }
        if (choice == 1 && computerChoice == 2) {
            System.out.println("Computer wins!");
            computerPoints++;
        } else if (choice == 2 && computerChoice == 1) {
            System.out.println("Player wins!");
            points++;
        } else if (choice == 3 && computerChoice == 2) {
            System.out.println("Player wins!");
            points++;
        } else if (choice == 2 && computerChoice == 3) {
            System.out.println("Computer wins!");
            computerPoints++;
        } else if (choice == 1 && computerChoice == 3) {
            System.out.println("Player wins!");
            points++;
        } else if (choice == 3 && computerChoice == 1) {
            System.out.println("Computer wins!");
            computerPoints++;
        } else {
            System.out.println("Tie!");
            tie ++;
        }

    }
}