import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hey! Guess how much these new Jordan's cost?");
    double guess = scan.nextDouble();
     guessCost(guess);
  }

  public static void guessCost(double guess) {
    if (guess == 120) {
      System.out.println("Yay! Your guess was correct!");
    } else {
      System.out.println("Sorry that is incorrect, you're welcome to guess again.");

    }
  }

}