
public class caracteresChartCadenas {

	public static void main(String[] args) {
		String s = "xXccxxhxXXc";

		// Comience desde el principio para averiguar si existe el carácter especificado
		// // Los resultados son los siguientes

		System.out.println(s.indexOf("c")); // 2 es la respuesta

		// Continuar buscando desde la posición del cuarto carácter, incluida la
		// posición actual

		System.out.println(s.indexOf("c", 3)); // 3 es la respuesta
		System.out.println(s.indexOf("h", 6)); // 6 es la respuesta

		// Si no hay tal carácter en la cadena especificada, el sistema devuelve -1

		System.out.println(s.indexOf("y")); // -1 es la respuesta, porque no esta

		System.out.println(s.lastIndexOf("c")); // 10 es la respuesta

	}

}
