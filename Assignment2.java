/* Adetomiwa Gbogboade
CSCI 1301 - Computer Science I
Assignment 2
Due March 19, 2018, 11:58 PM

1=Monkey, 2=Robot, 3=Pirate, 4=Ninja, 5=Zombie 

~Algorithm~
1. Begin and explain the rules to the player
2. Prompt Player 1 input
3. Get player 1 input
4. Prompt Player 2 input
5. Compare player 1 and 2 input using the rules for Monkey,Robot,Pirate,Ninja,Zombie
6. See if there is a winner or not
7. Ask user if they want to play again
8. Terminate program if it's a no

*/
import java.util.Scanner; //To accept user nput
public class Assignment2
{
 public static void main(String[]args)
 {
    Scanner input = new Scanner(System.in);
    //String playAgain = input.nextLine();
   
    boolean again=false;
    
    do
      {//Do bracket
    //Prompt User to see if they want to play
    System.out.println("Welcome to Moropinizo (Monkey,Robot,Pirate,Ninja,Zombie). Player 1 and 2 must select a number from 1-5. They cannot be the same number. " );
    System.out.println("Player 1 enter a number from 1 to 5");
    int player1 = input.nextInt();
    System.out.println("Player 2 enter a number from 1 to 5");   
    //Getting player 2 input   
    int player2 = input.nextInt();
    //if choices are the same for both players (i.e. Case 1)
    if(player1 == 1 && player2 ==1 || player1 == 2 && player2 ==2 || player1 == 3 && player2 ==3 || player1 == 4 && player2 ==4 || player1 == 5 && player2 ==5 )
    {
    System.out.println("Nobody wins.");
    }
    else if(player1 == 1 && player2 == 2)//Case 2 Monkey vs Robot [1]
    {
    System.out.println("Monkey unplugs Robot. Player 1 wins!");
    } 
    else if(player1 == 1 && player2 == 3)//Case 3 Pirate vs Monkey [2]
    {
    System.out.println("Pirate skewers Monkey. Player 2 wins!");
    } 
    else if(player1 == 1 && player2 == 4)//Case 4 Monkey vs Ninja [1]
    {
    System.out.println("Monkey fools Ninja. Player 1 wins!");
    } 
    else if(player1 == 1 && player2 == 5)//Case 5 Zombie vs Monkey [2]
    {
    System.out.println("Zombie Savages Monkey. Player 2 wins!");
    } 
    else if(player1 == 2 && player2 == 1)//Case 6 Monkey vs Robot [2]
    {
    System.out.println("Monkey unplugs Robot. Player 2 wins!");
    } 
    else if(player1 == 2 && player2 == 3)//Case 7 Pirate vs Robot [2]
    {
    System.out.println("Pirate drowns Robot. Player 2 wins!");
    } 
    else if(player1 == 2 && player2 == 4)//Case 8 Robot vs Ninja [1]
    {
    System.out.println("Robot chokes Ninja. Player 1 wins!");
    } 
    else if(player1 == 2 && player2 == 5)//Case 9 Robot vs Zombie [1]
    {
    System.out.println("Robot crushes Zombie. Player 1 wins!");
    } 
    else if(player1 == 3 && player2 == 1)//Case 10 Pirate vs Monkey [1]
    {
    System.out.println("Pirate skewers Monkey. Player 1 wins!");
    } 
    else if(player1 == 3 && player2 == 2)//Case 11 Pirate vs Robot [1]
    {
    System.out.println("Pirate drowns robot. Player 1 wins!");
    }  
    else if(player1 == 3 && player2 == 4)//Case 12 Ninja vs Pirate [2]
    {
    System.out.println("Ninja karate chops Pirate. Player 2 wins!");
    } 
    else if(player1 == 3 && player2 == 5)//Case 13 Zombie vs Pirate [2]
    {
    System.out.println("Zombie eats Pirate. Player 2 wins!");
    } 
    else if(player1 == 4 && player2 == 1)//Case 14 Monkey vs Ninja [1]
    {
    System.out.println("Monkey fools Ninja. Player 1 wins!");
    } 
    else if(player1 == 4 && player2 == 2)//Case 15 Robot vs Ninja [1]
    {
    System.out.println("Robot chokes Ninja. Player 2 wins!");
    } 
    else if(player1 == 4 && player2 == 3)//Case 16 Ninja vs Pirate [1]
    {
    System.out.println("Ninja karate chops Pirate. Player 1 wins!");
    } 
    else if(player1 == 4 && player2 == 5)//Case 17 Ninja vs Zombie [1]
    {
    System.out.println("Ninja decapitates Zombie. Player 2 wins!");
    } 
    else if(player1 == 5 && player2 == 1)//Case 18 Zombie vs Monkey [1]
    {
    System.out.println("Zombie savages Monkey. Player 1 wins!");
    } 
    else if(player1 == 5 && player2 == 2)//Case 19 Robot vs Zombie [2]
    {
    System.out.println("Robot crushes Zombie. Player 2 wins!");
    } 
    else if(player1 == 5 && player2 == 3)//Case 20 Zombie vs Pirate [1]
    {
    System.out.println("Zombie eats Pirate. Player 1 wins!");
    }
    else if(player1 == 5 && player2 == 4)//Case 21 Ninja vs Zombie [2]
    {
    System.out.println("Ninja decapitates Zombie. Player 2 wins!");
    }  
    else if(player1>5 || player1<1)
    {
    System.out.println("Invalid choice, Player 1. Enter a number 1-5:");
    }
    else if(player2>5 || player2<1 || player1>5 || player1<1)
    {
    System.out.println("Invalid choice, Player 2. Enter a number 1-5:");
    }
    else if(player1>5 && player2>5 || player1<1 && player2<1)
    {
    System.out.println("Invalid choice, both players. Enter a number 1-5:");
    }
    //Asking the user if they want to play again
    System.out.println("Would you like to play again?");
 
    input.nextLine();
    String playAgain = input.nextLine();
    if(playAgain.equalsIgnoreCase("Yes")||playAgain.equalsIgnoreCase("Y"))
    {
      again = true;
    }
    else if(playAgain.equalsIgnoreCase("No")||playAgain.equalsIgnoreCase("N"))
    {
      again = false;
    }
    
    }//End of do bracket
    while(again==true);//loops back to beginning

 }
}
