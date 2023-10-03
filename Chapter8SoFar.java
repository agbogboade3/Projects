public class Chapter8SoFar{
  public static void main(String[]args){
     Circle c1 = new Circle();
     Circle c2 = new Circle(3.0);
     
     System.out.println(c1);
     System.out.println(c2 == c1);//this line is not a syntax error
     System.out.println(c2.equals(c1));
     
     c1.setRadius(3.0);
     System.out.println(c1);
     System.out.println(c1 == c2);//this line is not a syntax error
     System.out.println(c1.equals(c2));
     
     }
}

class Circle{
  private double radius;
  
  /**
  
  */
  
  
  public Circle(double radius) {
     this.radius = radius;
  }
  
  /**
  
  */
  
  public Circle() {
     this(0.0);
  }
  
  /**
  
  */
  public void setRadius(double radius) {
      this.radius = radius;
  }
  
  /**
  
  */
  public double getRadius(){
     return radius;
 }
 
 /**
  
  */
 public double getArea(){
   return Math.PI * radius * radius;
  }
  
 /**
  
  */
  
 public boolean equals(Circle obj) {
   return this.getArea() == obj.getArea();
 }
 
 /**
  
  */
  
 public String toString() {
  return "radius: " + radius + ", area: " + getArea();
  }  
   
 
  
}