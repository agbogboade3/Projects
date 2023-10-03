public class Employees{
   private String name;
   private String id;
   private static int empId = 100;
   
   //new attribute for aggregation lecture
   private Address addr;
   
   public Employees(String name){
      this.name = name;
      this.id = empId + "";
      empId++;
      
      //*This creates a shallow copy
      //
      //
      this.addr = new Address(addr);
      }
      
   public String toString(){
       return "Employee #" + id + " - " + name + "\n" +addr;
   }    
}
      