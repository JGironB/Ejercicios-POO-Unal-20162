package containers;

import java.util.ArrayList;

public class ContainerHistory
{
	
	private ArrayList<Double> myHistory = new ArrayList<>();
	
	public void add(double situation)
	{
		myHistory.add(situation);
	}
	
	public void reset()
	{
		myHistory.clear();
	}
	
	public String toString()
	{
		return "" + myHistory;
	}
	
	public double maxValue()
	{
		if(myHistory.isEmpty())
			return 0;
		
		else
		{
			double max = myHistory.get(0);
			
			for(int i=0; i<myHistory.size()-1; i++)
			{
				max = max<myHistory.get(i+1) ? myHistory.get(i+1) : max;
			}
			
			return max;
		}
	}
	
	public double minValue()
	{
		if(myHistory.isEmpty())
			return 0;
		
		else
		{
			double min = myHistory.get(0);
			
			for(int i=0; i<myHistory.size()-1; i++)
			{
				min = min>myHistory.get(i+1) ? myHistory.get(i+1) : min;
			}
			
			return min;
		}
	}
	
	public double average()
	{
		if(myHistory.isEmpty())
			return 0;
		
		else
		{
			double average = myHistory.get(0)/myHistory.size();
			
			for(int i=0; i<myHistory.size()-1; i++)
			{
				average += myHistory.get(i+1)/myHistory.size();
			}
			
			return average;
		}
	}
	
	public double greatestFluctuation()
	{
		double greatestFluctuation = Math.abs(myHistory.get(0) - myHistory.get(1));
		
		if(myHistory.size()==1 || myHistory.size()==0)
			return 0;
		
		else if(myHistory.size() == 2)
			return greatestFluctuation;
		
		else 
		{	
			for(int i=0; i<myHistory.size()-2; i++)
			{
				double toCompare = Math.abs(myHistory.get(i+1)-myHistory.get(i+2));
				greatestFluctuation = toCompare > greatestFluctuation ? toCompare : greatestFluctuation;
			}
					
			return greatestFluctuation;
		}
	}
	
	public double variance()
	{
		if(myHistory.size() == 1 || myHistory.size() == 0)
			return 0;
		
		else
		{
			double average = average();
			double variance = 0;
			
			for(int i=0; i<myHistory.size(); i++)
			{
				variance += Math.pow(myHistory.get(i)-average, 2);
			}
			
			variance /= myHistory.size()-1;
			
			return variance;
		}
	}
	
}
