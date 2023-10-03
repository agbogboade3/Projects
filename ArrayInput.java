import java.util.*;
public class ArrayInput
{
 public static void main(String[]args)
 {
 Scanner input = new Scanner(System.in);
  System.out.println("What size do you want your array?");

  int arraySize = input.nextInt();

  int[] array2= new int[arraySize];
  System.out.println("Type in the numbers in your array:");
  for(int i=1;i<=array2;i++)//For this line i will go to the next term by one until it's equal to max
    {
      System.out.print(array2[i]);//will print out each term in the loop
      System.out.print("");
    }
  
 }
}