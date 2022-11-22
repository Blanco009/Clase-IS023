import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Microtrabajo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Agencia de autos que distribuye diferentes marcas.
		int fila, colum, suma, x, seleccion, masVendido, continuar;
		seleccion = 0;
		continuar = 1;
		suma = 0;
		masVendido = 0;
		// se crean los vectores y matrices
		String marcas[] = new String[5];
		String vendedores[] = new String[5];
		int ventas[][] = new int[5][5];
		// ciclo for para solicitar info de las marcas y asignarlo a cada posicion
		System.out.println("La marca de los vehiculos son: ");
		for (int i = 0; i < marcas.length; i++) {
			marcas[i] = JOptionPane.showInputDialog("Dame la marca del vehiculo # " + (i + 1) + ": ");
			System.out.print(marcas[i] + " ");
		}
		System.out.println("\n");
		// ciclo for para solicitar los nombres de los vendedores y asignarlo a cada
		// posicion
		System.out.println("Los vendedores son: ");
		for (int i = 0; i < vendedores.length; i++) {
			vendedores[i] = JOptionPane.showInputDialog("El vendedor # " + (i + 1) + " es: ");
			System.out.println(vendedores[i]);
		}
		// se crea la matriz para guardar las ventas
		System.out.println("\n");
		System.out.println("La matriz de las ventas es: ");
		for (fila = 0; fila < ventas.length; fila++) {
			for (colum = 0; colum < ventas.length; colum++) {

				ventas[fila][colum] = Integer.parseInt(JOptionPane.showInputDialog(
						"Numero de ventas de " + vendedores[fila] + " de la marca " + marcas[colum] + "?"));
				System.out.print(ventas[fila][colum] + " ");
			}
			System.out.println(" ");

		}
		System.out.println("\n");
		JFrame menu = new JFrame();
		while (continuar == 1) {
			seleccion = Integer.parseInt(JOptionPane.showInputDialog(
					"*****************************************************************************\n"
							+ "Menu: �Que deseas hacer? \n"
							+ "1. Informe de ventas por vendedor y por marca.\n"
							+ "2. Informe de cantidad total de carros vendidos por cada vendedor.\n"
							+ "3. Numero total de cada marca vendida. \n" + "4. Numero de carros vendidos en general.\n"
							+ "5. La marca mas vendida.\n" + "6. El vendedor del mes (el que vende mas carros).\n"
							+ "7. Salir del Menu de Opciones. \n"
							+ "*****************************************************************************\n"
							+ "�Cual opcion deseas ver?: "));

			if (seleccion == 1) {// informe de ventas por vendedor y marcas
				System.out.println("\nInforme de ventas. \n");
				for (int i = 0; i < vendedores.length; i++) {
					 System.out.println("El vendedor " + vendedores[i] + " vendio:");
					 for (int j = 0; j < marcas.length; j++) {
					 System.out.println(ventas[i][j] + " autos de la marca " + marcas[j]);
					 }
					 System.out.println(" ");
					JOptionPane.showMessageDialog(menu, "INFORME DE VENTAS. \n"
							+ "El vendedor " + vendedores[i] + " vendió: \n"
							+ ventas[i][0] + " autos de la marca " + marcas[0] + " \n"
							+ ventas[i][1] + " autos de la marca " + marcas[1] + " \n"
							+ ventas[i][2] + " autos de la marca " + marcas[2] + " \n"
							+ ventas[i][3] + " autos de la marca " + marcas[3] + " \n"
							+ ventas[i][4] + " autos de la marca " + marcas[4] + " \n");
				}

			} else if (seleccion == 2) {// informe de cantidad total de carros vendidos por cada vendedor
				int sumaTotal[] = new int[5];

				System.out.println("\nInforme de cantidad total de carros vendidos por cada vendedor. \n");
				for (int i = 0; i < vendedores.length; i++) {
					System.out.println("El vendedor " + vendedores[i] + " vendio un total de: :");
					for (int j = 0; j < ventas.length; j++) {
						sumaTotal[i] += ventas[i][j];
					}
					System.out.println(suma + " autos.");
					System.out.println(" ");
				}
				JOptionPane.showMessageDialog(menu,
						"Informe de cantidad TOTAL de CARROS VENDIDOS por cada VENDEDOR. \n" + "\n"+
								"El vendedor " + vendedores[0] + " vendio un total de: " + sumaTotal[0] + " autos.\n" +
								"El vendedor " + vendedores[1] + " vendio un total de: " + sumaTotal[1] + " autos.\n" +
								"El vendedor " + vendedores[2] + " vendio un total de: " + sumaTotal[2] + " autos.\n" +
								"El vendedor " + vendedores[3] + " vendio un total de: " + sumaTotal[3] + " autos.\n" +
								"El vendedor " + vendedores[4] + " vendio un total de: " + sumaTotal[4] + " autos.\n");

			} else if (seleccion == 3) {
				int sumaTotalMarca[] = new int[5];
				System.out.println("\nNumero total de cada marca vendida.\n");
				for (int j = 0; j < marcas.length; j++) {
					System.out.println("La marca " + marcas[j] + " tiene un total de: ");
					for (int i = 0; i < ventas.length; i++) {
						sumaTotalMarca[j] += ventas[i][j];
					}
					System.out.println(sumaTotalMarca[j] + " ventas.");
					System.out.println(" ");
				}
				JOptionPane.showMessageDialog(menu,
						"NUMERO TOTAL DE CADA MARCA VENDIDA. \n" + "\n"+
								"La marca  " + marcas[0] + " tiene un total de: " + sumaTotalMarca[0] + " ventas.\n" +
								"La marca  " + marcas[1] + " tiene un total de: " + sumaTotalMarca[1] + " ventas.\n" +
								"La marca  " + marcas[2] + " tiene un total de: " + sumaTotalMarca[2] + " ventas.\n" +
								"La marca  " + marcas[3] + " tiene un total de: " + sumaTotalMarca[3] + " ventas.\n" +
								"La marca  " + marcas[4] + " tiene un total de: " + sumaTotalMarca[4] + " ventas.\n");

			} else if (seleccion == 4) {
				suma = 0;
				System.out.println("\nNumero de carros vendidos en general. \n");
				for (int i = 0; i < ventas.length; i++) {
					for (int j = 0; j < ventas.length; j++) {
						suma += ventas[i][j];
					}
				}
				System.out.println(suma + " ventas. \n");
				JOptionPane.showMessageDialog(menu,
						"NÚMERO DE CARROS VENDIDOS EN GENERAL \n" +"\n"+
								suma + " ventas.");

			} else if (seleccion == 5) {
				String modelo;
				modelo = "";
				System.out.println("\nEl modelo mas vendido es el: \n");
				for (int j = 0; j < marcas.length; j++) {
					suma = 0;
					for (int i = 0; i < ventas.length; i++) {
						suma += ventas[i][j];
					}
					if (suma > masVendido) {
						masVendido = suma;
						modelo = marcas[j];
					}
				}
				System.out.println(modelo);
				JOptionPane.showMessageDialog(menu,
						"El MODELO MÁS VENDIDO ES:  \n" +
								"\n" + modelo);

			} else if (seleccion == 6) {

				System.out.println("\nEl vendedor del mes es:");
				String vendedorMes = "";
				masVendido = 0;
				for (int i = 0; i < vendedores.length; i++) {
					suma = 0;
					for (int j = 0; j < ventas.length; j++) {
						suma += ventas[i][j];

					}
					if (suma > masVendido) {
						masVendido = suma;
						vendedorMes = vendedores[i];
					}
				}
				System.out.println(vendedorMes);
				JOptionPane.showMessageDialog(menu,
						"El VENDEDOR DEL MES ES: \n" +
								"\n" + vendedorMes);
			} else if (seleccion == 7) {
				break;

			} else {
				JOptionPane.showMessageDialog(menu, "OPCIÓN NO VALIDA.");
			}
		}
		continuar = Integer.parseInt(JOptionPane.showInputDialog(" Esta seguro(a) que desea Salir? [Si: 0] [No: 1]"));

		JOptionPane.showMessageDialog(menu,
						"**********************************\n" +
						"* Fin del algoritmo, Gracias :D! *\n" +
						"**********************************");
		System.out.println("\n");
		System.out.println("**********************");
		System.out.println("* Fin del algoritmo  *");
		System.out.println("**********************");
		System.exit(0);
	}
}
