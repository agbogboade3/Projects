/**
*Assignment 2
*Adetomiwa Gbogboade
*CSCI 1302
*/
public abstract class Appointment
{
 /** This is the super class which will serve as the base for all our derived classes
 * @param month the month of the year, the first number the program will always ask for
 * @param day number from 1-365
 * @param year 4 digit number. The only value the method will take and display output for are 2018
 * @param description what you will do on that day
 * @return description returns an event if user input is true, nothing if user input is false
 */
 private String description;
 private int month;
 private int day;
 private int year;
 /** Each class and subclass have a constructor.
 *
 */
  public Appointment(int month,int day,int year, String description)
 {
  this.description = description;
  this.month = month;
  this.day = day;
  this.year = year;
 } 
 public abstract boolean occursOn(int month,int day,int year);//this is our abstract method 
 {
  this.month = month;
  this.day = day;
  this.year = year;
 }
 public void setMonth(int month){
 this.month = month;
 }
 public int getMonth(){
 return month;
 }
 public void setDay(int day){
 this.day = day;
 }
 public int getDay(){
 return day;
 }
 public void setYear(int year){
 this.year = year;
 }
 public int getYear(){
 return year; 
} 
public void setDescipt(String description){
 this.description = description;
}
public String getDescript(){
return description;
}
/** toString method. This toString method is probably the most crucial part since it prints the description part of the appointment class
*The only thing we need to print is the appointments we have on that day
*/
public String toString(){
return description;
 }
}
//Onetime subclass
/**
*OneTime is a subclass in which all fields entered must be exact. So a doctor's appointment scheduled for this
*year doesn't occur monthly or daily. It only occurs once.
*/
class OneTime extends Appointment{
  
  public OneTime(int month,int day,int year,String description){
  super(month,day,year,description);
  }
/**The rules for this method is that all fields are exact. The occursOn method compares 
*user input month, day, and year with the Onetime subclasses parameters.
*If the month day and year all have the same value, then the description will print.
*/
@Override
public boolean occursOn (int month,int day,int year){
 if(month == super.getMonth() && day == super.getDay() && year == super.getYear()){ 
 return true;
 }
 else
 {
 return false;
 }
}  
}
/** 
*This next subclass is the daily subclass in which the if statement says that for occurs on to be true day must be less than 365
*Rules: Since this is daily day must be between 1 and 365.
*/
class Daily extends Appointment{
  
  public Daily(int month,int day,int year,String description){
  super(month,day,year,description);
  }

@Override
public boolean occursOn (int month,int day,int year){
 if(month >= super.getMonth() && day <= 365 && year >= super.getYear()){
 return true;
 }else{
 return false;
 }
}  
}
/**
*Monthly subclass
*This is similar to the other classes, the main difference is that the user input month has
*to be greater than or equal to the appointment date.
*/
class Monthly extends Appointment{ 
  public Monthly(int month,int day,int year,String description){
  super(month,day,year,description);
  }

@Override
public boolean occursOn (int month,int day,int year){
  if(month >= super.getMonth() && day <= super.getDay() && year >= super.getYear()){
 return true;
 }
 else{
 return false;
 }
}  
}
