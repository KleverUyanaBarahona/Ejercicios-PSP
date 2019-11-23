/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   HiloSimple2.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:07:19 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:44 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class HiloSimple2 implements Runnable {
	public void run() {
		for (int i=0; i<5; i++)
			System.out.println ("En el Hilo…");
	}
}
