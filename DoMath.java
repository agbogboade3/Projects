import java.util.*;
public class DoMath
{
   public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   
   
   int string = input.nextInt();
   int[]arr=new int[string];
   for(int i = 0;i<arr.length;i++){
     arr[i]=i;
   }
   for(int i = 0;i<arr.length-1;i++){
     if(i%2 !=0){
      arr[i] = arr[i]*2;
      if(arr[i]>9){
       arr[i] = arr[i] - 9;
      }
     }
   }
   for(int i = 0;i<arr.length;i++){
    System.out.println(arr[i]);
   }
   }
}