import java.util.Scanner;

public class VectorMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
        System.out.println("Indique la longitud del vector: ");
        int vector_length = read.nextInt();
        int array[] = new int [vector_length];

        for (int i = 0; i < array.length; i++){
            System.out.println("Ingrese un numero entero para la posicion "+ i);
            int data = read.nextInt();
            System.out.println("");
            array[i] = data;
        }

        for (int j = 0; j < array.length; j++){
            if (array[j]%2 == 0){
                System.out.println("El numero "+array[j]+" de la posicion "+j+" es multiplo de 2");
            }
            else if (array[j]%3 == 0){
                System.out.println("El numero "+array[j]+" de la posicion "+j+" es multiplo de 3");
            }
            else if (array[j]%5 == 0){
                System.out.println("El numero "+array[j]+" de la posicion "+j+" es multiplo de 5");
            }
            else{
                System.out.println("El numero "+array[j]+" de la posicion "+j+" no es multipo de 2,3 o 5");
            }
        }
    }
}

	


