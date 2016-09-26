package library;
import java.util.Scanner;



public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		String name;
		int caps;
		String namecap;
		int n_pags_cap;
		
		
		System.out.println("Ingrese el nombre de su libro");
		name = input.nextLine();
		
		Book book = new Book(name);
		
		System.out.println("Ingrese la cantidad de capítulos que tiene");
		caps= input.nextInt();
		
		for(int i=1; i<=caps; i++)
		{
			System.out.println("\nCapítulo " + i + ":");
			System.out.print("Título: ");
			namecap = input1.nextLine();
			Chapter x = book.addChapter(namecap);
			System.out.print("Páginas: ");
			n_pags_cap = input.nextInt();
			x.addPages(n_pags_cap);
		}
		
		
		book.printTable();
		System.out.println("\nEl libro tiene " + book.showChapters() + " capítulos y " +
		book.showPages() + " páginas en total.");
		
		input.close();
		input1.close();
		

	}

}
