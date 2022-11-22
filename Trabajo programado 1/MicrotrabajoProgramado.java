import java.util.Scanner; //se importa el scanner para input de datos

public class MicrotrabajoProgramado {

	public static void main(String[] args) {
		// Micro trabajo programado de Brayan Araya Rojas
		Scanner scanner = new Scanner(System.in);
		System.out.println("Este algortimo calcula el salario de N cantidad de empleados. \n");
		System.out.println("A cuantos empleados deseas calcular el salario?: "); //Se solicita la cantidad de ciclos ha realizar
		int n = scanner.nextInt();// se lee n
		for (int i = 1; i <= n; i++) { // ciclo for para hacerlo n veces
			System.out.println("Trabajador número: " + i);
			System.out.println("Cual es el nombre del empleado?: ");
			String nombre = scanner.next();
			System.out.println("Horas trabajadas?: ");
			double horas_trabajadas = scanner.nextDouble();
			System.out.println("Numero de ausencias?: ");
			int ausencias = scanner.nextInt();
			// salario base siempre es un maximo de 40 horas, despues de ahi son extras
			int salario_base = 5000;
			int salario_extras = 5500;
			int horas_normales = 40; //las 40 horas establecidas por contrato
			double salario, horas_extras, salario_horas_extras = 0; // Se inicializan las variables
			double impuesto_social, impuesto_renta, total_deducciones, salario_neto,salario_bruto, gratificacion  = 0;// Se inicializan las variables
			if (horas_trabajadas <= 40) { //se inicializa la condicional 
				salario = horas_trabajadas * salario_base;
			} else if (horas_trabajadas >= 41 && horas_trabajadas <= 50) {// si las horas trabajadas estan dentro 41 y 50 
				salario = horas_normales * salario_base;
				horas_extras = horas_trabajadas - horas_normales;//se saca la diferencia entre las horas trabajas y las horas normal, el resultado son las horas extras
				salario_horas_extras = horas_extras * salario_extras;
			} else {
				salario = horas_normales * salario_base;
				horas_extras = 10;// se permiten un maximo de 10 horas trabajadas
				salario_horas_extras = horas_extras * salario_extras;
				System.out.println("Tiene horas extras que superan el maximo de 10 horas trabajadas, estas NO se pagan. \n");// despues de 10 horas trabajadas no se pagan
			}
			if (ausencias == 0) { // condicional de ausencias
				gratificacion =  (salario * 0.03);
			} else if (ausencias >= 1 && ausencias <= 9) {
				gratificacion =  (salario * 0.02);
			} else if (ausencias >= 10 && ausencias <= 15) {
				gratificacion =  (salario * 0.01);
			} else {
				gratificacion = 0;// si se superan las 15 ausencias no hay bonus.
			}
			salario_bruto = salario + salario_horas_extras + gratificacion;
			impuesto_renta = (salario_bruto * 0.15); // 15%
			impuesto_social =  (salario_bruto * 0.09); // 9%
			total_deducciones = impuesto_renta + impuesto_social;
			salario_neto = salario_bruto - total_deducciones;
			System.out.println("El empleado " + nombre + " tiene un salario base de " + salario
					+ " colones, ademas tiene un salario por horas extras de " + salario_horas_extras + " colones"
					+ " y tiene una gratificacion de " + gratificacion + " colones, el salario bruto es de "
					+ salario_bruto + " colones, un total de deducciones de " + total_deducciones
					+ " colones y el salario neto es de " + salario_neto + " colones. \n");
		}
		System.out.println("Fin del algoritmo.");
	}

}
