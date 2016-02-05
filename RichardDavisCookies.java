import java.util.Scanner;

/**
 * This program calculates calories consumed from cookies.
 * Author: Richard Davis
 */

public class RichardDavisCookies
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in); // creates scanner object
    int numCookiesEaten; // number of cookies the user has eaten
    int servingSize; // the serving size of the container
    int caloriesPerServing; // the calories in each serving
    double totalCalories; // the calories consumed by the user

    servingSize = 3; // equal to number of cookies per serving
    caloriesPerServing = 200; // equal to calories in each serving

    // prompts user for number of cookies eaten and stores input
    System.out.print("Enter the number of cookies Richard Davis has eaten: ");
    numCookiesEaten = in.nextInt();

    // calculates the total calories that the user has consumed
    totalCalories = caloriesPerServing * (double)(numCookiesEaten) / servingSize;

    // displays the result
    System.out.print("The number of calories Richard Davis consumed from eating ");
    System.out.printf("%d cookies is %.2f calories.\n", numCookiesEaten, totalCalories);

    // terminates program
    System.exit(0);
  }
}
