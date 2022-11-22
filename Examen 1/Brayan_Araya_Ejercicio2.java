import java.util.Scanner;

public class Brayan_Araya_Ejercicio2 {

	public static void main(String[] args) {
		// Ejerciocio #2 del examen de programacion I de Brayan Araya Rojas
		System.out.println("Este algoritmo calcula el resultado de la operacion n!(m-n)! \n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero para n: ");
		int n = scanner.nextInt();
		int factorial = 1;//guarda el resultando de cada ciclo
		int factorial2 = 1;
		int m,resultado = 0;
		do {
			System.out.println("Ingrese un numero para m, dede ser mayor que n: ");
			m = scanner.nextInt();
		}while(m<n);
		int diferencia = (m-n); //para trabajar con el valor de la resta
		for(int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		for (int x = 1; x <= diferencia; x++) {
			factorial2 = factorial2 * x;
		}
		resultado = (factorial*factorial2);
		System.out.println("El resultado de la operacion n!(m-n)! es igual a " + resultado + "\n");
		System.out.println("Fin del algoritmo.");
	}

}
