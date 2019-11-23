/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_8_2.java                                 :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:06:20 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:37 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

	import java.io.File;
	import java.io.IOException;

	public class Ejercicio_8_2 {
		public static void main(String args[]) throws IOException {
			ProcessBuilder pb = new ProcessBuilder(".");	
				
			File fBat = new File("fichero.bat");
		    File fOut = new File("salida.txt");
		    File fErr = new File("error.txt");
		    
			pb.redirectInput(ProcessBuilder.Redirect.from(fBat));
			pb.redirectOutput(ProcessBuilder.Redirect.to(fOut));
			pb.redirectError(ProcessBuilder.Redirect.to(fErr)); 
			    
			Process p = pb.start();
		}
	}// EjemploPB2