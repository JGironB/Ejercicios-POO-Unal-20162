package paquete;
import java.util.*;
import javax.swing.*;

public class Main 
{

	public static void main(String[] args)
	{
	
	// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opci�n: \n\n1:Cuadrado\n2:Rect�ngulo");
		
		int opcion = entrada.nextInt();
		
		switch(opcion)
		{
			case 1:		
						double lado;
				   		System.out.println("Introduce el lado ");
				   		lado = entrada.nextDouble();
				   		System.out.println("�rea: "+ lado*lado);
				   		
			case 2:
						double base, altura;
						System.out.println("Introduce la base ");
						base = entrada.nextDouble();
						System.out.println("Introduce la altura ");
						altura = entrada.nextDouble();
						System.out.println("�rea: "+ base*altura);
						
			default: 
						System.out.println("Sigue las instrucciones pendejo");
						
						
		}
		
		
		
			
	
	
	

	

	}
}
