import java.util.*;
public class BackwardString{
public static void main(String[]args){
 Scanner input = new Scanner(System.in);
 System.out.println("Enter a string to reverse:");
 
 String word = input.nextLine();
 reverse(word);
 System.out.println();
 System.out.println("Word length: "+word.length());
}
public static void reverse(String str){
 str.split("");
 for(int i = str.length()-1;i>=0;i--){
  System.out.print(str.charAt(i));
 }
}
}