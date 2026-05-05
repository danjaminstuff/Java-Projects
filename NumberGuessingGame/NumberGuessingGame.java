import java.util.Scanner;

class NumberGuessingGame {
 public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  
  final int number = (int)(Math.random() * 100) + 1;
  
  int guess = 0;
  
  while (guess != number) {
   
   System.out.print("Guess a number: ");
   
   guess = scanner.nextInt();
   
   if (guess > number) {
    System.out.println("Too high!");
   } else if (guess < number) {
    System.out.println("Too low!");
   }
  }
  
  System.out.println("You win!");

  scanner.close();
 }
}