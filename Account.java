public class Account{
private double balance;

public void setBalance(double balance) throws NegativeBalanceException{
   if(balance < 0){
      throw new NegativeBalanceException();
      }
      this.balance = balance;
      }
}