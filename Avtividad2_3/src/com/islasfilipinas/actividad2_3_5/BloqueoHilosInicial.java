package com.islasfilipinas.actividad2_3_5;

public class BloqueoHilosInicial {
	public static void main(String[] args) {
		ObjetoCompartido1 com = new ObjetoCompartido1();
		HiloCadena1  a = new HiloCadena1 (com, " A ");
		HiloCadena1  b = new HiloCadena1 (com, " B ");
		a.start();
		b.start();
	}
}//BloqueoHilosInicial
