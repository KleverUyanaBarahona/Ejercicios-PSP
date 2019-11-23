/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   HiloEjemploDead.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/19 15:25:38 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/19 15:25:42 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class HiloEjemploDead extends Thread {
	  private boolean stopHilo= false; 
	  public void pararHilo()  {
	    stopHilo = true;
	  }  
	  //metodo run
	  public void run() {
		while (!stopHilo) {
		  System.out.println("En el Hilo");
		}
	  }
	  public static void main(String[] args) {
		HiloEjemploDead h = new HiloEjemploDead ();
	    h.start();
		for(int i=0;i<100000; i++) ;//no hago nada	
		
		h.pararHilo();
	  }// main   
	 }//fin clase hilo
