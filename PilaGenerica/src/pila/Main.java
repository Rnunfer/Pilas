package pila;

public class Main {

	public static void main(String[] args) {
		
		Pila2 pila2 = new Pila2();
		
		System.out.println(pila2.primero());
		System.out.println(pila2.toString());
		pila2.aniadir(1);
		pila2.aniadir(2);
		pila2.aniadir(3);
		System.out.println(pila2.primero());
		System.out.println(pila2.toString());

	}

}
