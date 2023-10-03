/*Assignment 1 Example
*/
import java.util.Scanner;

public class AssignmentDemo5
{
   public static void main(String []args)
    {
      //Creates a Scanner Object
      Scanner sc = new Scanner(System.in);
      
      //Get Assignment Grades
      System.out.println("Enter Assignment1 Grade:");
      double Assign1= sc.nextDouble();
      
      System.out.println("Enter Assignment2 Grade:");
      double Assign2= sc.nextDouble();
      
      System.out.println("Enter Assignment3 Grade:");
      double Assign3= sc.nextDouble();
      
      System.out.println("Enter Assignment4 Grade:");
      double Assign4= sc.nextDouble();
      
      System.out.println("Enter Assignment5 Grade:");
      double Assign5= sc.nextDouble();
      
      //Calculate the Average Assignment Grade
      
      double aGrade = (Assign1+Assign2+Assign3+Assign4+Assign5)/5;
      
      System.out.println("The Average Assignement Grade= "+aGrade);
      
      //Get Test Grades
      System.out.println("Enter Test1 Grade: (0 to 100)");
      double test1= sc.nextDouble();
      
      System.out.println("Enter Test2 Grade: (0 to 100)");
      double test2= sc.nextDouble();

      System.out.println("Enter Test3 Grade: (0 to 100)");
      double test3= sc.nextDouble();
      
      //Calculate the Test Grade Average
      double tGrade = (test1+test2+test3)/3;
      System.out.println("The Average Test Grade= "+tGrade);
      
      // Get the Quiz Grade
      System.out.println("Enter the average Quiz Grade: (0 to 100)");
      double qGrade = sc.nextDouble();

      //Calculate the overal grade and output
      double oGrade = (aGrade*.25) + (tGrade*.60) + (qGrade*.15);
      System.out.println("The overall grade = "+oGrade);
      
    }

}