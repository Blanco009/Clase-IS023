import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Que edad tienes?: ");
		int age = Integer.parseInt(scanner.nextLine());
		if (age >= 0 && age <= 10) {
			System.out.println("Ninio!");
		} else if (age >= 11 && age <= 14) {
			System.out.println("Preadolescente!");
		} else if (age >= 15 && age <= 17) {
			System.out.println("Adolescente!");
		} else if (age >= 18 && age <= 64) {
			System.out.println("Adulto!");
		} else {
			System.out.println("Adulto mayor!");
		}
		
	}

}
