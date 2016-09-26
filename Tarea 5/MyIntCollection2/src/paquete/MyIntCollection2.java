package paquete;
import java.util.ArrayList;

public class MyIntCollection2 
{
	
	ArrayList<Integer> numbers;

	private int smallestInt;
	private int largestInt;
	private int total;

	public MyIntCollection2() 
	{
		numbers = new ArrayList<Integer>();
	
		total = 0;
	}


	public int size() 
	{

		return numbers.size();
	}

	
	public boolean add(int i)
	{
		if (numbers.isEmpty()) 
		{
			smallestInt = i;
			largestInt = i;
		}
	
		else 
		{
			if (i < smallestInt) smallestInt = i;
			if (i > largestInt) largestInt = i;
		}
	
		total = total + i;
	
		return numbers.add(i);
	}

	
	public int getSmallestInt()
	{
		return smallestInt;
	}

	public int getLargestInt() 
	{
		return largestInt;
	}

	public double getAverage() 
	{
		return ((double) total) / this.size();
	}
	public void printSortedContents()
	{
		int array[] = new int[this.size()];
				
		boolean notordered= false;
		int temp;
		
		
		for(int i=0; i<array.length; i++)
		{
			array[i] = numbers.get(i);
		}
		
		while(true)
		{
			notordered = false;
			for(int i=0; i< this.size()-1; i++)
			{
				if(array[i]>array[i+1])
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					
					notordered = true;
				}
				
			}
			if(notordered == false)
			{
				break;
			}
		}
		
		System.out.println("Sortered List: ");
		
		for(int i: array)
		{
			System.out.println(i);
		}
	}
	
}
