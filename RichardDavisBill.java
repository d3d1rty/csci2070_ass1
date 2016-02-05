import java.util.Scanner;

/**
 * This program calculates the cost for a restaraunt bill.
 * Author: Richard Davis
 */

public class RichardDavisBill
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in); // creates a scanner object
    double charge, tax, tip, total; // declares variables to store meal info
    double taxRate = .0675; // tax rate
    double tipRate = .20; // tip rate

    // prompts user for input
    System.out.print("Enter the charge for the meal: ");
    charge = in.nextFloat();

    // calculates the tax, tip, and total
    tax = charge * taxRate;
    tip = (charge + tax) * taxRate;
    total = charge + tax + tip;

    // displays the results
    System.out.printf("Meal Charge: $%8.2f\n", charge);
    System.out.printf("Tax:         $%8.2f\n", tax);
    System.out.printf("Tip:         $%8.2f\n", tip);
    System.out.printf("Total:       $%8.2f\n", total);
    // terminates program
    System.exit(0);
  }
}
