package ClasesyObjetos;

public class Lampara {
	
	//atributos
	boolean estado;
	//metodo
	
	public void encender() {
		estado = true;
		System.out.println("Luces encendidas.");
	}
	public void apagar() {
		estado = false;
		System.out.println("Luces apagadas.");
	}

}
