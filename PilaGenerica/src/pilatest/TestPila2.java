package pilatest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pila.Pila2;

class TestPila2 {

	private Pila2 pila = new Pila2();
	
	@Test
	void testPila2() {
		assertEquals(true, pila instanceof Pila2);
	}
	
	@Test
	void testestaVacia() {
		assertEquals(true, pila.estaVacia());
	}
	
	@Test
	void testAniadir() {
		Pila2<Integer> pilaInt = new Pila2();
		pilaInt.aniadir(1);
		assertEquals(false, pilaInt.estaVacia());
		Integer i = pilaInt.primero();
		assertEquals(1, i);
		pilaInt.aniadir(2);
		System.out.println(pilaInt.toString());
		//assertThat(pilaInt.toString(), containsString("2/n1"));
	}

}
