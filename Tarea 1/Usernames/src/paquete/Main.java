package paquete;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner leer= new Scanner(System.in);
		String user;
		String pass;
		
		System.out.print("Ingrese su usuario: ");
		user= leer.nextLine();
		System.out.print("Ingrese su contraseña: ");
		pass= leer.nextLine();
		
		if(((user.equals("alex")) && (pass.equals("mightyducks"))) || ((user.equals("emily")) && (pass.equals("cat"))))
		{
			System.out.println("Usted ha ingresado al sistema!");
		}
		else
		{
			System.out.println("Usuario o contraseña invalidos!");
		}
		
	}

}
