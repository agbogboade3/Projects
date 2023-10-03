import java.util.*;

public class ExceptionalStuff{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String line = input.nextLine();
        try{
           int value = Integer.parseInt(line);
           int result = 2/value;
          //  System.out.println("Another One");
        }
        catch(NumberFormatException e){
         System.out.println("You done messed up son :(");
        } 
        catch(ArithmeticException e){
         System.out.println(e.getMessage());//prints default messagge
        }      
        
        System.out.println("Done");
     }   
}