import javax.swing.JOptionPane;

public class Brayan_quiz4 {

	public static void main(String[] args) {
		// Quiz 4 Brayan
		int vectorUno[] = { 23, 81, 17, 20, 8, 11 };
		int vectorDos[] = { 21, 30, 5, 27, 32, 12 };
		int suma[] = new int[vectorUno.length];
		int resta[] = new int[vectorUno.length];
		int escalar[] = new int[vectorUno.length];
		int numEscalar,seleccion;
		// muestra el valor de vectorUno
		System.out.println("El arreglo del vector uno es: ");
		for (int i = 0; i < vectorUno.length; i++) {
			System.out.print(vectorUno[i] + " ");
		}
		// muestra el valor de vectorDos
		System.out.println("\n");
		System.out.println("El arreglo del vector dos es: ");
		for (int i = 0; i < vectorDos.length; i++) {
			System.out.print(vectorDos[i] + " ");
		}

		// suma de ambos vectores
		System.out.println("\n");
		System.out.println("La suma de los vectores es: ");
		for (int i = 0; i < suma.length; i++) {
			suma[i] = (vectorUno[i] + vectorDos[i]);
			System.out.print(suma[i] + " ");
		}
		// resta de ambos vectores
		System.out.println("\n");
		System.out.println("La resta de los vectores es: ");
		for (int i = 0; i < resta.length; i++) {
			resta[i] = (vectorUno[i] - vectorDos[i]);
			System.out.print(resta[i] + " ");
		}
		
		//pide un escalar
		numEscalar = Integer.parseInt(JOptionPane.showInputDialog("Dame un escalar: "));
		seleccion = Integer.parseInt(JOptionPane.showInputDialog("Por cual vector deseas multiplicar? (1 o 2): "));
		System.out.println("\n");
		System.out.println("Tu es escalar es: " + numEscalar);
		System.out.println("El vector que selecciono es el #" + seleccion);
		
		//multiplicacion de escalar por un vector seleccionado
		System.out.println("\nLa multiplicacion del escalar por el vector #" + seleccion + " es:");
		for(int i = 0; i < escalar.length; i++) {
			if(seleccion == 1) {
				escalar[i]  = (numEscalar * vectorUno[i]);
				System.out.print(escalar[i] + " ");
			}else if(seleccion == 2) {
				escalar[i]  = (numEscalar * vectorDos[i]);
				System.out.print(escalar[i] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Fin del algoritmo.");
	}

}
