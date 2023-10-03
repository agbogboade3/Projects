import java.util.Scanner;

public class Circumference
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    
    // System.out.println("What is the radius?");
    // radius = input.nextInt();
        
    for(int radius=0;radius<=20;radius=radius+1)
    {
       double circumference = 2*radius*3.14159;
       System.out.println("The circumference is "+circumference);
    }
  }
  
}  