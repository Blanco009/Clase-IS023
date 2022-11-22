package ClasesyObjetos;

import java.util.Scanner;

public class Empleado {
	//Atributos y caracteristicas
	Scanner input = new Scanner(System.in);
	String nombre_completo;
	String direccion;
	long id_empleado;
	float salario;
	//Metodos y acciones
	public void mostrar_empleado() {
		System.out.println("Nombre completo del empleado?: ");
		nombre_completo = input.nextLine(); 
		System.out.println("Cual es tu direccion?: ");
		direccion = input.nextLine();
		System.out.println("Cual es el id?: ");
		id_empleado = input.nextLong();
		System.out.println("Cual es el salario?: ");
		salario = input.nextFloat();
		System.out.println("Nombre completo del empleado: " + nombre_completo);
		System.out.println("La direccion es: " + direccion);
		System.out.println("El id es: " + id_empleado);
		System.out.println("El salario es de: " + salario);	
	}
	public float aumentar_salario(int aumento) {
		System.out.println("El salario era de: " + salario);
		salario = salario + aumento;
		System.out.println("El salario con aumento es de " + salario);
		return salario;
	}
	public float rebajar_salario(int rebaja) {
		if (rebaja <= salario) {
			salario = salario - rebaja;
			System.out.println("El salario con rebaja es de " + salario);
		}else {
			System.out.println("NO se realizó el rebajo.");
			System.out.println("Salario sin rebajo: " + salario);
		}
		return salario;
	}
	public void cambiar_nombre(String nombre) {
		nombre_completo = nombre;
		System.out.println("Se ha dado un cambio de nombre, su nuevo nombre es: " + nombre_completo);
		System.out.println("\nFin del algoritmo.");
	}
	

}

