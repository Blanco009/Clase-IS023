package ClasesyObjetos;

import java.util.Scanner;

public class MainEmpleado {

	public static void main(String[] args) {
		int mas = 0, menos = 0;
		String name;
		Scanner input = new Scanner(System.in);
		
	
		
		Empleado empleado = new Empleado();
		empleado.mostrar_empleado();
		System.out.println("\n");
		System.out.println("De cuanto es el aumento salarial?: ");
		mas = input.nextInt();
		System.out.println("Cuanto es es la rebaja salarial?: ");
		menos = input.nextInt();
		System.out.println("Cambie su nombre: ");
		name = input.next();
		empleado.aumentar_salario(mas);
		empleado.rebajar_salario(menos);
		empleado.cambiar_nombre(name);
		

	}

}
