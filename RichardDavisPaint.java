import java.util.Scanner;

/**
 * This program calculates the cost for paint.
 * Author: Richard Davis
 */

public class RichardDavisPaint
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in); // creates a scanner object
    int econBuckets, midBuckets, premBuckets; // declares variables to hold input
    double priceEcon = 20.00; // price for economy paint
    double priceMid = 35.00; // price for mid-grade paint
    double pricePrem = 50.00; // price for premium paint
    double totalPrice; // total price of paint purchased

    System.out.println("Welcome to Richard Davis' Paint Purchasing Calculator\n");

    // prompts the user for number of buckets purchased for each type
    System.out.print("Enter the number of economy paint buckets: ");
    econBuckets = in.nextInt();

    System.out.print("Enter the number of mid-grade paint buckets: ");
    midBuckets = in.nextInt();

    System.out.print("Enter the number of premium paint buckets: ");
    premBuckets = in.nextInt();

    // displays number of buckets of each type to purchase
    System.out.println("Economy Paint " + econBuckets + " purchased");
    System.out.println("Mid-grade Paint " + midBuckets + " purchased");
    System.out.println("Premium Paint " + premBuckets + " purchased");

    // calculates total price
    totalPrice = (econBuckets * priceEcon) + (midBuckets * priceMid) + (premBuckets * pricePrem);

    // displays total price of paint purchased to user
    System.out.printf("The total cost for paint is $%.2f\n", totalPrice);

    // terminates program
    System.exit(0);
  }
}
