package paquete;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner leer= new Scanner(System.in);
		int n=0;
		
		System.out.println("Digite un número: ");
		n= leer.nextInt();
		
		if(n%2==0)
		{
			System.out.println("El numero "+n+" es par");
		}
		else
		{
			System.out.println("El numero "+n+" es impar");
		}
	}

}
