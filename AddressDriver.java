public class AddressDriver{
  public static void main(String[]args)
  {
  Address a = new Address("2000 Clayton State Blvd", "Morrow", "GA",30303);
  Address b = new Address("2000 Clayton State Blvd","227", "Morrow", "GA",30260);
  
//  System.out.println(a.comesBefore(b));
  System.out.println(a);
  System.out.println(b);
  String words = "The address is " +a;
  System.out.println(words);
  
  //this point forward is for testing for equality
  Address c = new Address("2000 Clayton State Blvd", "Morrow", "GA",30303);
  
  if(a.equals(c))
  {
   System.out.println("These addresses are the same.");
  }else
  {
   System.out.println("These addresses are not the same.");
  }
  
  //this is to test the copy method
  Address e = a.copy();
  System.out.println(a);
  System.out.println(e);
  System.out.println(a == e);


  
  
  }
}