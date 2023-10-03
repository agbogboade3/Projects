public class EmployeesDriver
{
   public static void main(String[]args)
   {
    Employees emp1 = new Employees("Bob");
    System.out.println(emp1);
    
    Employees emp2 = new Employees("Grace");
    System.out.println(emp2);
    System.out.println(emp1);
   }
}