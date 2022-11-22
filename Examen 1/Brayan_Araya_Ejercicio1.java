import java.util.Scanner;

public class Brayan_Araya_Ejercicio1 {

	public static void main(String[] args) {
		// Examen de programacion I de Brayan Araya Rojas, ejercicio 1 
		System.out.println("Algoritmo que permite obtener la nota final de los estudiantes.\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Para cuantos alumnos desea calcular la nota?: ");
		int n = scanner.nextInt();
		String nombre = "";
		String apellido = "";
		Double examen1, examen2,proyecto,investigacion,examenFinal,notaFinal;
		Double notaExamen1, notaExamen2, notaProyecto, notaInvestigacion, notaExamenfinal;
		for (int i = 1 ; i <= n; i++ ) {
			System.out.println("Cual es el nombre del estudiante #" + i + " ?:" );
			nombre = scanner.next();
			System.out.println("Cual es el apellido del estudiante?: ");
			apellido = scanner.next();
			System.out.println("Cual es la nota en el primer examen?: ");
			examen1 = scanner.nextDouble();
			System.out.println("Cual es la nota en el segundo examen?: ");
			examen2 = scanner.nextDouble();
			System.out.println("Cual es la nota en el proyecto?: ");
			proyecto = scanner.nextDouble();
			System.out.println("Cual es la nota en investigacion?: ");
			investigacion = scanner.nextDouble();
			System.out.println("Cual es la nota del examen final?: ");
			examenFinal = scanner.nextDouble();
			notaExamen1 = (examen1 * 0.20);
			notaExamen2 = (examen2 * 0.20);
			notaProyecto = (proyecto * 0.15);
			notaInvestigacion = (investigacion * 0.15);
			notaExamenfinal = (examenFinal * 0.30);
			notaFinal = notaExamen1 + notaExamen2 + notaProyecto + notaInvestigacion + notaExamenfinal;
			if (notaFinal >= 0 && notaFinal <= 69) {
				System.out.println("El estudiante " + nombre + " " + apellido + " obtiene una nota de " + notaFinal + " Necesita mejorar! \n");
			}else if (notaFinal >= 70 && notaFinal <= 84) {
				System.out.println("El estudiante " + nombre + " " +  apellido + " obtiene una nota de " + notaFinal + " Muy bueno! \n");
			}else if (notaFinal >= 85 && notaFinal <= 100 ) {
				System.out.println("El estudiante " + nombre + " " + apellido + " obtiene una nota de " + notaFinal + " Excelente! \n");
			}else {
				System.out.println("Error, nota fuera del parametro pre-establecido. \n");
			}
				
		}
		System.out.println("Fin del algoritmo. \n");
	}

}
