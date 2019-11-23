/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   HiloJoin.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/19 15:26:18 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/19 15:26:22 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

class HiloJoin extends Thread {
	  private int n;
	  public HiloJoin(String nom, int n) {
	    super(nom);  
	    this.n=n;	
	  }
	  public void run() {
	    for(int i=1; i<= n; i++)  {
	       System.out.println(getName() + ": " + i);
	       try {
	           sleep(1000); 
	       } catch (InterruptedException ignore) {}    	   
	    }
		System.out.println("Fin Bucle "+getName());
	  }
	 }//
