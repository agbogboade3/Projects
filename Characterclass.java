public class Characterclass
{
 public static void main(String[]args){
  int total = countDigits("ABCDEFG");
  System.out.println(total);
 }

public static int countDigits(String word){
 int counter = 0;
 for(int i=0; i<word.length();i++){
  if(Character.isDigit(word.charAt(i))){
   counter++;
  }
 }
 return counter;
}
}