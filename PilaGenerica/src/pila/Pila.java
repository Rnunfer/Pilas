package pila;

import java.util.*;

public class Pila<T> {

	private LinkedList<T> lista;

	public Pila() {
		this.lista = new LinkedList<T>();
	}
	
	public Pila(LinkedList<T> lista) {
		this.lista = lista;
	}

	public boolean estaVacia() {
		return this.lista.size() == 0;
	}
	
	public T extraer() {
		return lista.remove(lista.size()-1);
	}
	
	public T primero() {
		return lista.remove(0);
	}
	
	public void aniadir(T t) {
		lista.add(t);
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}
}
