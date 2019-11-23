package com.islasfilipinas.filosofos_2;

import java.util.Random;

public class Filosofo extends Thread {
	private Random random;
	private int tiempoComiendo, tiempoPensando,id;
	private Palillo palillo1, palillo2;
	
	public Filosofo(int i, Palillo p1, Palillo p2,Random r, int tc, int tp) {
		id = i;
		palillo1 = p1;
		palillo2= p2;
		random = r;
		tiempoPensando = tp;
		tiempoComiendo = tc;
						
	}

	public void run() {
		boolean para = false;
		try {
			while (!para) {
				piensa(id, tiempoPensando);
				palillo1.coger(id);
				palillo2.coger(id);
				come(id, tiempoComiendo);
				palillo2.soltar();
				palillo1.soltar();
				}
										    	
			} catch (InterruptedException e) {
				para = true;
			}
		
	}
	

	private void espera(int tiempo) throws InterruptedException {
		int t = random.nextInt(tiempo);
		sleep(t);
	}

	private void piensa(int id, int tiempo) throws InterruptedException {
		System.out.println("El filosofo " + id + " empieza a pensar ");
		espera(tiempo);
		System.out.println("El filosofo " + id + " acaba de pensar ");
	}

	private void come(int id, int tiempo) throws InterruptedException {
		System.out.println("El filosofo " + id + " empieza a comer ");
		espera(tiempo);
		System.out.println("El filosofo " + id + " acaba de comer ");
		}
}