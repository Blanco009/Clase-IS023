import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quiz #2 Brayan");
		System.out.println();
		System.out.println("Programa que imprime la suma de los numeros desde A hasta B ingresado por el usuario.");
		System.out.println();
		System.out.println("Dame un valor para A: ");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.println("Dame un valor para B: ");
		int b = Integer.parseInt(scanner.nextLine());
		int contador = a;
		int suma = 0;
		while (b <= a) {
			System.out.println("ES OBLIGATORIO QUE B SEA MAYOR QUE A.");
			System.out.println("Ingresa un nuevo valor para B: ");
			b = Integer.parseInt(scanner.nextLine());
			if (b > a) {
				for (contador = a; contador <= b; contador++) {
					suma += contador;
				}
				break;
			}
		}
		suma=
		System.out.println("La suma de los numeros de " + a + " hasta " + b + " es: " + suma + "\n");
		System.out.println("Fin del programa.");
	}

}
