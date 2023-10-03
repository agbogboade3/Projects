/*
March 21, 2018
Gbogboade Adetomiwa Arrays-03212018.java
CSCI 1301

*/

import java.util.Scanner;//Importing the Scanner object
public class ArrayParallel
{
   public static void main(String[]args)
    {
     Scanner input = new Scanner(System.in);//Creating scanner object
     String[] colors = {"Red", "Purple", "Orange", "Yellow", "Green"}; //creating the array colors, with five elemments, and an index of 0-4
     String[] produce = new String[5];//Creating the array produce
     
     for(int i = 0; i < colors.length; i++)
     {
        System.out.println("Enter a Fruit or Veggie that goes with the color: "+colors[i]);
        produce[i] = input.next();//
     }

     int[] numbers = new int[5]; //Creates array numbers
     for(int index2 = 0; index2 < numbers.length; index2++)
     {
         System.out.println("Enter the number of " +produce[index2]+ "'s you want");//Prompts user to input the number of a specific produce they want
         numbers[index2] = input.nextInt();//Allows the program to accept the number of produce(this will only accept numbers) 
     }
     //Creates header
     System.out.println("///////////////////////////////////////////////////");
     System.out.println("//Color       Fruit or Vegetable    Number Wanted//");
     System.out.println("///////////////////////////////////////////////////");
     
     for(int i = 0; i < colors.length; i++)//This loop prints out all the information
     {
     // System.out.println(colors[i]+"\t\t"+produce[i]+"\t\t\t"+numbers[i]);//colors[i]+ prints out a fixed array "Colors", +produce[i]+ prints out whatever fruit or veggie we enter in at the moment same with numbers
     System.out.printf("  %-8s\t%-10s\t\t%-2d\n",colors[i],produce[i],numbers[i]);
     }
     System.out.println("///////////////////////////////////////////////////"); 
    }
}