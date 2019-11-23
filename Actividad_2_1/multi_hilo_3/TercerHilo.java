/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   TercerHilo.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: vmpsp <vmpsp@student.42.fr>                +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/18 20:46:05 by vmpsp             #+#    #+#             */
/*   Updated: 2019/10/18 20:46:09 by vmpsp            ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class TercerHilo  extends Thread{
	// constructor
	public  TercerHilo(String nombre) {
		super(nombre);
		System.out.println("CREANDO HILO:" + getName());
	}

	// metodo run
	public void run() {
		for (int i=0; i<5; i++) 
			System.out.println("Hilo:" + getName() + " C = " + i);
	}
// HiloEjemplo1_V2


	public static void main(String[] args) {
		TercerHilo h1 = new TercerHilo("Hilo 1");
		TercerHilo h2 = new TercerHilo("Hilo 2");
		TercerHilo h3 = new TercerHilo("Hilo 3");
			
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("3 HILOS INICIADOS...");
	}
}//UsaHiloEjemplo1_V2
