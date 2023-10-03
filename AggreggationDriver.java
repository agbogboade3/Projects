public class AggreggationDriver
{
  public static void main(String[]args)
  {
   Address someAddress = new Address("2000 Clayton State Blvd", "Morrow", "GA",30303);
   Employee emp = new Employee("Bob", someAddress);
   
   System.out.println(emp);
   
   someAddress.setZip(38493);
  }
}

