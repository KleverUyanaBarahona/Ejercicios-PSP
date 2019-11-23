/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   SegundoHilo.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: vmpsp <vmpsp@student.42.fr>                +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/18 20:45:51 by vmpsp             #+#    #+#             */
/*   Updated: 2019/10/18 20:45:56 by vmpsp            ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class SegundoHilo extends Thread {
	// constructor
	public SegundoHilo(String nombre) {
		super(nombre);
		System.out.println("CREANDO HILO:" + getName());
	}

	// metodo run
	public void run() {
		for (int i=0; i<5; i++) 
			System.out.println("Hilo:" + getName() + " C = " + i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegundoHilo h1 = new SegundoHilo("Hilo 1");
		SegundoHilo h2 = new SegundoHilo("Hilo 2");
		SegundoHilo h3 = new SegundoHilo("Hilo 3");
			
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("3 HILOS INICIADOS...");
	}
}// HiloEjemplo1
