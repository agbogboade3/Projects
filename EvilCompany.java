public class EvilCompany
{
  public static void main(String[]args)
  {
   double cashRolls = 0.62*4600000;
   System.out.print("The East Coast sales division produced $");
   System.out.print(String.format("%.2f",cashRolls));
   System.out.print(" in sales out of the total 4.6 million.");
  }
}