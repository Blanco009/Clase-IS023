import java.util.Scanner;

import javax.swing.JOptionPane;

public class Brayan_Araya_ExamenFianalE2 {
    public static void main(String[] args) {
        // Ejercicio 2
        String frase_1 = "", frase_2 = "", palabra;
        int mayuscula, minuscula, opcion, buscapalabra, menu, salir = 1;
        Scanner entrada = new Scanner(System.in);
        String a = "";
        String b = "";
        do {
            System.out.print("\n1. Leer la frase uno \n"
                    + "2. Leer la frase dos \n"
                    + "3. Imprimir ambas frases \n"
                    + "4. Convertir a mayuscula \n"
                    + "5. Convertir a minuscula \n"
                    + "6. Comparar si ambas frases son  iguales \n"
                    + "7. Buscar una palabra en la frase \n"
                    + "8. Salir \n"
                    + "Cuál opcion deseas?: ");
            menu = entrada.nextInt();
            System.out.println("");

            if (menu == 1) {
                frase_1 = JOptionPane.showInputDialog("Dame la primera frase: ");
            } else if (menu == 2) {
                
                frase_2 = JOptionPane.showInputDialog("Dame la segunda frase: ");
            } else if (menu == 3) {
                System.out.println("\nLa primera frase es: " + "'" + frase_1 + "'.");
                System.out.println(" ");
                System.out.println("La segunda frase es: " + "'" + frase_2 + "'.");
            } else if (menu == 4) {
                mayuscula = Integer.parseInt(JOptionPane.showInputDialog("Cual frase quieres convertir en mayuscula? [1 - 2]: "));
                if (mayuscula == 1) {
                    a = frase_1.toUpperCase();
                    System.out.println("La frase 1 en mayuscula: " + a);
                } else if (mayuscula == 2) {
                    b = frase_2.toUpperCase();
                    System.out.println("La frase 2 en mayuscula: " + b);
                }

            } else if (menu == 5) {
                minuscula = Integer.parseInt(JOptionPane.showInputDialog("Cual frase quieres convertir en minuscula? [1 - 2]: "));
                if (minuscula == 1) {
                    a = frase_1.toLowerCase();
                    System.out.println("La frase 1 en minuscula: " + a);
                } else if (minuscula == 2) {
                    b = frase_2.toLowerCase();
                    System.out.println("La frase 2 en minuscula: " + b);
                }

            } else if (menu == 6) {
                if (frase_1.equalsIgnoreCase(frase_2)) {
                    System.out.println("\nAmbas frases son iguales.");

                } else
                    System.out.println("\nLas frases no son iguales.");

            } else if (menu == 7) {
                palabra = JOptionPane.showInputDialog("¿Cual palabra deseas buscar en la frase?: ");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("¿En cual frase deseas buscar la palabra " + palabra + "? [1 - 2]:"));
                if (opcion == 1) {
                    buscapalabra = frase_1.indexOf(palabra);
                    if (buscapalabra != -1) {
                        System.out.println("\nLa palabra se encontro.");
                    } else {
                        System.out.println("\nLa palabra NO esta.");
                    }
                } else if (opcion == 2) {
                    buscapalabra = frase_2.indexOf(palabra);
                    if (buscapalabra != -1) {
                        System.out.println("\nLa palabra se encontro.");
                    } else {
                        System.out.println("\nLa palabra NO esta.");
                    }
                }

            } else if (menu == 8) {
                salir = 0;

            } else {
                System.out.println("Opcion NO valida. Las opciones van de  [1 - 8]");
            }
        } while (salir != 0);

        System.out.println("\n*Fin del algoritmo.*");
    }
}
