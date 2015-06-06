
import javax.swing.JOptionPane;

 
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
    public Logariasmos(String Username)
    {
       
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
            JOptionPane.showMessageDialog(null, "You have no more Money.");
            balance = 0;
        }
        else if(balance <=100)
        {
            JOptionPane.showMessageDialog(null, "Your are getting poor, please contact Varoufakis to help you.");
        }
        return balance;
    }

    //getters
    public double getYpoloipo() 
    {
        return balance;
    }

}
