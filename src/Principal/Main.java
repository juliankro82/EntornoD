package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();
        System.out.println("Buenas, " + nombre + "rama-conflicto");
        System.out.println("Cambio hecho en feature-test");
		
		sc.close();


	}

}
