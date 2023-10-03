/*Our assignment 8/13/2018
Print out the numbers and letters
*/
public class ArrayReview
{
 public static void main(String [] args)
 {
  int[]numbers = new int[10];
  String[]words = {"longing","rusted","furnace","daybreak","seventeen","benign","nine","homecoming","one","frieght car"};
  
  for(int i=0;i<numbers.length;i++)
  {
    numbers[i]= i+1;
  }
  for(int i=0;i<words.length;i++)
  {
   System.out.println(i + 1 +"."+words[i]);
  }
 }
}  