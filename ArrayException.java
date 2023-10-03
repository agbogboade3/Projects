import java.util.*;
public class ArrayException{
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  int[]values = new int[4];

  try{
    values[4] = 10;
    values[3] = 23-10;
  }
  catch(ArrayIndexOutOfBoundsException e){
     System.out.println("Error at index: "+e.getMessage());
  }
  catch(Exception e){
     System.out.println("Unknown error: "+e.getMessage());
  }
  
  }
}