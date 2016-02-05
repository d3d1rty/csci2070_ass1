import java.util.Scanner;

/**
 * This program prints a story based on the user input.
 * Author: Richard Davis
 */

public class RichardDavisWord
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in); // creates scanner object
    String name, age, city, college, profession, animal, pet; // declares all variables

    // gets input from the user
    System.out.print("Enter a name: ");
    name = in.nextLine();

    System.out.print("Enter an age: ");
    age = in.nextLine();

    System.out.print("Enter the name of a city: ");
    city = in.nextLine();

    System.out.print("Enter the name of a college: ");
    college = in.nextLine();

    System.out.print("Enter the name of a profession: ");
    profession = in.nextLine();

    System.out.print("Enter a type of animal: ");
    animal = in.nextLine();

    System.out.print("Enter a pet's name: ");
    pet = in.nextLine();

    // prints story using interpolation
    System.out.printf("\nThere once was a person named %s who lived in %s.\n", name, city);
    System.out.printf("At the age of %s, %s went to college at %s.\n", age, name, college);
    System.out.printf("%s graduated and went to work as a %s.\n", name, profession);
    System.out.printf("Then, %s adopted a(n) %s named %s.\n", name, animal, pet);
    System.out.println("They both lived happily ever after!");

    // terminates program
    System.exit(0);
  }
}
