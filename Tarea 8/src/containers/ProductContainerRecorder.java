package containers;

public class ProductContainerRecorder extends ProductContainer
{
	private double volume;
	private double capacity;
	ContainerHistory myHistory;
	
	public ProductContainerRecorder(String productName, double capacity, double initialVolume)
	{
		super(productName, capacity);
		
		volume = initialVolume;
		
		myHistory = new ContainerHistory();
		
		myHistory.add(initialVolume);
		
		this.capacity = capacity;
	}
	
	public String history()
	{
		return " " + myHistory;
	}
	
	@Override
	public double takeFromTheContainer(double amount) 
	{
	    if (amount < 0) 
	    {
	    	return 0.0;
	    }
	        
	    if (amount > volume) 
	    {
	    	double everything = volume;
	        volume = 0.0;
	        myHistory.add(0);
	        return everything;
	    }
	    
	    volume = volume - amount;
	    myHistory.add(volume);
	    return amount;
	}
	
	@Override
	public void addToTheContainer(double amount) 
    {
        if (amount < 0) 
        {
        	return;
        }
        
        if (amount <= getCurrentCapacity()) 
        {
            volume = volume + amount;
            myHistory.add(volume);
        } 
        
        else 
        {
            volume = capacity;
            myHistory.add(volume);
        }
    }
	
	@Override
	public double getCurrentCapacity()
	{
		return capacity - volume;
	}
	
	@Override
	public String toString() 
    {
        return "volume = " + volume + ", free space " + getCurrentCapacity();
    }

	public void printAnalysis()
	{
		System.out.println("Product: " + getName());
		
		System.out.println("History: " + myHistory + "\nGreatest product amount: " +
						   myHistory.maxValue() + "\nSmallest product amount: " +
						   myHistory.minValue() + "\nAverage: " + myHistory.average() +
						   "\nGreatest change: " + myHistory.greatestFluctuation() + 
						   "\nVariance: " + myHistory.variance());
	}
	
}
