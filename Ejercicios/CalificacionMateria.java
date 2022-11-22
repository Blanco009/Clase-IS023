import java.util.Scanner;

public class CalificacionMateria {

	public static void main(String[] args) {
		// calcular la nota de N cantidad de alumnos
		Scanner leer = new Scanner(System.in);
		System.out.println("A cuantos alumnos desea calcular la nota?: ");
		int n = leer.nextInt();
		double examen1 = 0, examen2 = 0, proyecto = 0, tareas = 0, notaExamen1, nota_final= 0;
		String nombre = "";
		for (int i = 1; i <= n; i++) {
			System.out.println("Cual es el nombre del estudiante?: ");
			nombre = leer.next();
			System.out.println("Porcentaje del examen 1 (20%)?: ");
			examen1 = leer.nextInt();
			System.out.println("Porcentaje del examen 2 (40%)?: ");
			examen2 = leer.nextInt();
			System.out.println("porcentaje del proyecto (30%)?: ");
			proyecto = leer.nextInt();
			System.out.println("Porcentaje de las tarea (10%)?: ");
			tareas = leer.nextInt();
			nota_final = examen1 + examen2 + proyecto + tareas;
			System.out.println("La nota del estudiante " + nombre + " es " + nota_final + "\n");
		}
		
		System.out.println("Fin del algoritmo.");
	}
	
}
