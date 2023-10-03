/*Adetomiwa Gbogboade
  CSCI 1301 - Computer Science I
  Assignment 1
  Due Febuaury 19, 2018 11:59 PM
  
  Algorithm
  Step 1:
  Ask for grades in the order: Assignment, Test, and Quiz.
  Step 2:
  Find the mean scores for Assignment,Test and Quiz.
  Step 3:
  Multiply all the scores by their weight, and add to get average grade.
  Step 4:
  Display your score.
*/
import java.util.Scanner;
public class Grade
{
  public static void main (String [] args)
  {
      Scanner input = new Scanner(System.in);
          
      System.out.println("What is the grade for your first assignment?(enter a number)");
      double firstAssign = input.nextDouble(); 
      
      System.out.println("What is the grade for your second assignment?");
      double secondAssign = input.nextDouble(); 
      
      System.out.println("What is the grade for your third assignment?");
      double thirdAssign = input.nextDouble(); 
      
      System.out.println("What is the grade for your fourth assignment?");
      double fourthAssign = input.nextDouble(); 
      
      System.out.println("What is the grade for your fifth assignment?");
      double fifthAssign = input.nextDouble(); 
      
      System.out.println("What is the grade for your first test?");
      double firstTest = input.nextDouble(); 
      
      System.out.println("What is the grade for your second test?");
      double secondTest = input.nextDouble(); 
      
      System.out.println("What is the grade for your third test?");
      double thirdTest = input.nextDouble(); 
      
      System.out.println("What is your average quiz grade?");
      double quizGrade = input.nextDouble(); 
      
      double AssiAvg = ((firstAssign + secondAssign +thirdAssign + fourthAssign + fifthAssign)/5);
      
      double TestAvg = ((firstTest + secondTest + thirdTest)/3);
      
      double Score = (AssiAvg*.25+TestAvg*.60+quizGrade*.15);
      
      System.out.println("Your overall grade in this class is:"+String.format("%.3f",(Score)));
      }
}
 

