/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_3.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:05:40 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:33 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Ejercicio_3 {
  public static void main(String[] args) throws IOException {

	//creamos objeto File al directorio donde esta Ejemplo2
	File directorio = new File("/home/vmpsp/eclipse-workspace/ejercicios_3/bin/ejercicios_3");	

	//El proceso a ejecutar es Ejemplo2			
	ProcessBuilder pb = new ProcessBuilder("java","ejercicio_2");

    //se establece el directorio donde se encuentra el ejecutable
    pb.directory(directorio);
        
	System.out.printf("Directorio de trabajo: %s%n",pb.directory());

    //se ejecuta el proceso
	Process p = pb.start();

   //obtener la salida devuelta por el proceso
	try {
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1)
			System.out.print((char) c);
		is.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
		
  }
}// Ejemplo3
