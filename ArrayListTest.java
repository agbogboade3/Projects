import java.util.*;
public class ArrayListTest{
   public static void main(String[]args){
    ArrayList<Character> letters = new ArrayList<>();
    
   letters.add('A');
   letters.add('B');
   letters.add('C');
   letters.add('E');
   letters.add('Z');
   letters.add('M');
   letters.add('J');
   
   for(char letter : letters){
   System.out.print(letter + ", ");
   }
   System.out.println();
   
   letters.add(5, 'I');
   letters.set(6, 'O');
   
   for(char letter ; letters){
    System.out.print(letter + ", ");
    }
   }
   }