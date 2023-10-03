import java.util.Scanner;
public class BasicFile
{
   public static void main(String[] args)
   { 
     Scanner sc = new Scanner(System.in);
     System.out.println("Greetings, How old are You?");
     int age = sc.nextInt();
     
     if (age>=21)
     {
     System.out.println("Welcome to the Party!");
     }
     else if (age>=18 && age<21)
     {
     System.out.println("Welcome to the club, but no drinking.");
     }
     else
     {
     System.out.println("Sorry, you are too young so you have to leave.");
     System.out.println("Goodbye!");
     }
     }//end of main
}//end of class
     