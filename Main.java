import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Ask the user to choose rock, paper, or scissors
      System.out.println("Choose rock, paper, or scissors:");
      String userChoice = scanner.nextLine();

      // Generate a random number to simulate the computer's choice
      int computerChoice = (int)(Math.random() * 3);
      String[] choices = {"rock", "paper", "scissors"};
      String computerChoiceString = choices[computerChoice];
      System.out.println("Computer chose : " + computerChoiceString);

      // Compare the user's choice to the computer s choice to determine the winner
      if (userChoice.equals(computerChoiceString)) {
        System.out.println("It's a tie!");
      } else if (
        (userChoice.equals("rock") && computerChoiceString.equals("scissors")) ||
        (userChoice.equals("scissors") && computerChoiceString.equals("paper")) ||
        (userChoice.equals("paper") && computerChoiceString.equals("rock"))
      ) {
        System.out.println("You win! GG");
      } else {
        System.out.println("The computer wins.");
      }
    }
  }
}
