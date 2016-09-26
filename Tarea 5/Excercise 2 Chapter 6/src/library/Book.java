package library;
import java.util.ArrayList;

public class Book 
{
	ArrayList<Chapter> chapters = new ArrayList<>();
	String name;
	
	public Book(String name)
	{
		this.name = name;
		
	}
	
	public Chapter addChapter(String name)
	{
		Chapter x = new Chapter(name);
		chapters.add(x);
		return x;
		
	}
	
	public int showChapters()
	{
		return chapters.size();
		
	}
	
	public int showPages()
	{
		int n_pages = 0;
		
		for(Chapter i: chapters)
		{
			n_pages += i.showPages();
		}
		
		return n_pages;
	}
	
	public void printTable()
	{
		int cont = 1;
		int cont_pag = 1;
		System.out.println("\nBook: " + this.name);
		
		for(Chapter i: chapters)
		{
			System.out.println("Chapter " + cont + ": " + i.showName()+" -------->  Pág " + cont_pag + ".");
			
			cont_pag += i.showPages();
			
			cont++;
		}
	}
	
}
