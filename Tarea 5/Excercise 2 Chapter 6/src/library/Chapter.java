package library;
import java.util.ArrayList;

public class Chapter 
{
	ArrayList<Page> pages = new ArrayList<>();
	Page p = new Page();
	String name;
	
	public Chapter(String name)
	{
		this.name = name;
	}
	
	public void addPages(int n_pages)
	{
		for(int i=0; i<n_pages; i++)
		{
			pages.add(p);
		}
	}
	
	public int showPages()
	{
		return pages.size();
	}
	
	public String showName()
	{
		return this.name;
	}
}
