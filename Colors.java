//0-10 blue, 10-20 red, 20-30 green, anything else wrong color
//1. Asks the user for a number
//2.If the number is less than or equal to 10 display (blue)
//3.If the number is greater than or equal to 10 and less than or equal to 20 display (red)
//4.If the number is greater than or equal to 20 and less than or equal to 30 display (green)
//else display wrong color

import java.util.Scanner;
public class Colors
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int num;
      System.out.println("Give me a number ");
      num = input.nextInt();
      
      if(num<=10)
      {
      System.out.println("Blue");
      }
      else if(num<=20 && num>10)
      {
      System.out.println("Red");
      }
      else if(num<=30 && num>20)
      {
      System.out.println("Green");
      }
      else
      {      
      System.out.println("Wrong color ");
      }
   }
}    