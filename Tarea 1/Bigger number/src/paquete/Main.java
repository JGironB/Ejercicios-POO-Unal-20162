package paquete;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Escriba dos numeros: ");
		x=leer.nextInt();
		y=leer.nextInt();
		
		int mayor=Math.max(x, y);
		System.out.println("El número más grande es: "+ mayor);
		
		

	}
	
}
