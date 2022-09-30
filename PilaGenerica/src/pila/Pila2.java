package pila;

import java.util.Arrays;

public class Pila2<T>{
	
	private T[] lista;
	
	public Pila2() {
		Object[] lista2 = new Object[0];
		lista = (T[])lista2;
	}
	
	public int tamanio() {
		int i = 0;
		try {
			while(true) {
				lista[i] = lista[i];
				i++;
			}
		} catch(Exception ex) {
			
		}
		return i;
	}
	
	public boolean estaVacia() {
		return tamanio() == 0;
	}
	
	public T extraer() {
		T objeto = null;
		if (!estaVacia()) {
			objeto = lista[tamanio()-1];
			lista = Arrays.copyOf(lista, tamanio()-1);
		}
		return objeto;
	}
	
	public T primero() {
		T objeto = null;
		if (!estaVacia()) {
			objeto = lista[0];
			lista = Arrays.copyOf(lista, tamanio()-1);
		}
		return objeto;
	}
	
	
	public void aniadir(T t) {
		lista = Arrays.copyOf(lista, tamanio()+1);
		lista[tamanio()-1] = t;
	}
	@Override
	public String toString() {
		String devolver = "";
		for (T t: lista) {
			devolver += t + " ";
		}
		return devolver;
	}
}
