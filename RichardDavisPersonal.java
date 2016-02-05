/**
 * This program prints basic biographical data.
 * Author: Richard Davis
 */
public class RichardDavisPersonal
{
  public static void main(String[] args)
  {
    String name = "Richard Davis"; // stores name in a string
    String address = "123 Main St, Anytown, USA 37040"; // stores address in a string
    String phone = "931-555-1234"; // stores phone number in a string
    String major = "Information Systems"; // stores major in a string

    // prints biographical information separated by newline characters
    System.out.println(name + "\n" +
                       address + "\n" +
                       phone + "\n" +
                       major);

    // terminates program
    System.exit(0);
  }
}
