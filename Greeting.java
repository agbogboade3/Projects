import java.util.Scanner;
public class Greeting
{
       public static void main (String[] args)
       {
           Scanner input = new Scanner(System.in);
           System.out.println("Greetings! What is your first name?");
           String firstname = input.nextLine();
           
           System.out.println("What is your last name?");
           String lastname = input.nextLine();

           
           System.out.println("Hi " +firstname+ " " +lastname+ "!");
           
       }
}       