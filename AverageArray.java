import java.util.Scanner;

public class AverageArray
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
  
    int number = 5;
    int[] myNums = new int[number];
    
    System.out.println("Enter "+number+" numbers \n");
    
    for(int i = 0;i<myNums.length;i++)//as long i is less than 5 it will keep increasing using i++
    {
       myNums[i]=input.nextInt();
    }
    
    for(int i = 0;i<myNums.length;i++)
    {
      System.out.println("Postion "+i+" holds value "+myNums[i]);
    }
    
    int sum = 0;
    for(int i = 0;i<myNums.length;i++)
    {
      sum+= myNums[i];
    }
    
    double average = sum/(double)myNums.length;
    
    System.out.println("The average is "+average);

  }
}