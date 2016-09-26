package paquete;

public class LyyraCard 
{
	private double balance;
	
	public LyyraCard(double balanceAtStart)
	{
        balance = balanceAtStart;
    }

    public String toString() 
    {
        return "The card has "+ balance +" euros";
    }
    
    public void payEconomical() 
    {
        balance -= 2.50;
    }

    public void payGourmet() 
    {
        balance -= 4.00;
    }
    
    public void loadMoney(double amount) 
    {
    	
    	if( balance + amount <= 150 && balance + amount >= 0)
    	balance += amount;
    	
    	else if (balance + amount > 150)
    	balance = 150;
    }
    
}
