/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   PrimerHiloR.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: vmpsp <vmpsp@student.42.fr>                +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/18 20:46:39 by vmpsp             #+#    #+#             */
/*   Updated: 2019/10/18 20:46:42 by vmpsp            ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class PrimerHiloR implements Runnable {
	public void run() {
		System.out.println("Hola desde el Hilo! " +
	       Thread.currentThread().getId());
	}
}