/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_12.java                                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:07:10 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:42 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.lang.Thread;
public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloSimple2 hs = new HiloSimple2 ();
		Thread t = new Thread (hs);
		t.start();
		for (int i=0; i < 5; i++)
			System.out.println ("Fuera del hilo…");
	}

}
