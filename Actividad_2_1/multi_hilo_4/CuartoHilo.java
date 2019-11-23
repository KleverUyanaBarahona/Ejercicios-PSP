/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   CuartoHilo.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: vmpsp <vmpsp@student.42.fr>                +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/18 20:46:15 by vmpsp             #+#    #+#             */
/*   Updated: 2019/10/18 20:46:20 by vmpsp            ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class CuartoHilo extends Thread {
	
	  public void run() {
	     System.out.println(
	  	   "Dentro del Hilo  : " + Thread.currentThread().getName() + 
	 	   "\n\tPrioridad    : " + Thread.currentThread().getPriority() + 
	       "\n\tID           : " + Thread.currentThread().getId() +	  	  
	       "\n\tHilos activos: " + Thread.currentThread().activeCount());
	  }
	  //
	  public static void main(String[] args) {
		 
		Thread.currentThread().setName("Principal");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().toString());

		CuartoHilo h = null;	
		
		for (int i = 0; i < 3; i++) {
		  h = new CuartoHilo(); //crear hilo
		  h.setName("HILO"+i);    //damos nombre al hilo
		  h.setPriority(i+1);     //damos prioridad
		  h.start();              //iniciar hilo	  
		  
		  System.out.println(
			"Informacion del " + h.getName() + ": "+ h.toString());	  
	      }
		System.out.println("3 HILOS CREADOS...");	
		System.out.println("Hilos activos: " +Thread.activeCount());	
	  }//
	  
	}// HiloEjemplo2
