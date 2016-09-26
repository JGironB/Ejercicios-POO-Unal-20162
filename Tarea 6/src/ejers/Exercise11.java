package ejers;

public class Exercise11 
{	
	
	public static void main(String[] args)
	{
		Box box1 = new Box(5);
		Box box2 = new Box(5);
		Box biggerBox = new Box (20);

        box1.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box1.add( new Book("Robert Martin", "Clean Code", 1) );
        box1.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box2.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box2.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box2.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println("Smaller boxes:");
        
        System.out.println(box1);
        System.out.println(box2);
        
        biggerBox.add(box1);
        biggerBox.add(box2);
        
        System.out.println("\nBigger box:");
        System.out.println(biggerBox);
        
        System.out.println("\nA box into itself: ");
        biggerBox.add(biggerBox);
        System.out.println(biggerBox);
        
	}

}

class Book implements ToBestored
{

	String writer;
	String title;
	double weight;
	
	public Book(String writer, String title, double weight)
	{
		this.writer = writer;
		this.title = title;
		this.weight = weight;
	}
	
	@Override
	public double weight() 
	{
		return weight;
	}
	
	@Override
	public String toString()
	{
		return writer + ": " + title;
	}
	
}

class CD implements ToBestored
{

	String artist;
	String title;
	int year;
	
	public CD(String artist, String title, int year)
	{
		this.artist = artist;
		this.title = title;
		this.year = year;
	}
	
	@Override
	public double weight() 
	{
		return 0.1;
	}
	
	@Override
	public String toString()
	{
		return artist + ": " + title + " (" + year + ")";
	}
	
}

class Box implements ToBestored
{
	private double capacity;
	private double weight;
	private int things = 0;
	
	public Box(double capacity)
	{
		this.capacity = capacity;
	}
	
	public void add(ToBestored thing)
	{
		if(weight < capacity)
			weight += thing.weight();
		
		else
			System.out.println("There's no space, look for another box");
		
		things++;
	}
	
	@Override
	public double weight()
	{
		return weight;
	}
	
	@Override
	public String toString()
	{
		return "Box: " + things +", total weight " + weight + " kg";
	}
	
}


