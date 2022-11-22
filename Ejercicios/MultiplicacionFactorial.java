import java.util.Scanner;

public class MultiplicacionFactorial {

	public static void main(String[] args) {
		// Calcula el resultado de la multiplicacion de dos factoriales
		System.out.println("Este algoritmo da el resultado de la operacion n!(m-n)!");
		Scanner scanner = new Scanner(System.in);
		int n,m,resta = 0;
		long resultado1 = 1, resultado2=1,multi=0; //almacenan el valor final del factorial
		System.out.println("Dijite un valor para m: ");
		m = scanner.nextInt();
		System.out.println("n tiene que ser menor que m! \n");
		System.out.println("Digite un valor para n: ");
		n = scanner.nextInt();
		if (m>n) {
			for(int i = n; i !=0; i--) {
				resultado1 *= i; //almacena cada resultado asiganado a la variable y las multiplica cada vez que pasa el ciclo
			}
			resta = m - n;
			for(int i = resta; i !=0; i--) {
				resultado2 *= i;
			}
			multi = (resultado1*resultado2);
		}
		System.out.println("El resultado de la operacion n!(m-n)! donde n es: " + n + "y m es: " + m + " el resultado de la resta (m-n) es: " + resta + " y la multiplicacion de " + n + "!" + "*" + resta + "! = " + multi + "\n" );
		System.out.println("Fin del algoritmo.");
	}

}
