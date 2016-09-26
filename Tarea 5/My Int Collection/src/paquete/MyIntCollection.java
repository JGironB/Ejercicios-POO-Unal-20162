package paquete;

import java.util.ArrayList;

public class MyIntCollection extends ArrayList<Integer> 
{

	private int smallestInt;
	private int largestInt;
	private int total;


	public MyIntCollection() 
	{

		super();

		total = 0;
	}

	public boolean add(int i) 
	{

		if (this.isEmpty())
		{
			smallestInt = i;
			largestInt = i;
		} else {
			if (i < smallestInt)
				smallestInt = i;
			if (i > largestInt)
				largestInt = i;
		}

		total = total + i;

		return super.add(i);
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
		return ((double) total) / ((double) this.size());
	}
	
	public void printSortedContents()
	{
		int array[] = new int[this.size()];
				
		boolean notordered= false;
		int temp;
		
		
		for(int i=0; i<array.length; i++)
		{
			array[i] = this.get(i);
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
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}