/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UsarPrimerHiloR.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: vmpsp <vmpsp@student.42.fr>                +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/18 20:46:52 by vmpsp             #+#    #+#             */
/*   Updated: 2019/10/18 20:46:54 by vmpsp            ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class UsarPrimerHiloR {
	public static void main(String[] args) {
		//Primer hilo
		PrimerHiloR	hilo1 = new PrimerHiloR();
		new Thread(hilo1).start();

		//Segundo hilo
		PrimerHiloR hilo2 = new PrimerHiloR();
		Thread hilo = new Thread(hilo2);
		hilo.start(); 
		
		//Tercer Hilo
		new Thread(new PrimerHiloR()).start();
	}
}//UsaPrimerHiloR
