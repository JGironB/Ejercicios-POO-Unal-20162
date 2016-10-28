package fibonaccithreads;

public class FibonacciTest 
{

	public static void main(String[] args) 
	{
		FibonacciThread f1 = new FibonacciThread(20);
		FibonacciThread f2 = new FibonacciThread(50);
		Thread f3 = new Thread(new FibonacciThreadRunnable(100));
		
		f1.start();
		f2.start();
		f3.start();
	}

}

class FibonacciThread extends Thread
{
	
	private int numbers;
	
	public FibonacciThread(int numbers)
	{
		this.numbers = numbers;
	}
	
	public void run()
	{
		int firstNumber = 0;
		int secondNumber = 1;
		int numbers = 50;
		
		System.out.println(1);
		
		for(int i=0; i<numbers; i++)
		{
			int aux = secondNumber;
			
			secondNumber += firstNumber;
			
			firstNumber = aux;
			
			System.out.println(secondNumber);
		}
	}
	
}

class FibonacciThreadRunnable implements Runnable
{
	
	private int numbers;
	
	public FibonacciThreadRunnable(int numbers)
	{
		this.numbers = numbers;
	}
	
	@Override
	public void run() 
	{
		int firstNumber = 0;
		int secondNumber = 1;
		int numbers = 50;
		
		System.out.println(1);
		
		for(int i=0; i<numbers; i++)
		{
			int aux = secondNumber;
			
			secondNumber += firstNumber;
			
			firstNumber = aux;
			
			System.out.println(secondNumber);
		}
	}
	
}
