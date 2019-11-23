/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_5.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:05:58 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:35 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
//Manda datos a la entrada estándar del programa anterior, EjemploLectura.java.
public class Ejercicio_5 {

	public static void main(String[] args) throws IOException {
										
		File directorio = new File("./");//ruta de ejecutable para lectura
		ProcessBuilder pb = new ProcessBuilder("java", "EjemploLectura");

		pb.directory(directorio);

		// se ejecuta el proceso
		Process p = pb.start();

		// escritura -- envia entrada 
		OutputStream os = p.getOutputStream();
		os.write("Hola klever\n".getBytes());
		os.flush(); // vacía el buffer de salida

		// lectura -- obtiene la salida
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1)
			System.out.print((char) c);
		is.close();

		// COMPROBACION DE ERROR - 0 bien - 1 mal
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			String liner = null;
			while ((liner = brer.readLine()) != null)
				System.out.println("ERROR >" + liner);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}// Ejemplo5