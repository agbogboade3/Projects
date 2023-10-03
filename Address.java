public class Address
{
  //attributes
  private String street, aptNum, city, state;
  private int zip;
  
  //constructors
  public Address(String street, String aptNum, String city, String state, int zip)
  {
    this.street = street;
    this.aptNum = aptNum;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }
  
  public Address(String street, String city, String state, int zip)
  {
    this(street, "", city, state, zip);
  }
  
  //write the getters and setters for this on your own! >:)
  
  
  /**
     Determines if given Address object comes before calling Address object,
     based on the zip code
     @param other Address object to compare to
     @return whether the given object comes before the calling object
  */
  public boolean comesBefore(Address other)
  {
//    if(other.zip < this.zip)
//     {
//      return true;
//     }
//     else
//     {
//      return false;
//   }
    return (other.zip < this.zip);
  }
  // define and return the string represention of an address
  public String toString()
  {
   String str = street + " " + aptNum + "\n" + city + "," + state + "," + zip;
   return str;
// alt   return street + " " + aptNum + "\n" + city + "," + state + "," + zip;

  }
  public boolean equals(Address other)
  {//check if the street, aptNum, city, state, and zip are the same
  if(this.street.equals(other.street) && this.aptNum.equals(other.aptNum) && this.city.equals(other.city)
  && this.state.equals(other.state) && this.zip == other.zip)
  {
   return true;
  }else
  {
   return false;
  }
/*  return (this.street.equals(other.street) && this.aptNum.equals(other.aptNum) && this.city.equals(other.city)
  && this.state.equals(other.state) && this.zip == other.zip) */
  
  }
  /**
     Creates and returns an object that is a copy of the calling object
     @return a new address object 
  */
  public Address copy(){
     Address obj = new Address(this.street, this.aptNum, this.city,
               this.state, this.zip);
     return obj;
  }
  
  public Address(Address obj)
  {
    this(obj.street,obj.aptNum,obj.city,obj.state,obj.zip);
    //OR
//     this.street = obj.street;
//     this.aptNum = obj.aptNum;
//     this.city = obj.city;
//     this.state = obj.state;
//     this.zip = obj.zip;
    }
}