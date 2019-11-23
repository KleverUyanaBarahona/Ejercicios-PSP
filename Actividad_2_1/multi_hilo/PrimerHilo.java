/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   PrimerHilo.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: vmpsp <vmpsp@student.42.fr>                +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/18 20:45:38 by vmpsp             #+#    #+#             */
/*   Updated: 2019/10/18 20:45:42 by vmpsp            ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class PrimerHilo extends Thread {
	private int x;

	PrimerHilo(int x) {
		this.x = x;
	}

	public void run() {
		for (int i = 0; i < x; i++)
			System.out.println("En el Hilo... " + i);
	}

}//PrimerHilo
