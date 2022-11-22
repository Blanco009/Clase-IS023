import java.util.Scanner;

public class Brayan_Araya_ExamenFianalE1 {
    public static void main(String[] args) {
        // Ejercicio 1, cuantas veces cabe un numero en otro dividiendolo
        // TotalPago es lo que tiene que cancelar el comprador
        // MontoPago es la cantidad que el comprador da para pagar

        // Billetes disponibles = 1000, 2000, 5000, 10000 y 20000
        // Monedas disponibles = 5, 10, 25, 50, 100 y 500
        int Totalpago, MontoPago, vuelto, suma, contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Monto total a pagar?: ");
        Totalpago = entrada.nextInt();
        System.out.println(" ");
        System.out.print("¿Con cuanto cancelas el monto anterior?: ");
        MontoPago = entrada.nextInt();
        vuelto = (MontoPago - Totalpago);
        System.out.println("\nSu vuelto es: " + vuelto + " colones, de la siguiente manera: \n");

        int[] billetes = { 20000, 10000, 5000, 2000, 1000 };
        int[] monedas = { 500, 100, 50, 25, 10, 5};
        do {
            if (billetes[0] <= vuelto) { // billete de 20 mil
                contador = (vuelto / billetes[0]);
                vuelto = (vuelto - billetes[0]*contador);
                System.out.println("Billetes de 20000: " + contador);

            } else if (billetes[1] <= vuelto) {
                contador = (vuelto / billetes[1]);
                vuelto = (vuelto - billetes[1] * contador);
                System.out.println("Billetes de 10000: " + contador);

            } else if (billetes[2] <= vuelto) {
                contador = (vuelto / billetes[2]);
                vuelto = (vuelto - billetes[2] * contador);
                System.out.println("Billetes de 5000: " + contador);

            } else if (billetes[3] <= vuelto) {
                contador = (vuelto / billetes[3]);
                vuelto = (vuelto - billetes[3] * contador);
                System.out.println("Billetes de 2000: " + contador);

            } else if (billetes[4] <= vuelto) {
                contador = (vuelto / billetes[4]);
                vuelto = (vuelto - billetes[4] * contador);
                System.out.println("Billetes de 1000: " + contador);

                // controlador de monedas
            } else if (monedas[0] <= vuelto) {
                contador = (vuelto / monedas[0]);
                vuelto = (vuelto - monedas[0] * contador);
                System.out.println("Monedas de 500: " + contador);

            } else if (monedas[1] <= vuelto) {
                contador = (vuelto / monedas[1]);
                vuelto = (vuelto - monedas[1] * contador);
                System.out.println("Monedas de 100: " + contador);

            } else if (monedas[2] <= vuelto) {
                contador = (vuelto / monedas[2]);
                vuelto = (vuelto - monedas[2] * contador);
                System.out.println("Monedas de 50: " + contador);

            } else if (monedas[3] <= vuelto) {
                contador = (vuelto / monedas[3]);
                vuelto = (vuelto - monedas[3] * contador);
                System.out.println("Monedas de 25: " + contador);

            } else if (monedas[4] <= vuelto) {
                contador = (vuelto / monedas[4]);
                vuelto = (vuelto - monedas[4] * contador);
                System.out.println("Monedas de 10: " + contador);

            } else if (monedas[5] <= vuelto) {
                contador = (vuelto / monedas[5]);
                vuelto = (vuelto - monedas[5] * contador);
                System.out.println("Monedas de 5: " + contador);

            }
        } while (vuelto != 0);
        System.out.println("\n¡GRACIAS POR SU COMPRA!");
    }
}
