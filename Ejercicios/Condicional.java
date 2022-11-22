import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		System.out.println("Cual es tu nota?: ");
		Scanner scanner = new Scanner(System.in);
		double nota = Double.parseDouble(scanner.nextLine());
		if (nota < 0 || nota > 100) {
			System.out.println("Nota incorrecta!");
		} else if (nota >= 90 && nota <= 100) {
			System.out.println("Excelente!");
		} else if (nota >= 70 && nota <= 89) {
			System.out.println("Regular!");
		} else {
			System.out.println("Necesitas mejorar!");
		}
	}

}
