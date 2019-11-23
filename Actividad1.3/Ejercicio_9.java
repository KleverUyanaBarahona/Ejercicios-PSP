/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_9.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:06:35 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:39 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


import java.io.IOException;

public class Ejercicio_9 {
		public static void main(String args[]) throws IOException {
			ProcessBuilder pb = new ProcessBuilder("ls");

			//la salida a consola
			pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);	    
			Process p = pb.start();		
		
		}
	}// Ejemplo9