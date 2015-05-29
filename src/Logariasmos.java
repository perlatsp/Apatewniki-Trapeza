 
/**
 *
 * @author Perlat
 */
public class Logariasmos 
{
    private double balance;
    private double arxikhkatathesh;
    
    
    public Logariasmos()
    {
        balance = 0;
        arxikhkatathesh = 0;
    }
   
    
    public Logariasmos(double bal)
    {
        arxikhkatathesh = bal;
        this.balance = arxikhkatathesh;
    }
    
    
    //deposit money
    public double deposit(double poso)
    {
        balance += poso;
        return balance;
    }
    public void getLoan()
    {
        balance = +2000;
    }
    
    //withdraw money
    public double withdraw(double poso)
    {
        
        balance -=poso;
        if(balance <=0)
        {
            balance = 0;
        }
        return balance;
    }

    //getters
    public double getYpoloipo() 
    {
        return balance;
    }
    
}
