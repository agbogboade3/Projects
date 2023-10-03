import java.util.Scanner;
public class BasicFileStrings
{
   public static void main(String[] args)
   { 
     Scanner sc = new Scanner(System.in);
     System.out.println("Greetings, What is your name?");
     String name = sc.nextLine();
     
     if (name.equals("mark"))
     {
     System.out.println("The name is !"+ name);
     }
     else 
     {
     System.out.println("Sorry, you lose!");
     }
     
     }//end of main
}//end of class
     