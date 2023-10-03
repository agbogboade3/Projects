public class Context{
 public void notSoStaticMethod()
 {
   System.out.println("I'm not static!");
   }
   public static void soVeryStaticMethod()
   {
   System.out.println("I'm static!");
   }
   public static void main(String[]args)
   {
    soVeryStaticMethod();
    //notSoStaticMethod();
   }
}