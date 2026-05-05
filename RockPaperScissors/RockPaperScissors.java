import java.util.Scanner;

public class RockPaperScissors {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  boolean game = true;
  boolean tryAgain = false;
  
  int playerScore = 0;
  int botScore = 0;
  
  while (game) {
   
   if (tryAgain) {
    System.out.print("Try again? (yes/no): ");
    
    String replay = scanner.next().toLowerCase().trim();
    
    if (replay.equals("yes")) {
     tryAgain = false;
     
     continue;
    } else if (replay.equals("no")) {
     System.out.print(playerScore + "-" + botScore + ", ");
     
     if (playerScore > botScore) System.out.print("You won! \n");
     else if (playerScore < botScore) System.out.print("You lost! \n");
     else System.out.print("You tied! \n");
    
     game = false;
     
     continue;
    } else {
     tryAgain = true;
     
     continue;
    }
   }
   
   System.out.print("Rock, paper, or scissors?: ");
   
   String playerMove = scanner.next().toLowerCase().trim();
   
   if (
    !playerMove.equals("rock") &&
    !playerMove.equals("paper") &&
    !playerMove.equals("scissors")
   ) {
    System.out.print("Invalid input! ");
    
    continue;
   }
   
   // This is where the computer decides its move
   int botMoveNumber = (int)(Math.random() * 3) + 1;
   
   String botMove = "";
   
   switch (botMoveNumber) {
    case 1:
     botMove = "rock";
     
     break;
    
    case 2:
     botMove = "paper";
     
     break;
     
    case 3:
     botMove = "scissors";
     
     break;
   }
   
   // Player win/lose conditions
   if (
    playerMove.equals("rock") && botMove.equals("scissors") ||
    playerMove.equals("paper") && botMove.equals("rock") ||
    playerMove.equals("scissors") && botMove.equals("paper")
   ) {
    playerScore++;
    
    System.out.print("You won! " + playerScore + "-" + botScore + "!");
   } else if (playerMove.equals(botMove)) {
    System.out.print("You tied! " + playerScore + "-" + botScore + "!");
   } else {
    botScore++;
    
    System.out.print("You lost! " + playerScore + "-" + botScore + "!");
   }
   
   tryAgain = true;
   
   System.out.print(" The computer chose " + botMove + ". \n");
  }
 }
}