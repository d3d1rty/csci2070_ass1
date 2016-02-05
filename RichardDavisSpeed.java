import java.util.Scanner;

/**
 * This program calculates the time it takes for a sound wave to travel a given distance
 * through several different mediums.
 * Author: Richard Davis
 */

public class RichardDavisSpeed
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in); // creates a scanner object
    String medium; // declares a variable to store medium input
    double distance, time; // declares vairable for time and distance
    int rateAir = 1100; // 1100 feet per second
    int rateWater = 4900; // 4900 feet per second
    int rateSteel = 16400; // 16400 feet per second

    // prompts the user for which medium
    System.out.print("Enter your choice ('air', 'water', or 'steel'): ");
    medium = in.nextLine();

    // calculates and displays time for travel of sound wave based on medium
    if (medium.compareToIgnoreCase("air")==0) {
      System.out.print("Enter the distance in feet: ");
      distance = in.nextDouble();
      time = distance / rateAir;
      System.out.printf("It will take a sound wave %.2f seconds to travel %.2f feet.\n", time, distance);
    } else if (medium.compareToIgnoreCase("water")==0) {
      System.out.print("Enter the distance in feet: ");
      distance = in.nextDouble();
      time = distance / rateWater;
      System.out.printf("It will take a sound wave %.2f seconds to travel %.2f feet.\n", time, distance);
    } else if (medium.compareToIgnoreCase("steel")==0) {
      System.out.print("Enter the distance in feet: ");
      distance = in.nextDouble();
      time = distance / rateSteel;
      System.out.printf("It will take a sound wave %.2f seconds to travel %.2f feet.\n", time, distance);
    } else {
      System.out.println("Not a valid choice.");
      System.exit(0);
    }

    // terminates program
    System.exit(0);
  }
}
