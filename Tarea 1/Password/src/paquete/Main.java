package paquete;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer= new Scanner(System.in);
		String pass;
		String pass2;
		
		while(true)
		{
			System.out.print("Ingrese la contraseña:");
			pass= leer.nextLine();
			
			if(pass.equals("carrot"))
			{
				System.out.println("Correcto! \n"+"El secreto es: jryy qbar!");
				break;
			}
			else
			{
				System.out.println("Error!");
			}
		}
		
		System.out.print("Ingrese la contraseña:");
		pass2= leer.nextLine();
			
		if(pass.equals(pass2))
		{
			System.out.println("Correcto!");
			
		}
		else
		{
			System.out.println("Error!");
		}
		
		while(true)
		{
			System.out.print("Ingrese la contraseña:");
			pass2= leer.nextLine();
			
			if(pass.equals(pass2))
			{
				System.out.println("Correcto!");
				break;
			}
			else
			{
				System.out.println("Error!");
			}
		}
		
		while(true)
		{
			System.out.print("Ingrese la contraseña:");
			pass= leer.nextLine();
			
			if(pass.equals("carrot"))
			{
				System.out.println("Correcto! \n"+"El secreto es: wnin");
				break;
			}
			else
			{
				System.out.println("Error!");
			}
		}
	}

}
