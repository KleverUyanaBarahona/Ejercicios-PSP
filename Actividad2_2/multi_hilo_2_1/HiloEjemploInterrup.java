/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   HiloEjemploInterrup.java                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/19 15:25:47 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/19 15:25:52 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class HiloEjemploInterrup extends Thread {
	  public void run() {
	    try {
	      while (!isInterrupted()) {
	        System.out.println("En el Hilo");
		    Thread.sleep(10);
	      }
	      } catch (InterruptedException e) {
		     System.out.println("HA OCURRIDO UNA EXCEPCIÓN");
		  }
	      
	      System.out.println("FIN HILO");
	   }//run
	  
	  
	   public void interrumpir() {
	       interrupt();
	   }//interrumpir
	   
	   public static void main(String[] args) {
		HiloEjemploInterrup h = new HiloEjemploInterrup();
	    h.start();
		for(int i=0; i<1000000000; i++) ;//no hago nada
		h.interrumpir();
	  }//     
	}//
