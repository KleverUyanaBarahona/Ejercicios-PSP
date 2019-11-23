/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   HiloPrioridad1.java                                :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/19 15:26:29 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/19 15:26:31 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

class HiloPrioridad1 extends Thread {
	  private int c = 0;
	  private boolean stopHilo= false; 
	  
	  public HiloPrioridad1(String nombre) {
			super(nombre);		
	  }
	  public int getContador()  {
	         return c;
	  }  
	  public void pararHilo()  {
	          stopHilo = true;         
	  }  
	  public void run() {
	    while (!stopHilo) {
	    	try {
	    	      Thread.sleep(2);
	    	    } catch (Exception e) { }
	    	c++;      	
	    } 
	    System.out.println("Fin hilo  "+this.getName());
		
	  }//
	} 
