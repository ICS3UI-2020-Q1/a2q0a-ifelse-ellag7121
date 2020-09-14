import java.util.Scanner;
/**
 * get the user's age and tell them whether or not they can get a drivers license and/or vote
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create scanner to get user input
    Scanner input = new Scanner(System.in);

    //store how old you have to be to get a drivers license
    final int LICENSE_AGE = 16;

    //store how old you have to be to vote
    final int VOTING_AGE = 18;

    //get the user's age and store it for later
    System.out.println("Please enter your age:");
    int age = input.nextInt();

    //check if the user is old enough to get a drivers license or to vote
    if (age >= VOTING_AGE){
      System.out.println("You are old enough to drive and vote!");
    } else if (age >= LICENSE_AGE){
      System.out.println("You can get your driver's license!");
    } else {
      System.out.println("Sorry, you are not old enough to drive or vote.");
    }
    
  }
}
