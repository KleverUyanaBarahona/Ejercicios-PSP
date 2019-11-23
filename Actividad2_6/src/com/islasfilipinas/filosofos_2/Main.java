package com.islasfilipinas.filosofos_2;

import java.util.Random;

public class Main {
	Filosofo f[] = new Filosofo[5];
	Palillo palillos[] = new Palillo[5];
	int numFil = 5;
	int tiempoPensando = 1000;
	int tiempoComiendo = 2000;
	int tiempoParada = 10000;
	Random r = new Random();

	public Main() {
		
		for (int i = 0; i < numFil; i++) {
			palillos[i] = new Palillo(i);
			palillos[i].cambiaestado(true);
		}
		for (int i = 0; i < numFil; i++) {
			f[i] = new Filosofo(i,palillos[i], palillos[(i + 1)%numFil],r, tiempoComiendo, tiempoPensando);
			f[i].start();

		}
		
		try {
			Thread.sleep(tiempoParada);
		} catch (InterruptedException e) {

		}
		
		for (int i = 0; i < numFil; i++) {
				f[i].interrupt();
				System.out.println(" Parando filosofo " + i
						+ " ............................. ");
							
		}
		
	}

	public static void main(String[] args) {
		new Main();
		System.out.println ("Fin");

	}

}