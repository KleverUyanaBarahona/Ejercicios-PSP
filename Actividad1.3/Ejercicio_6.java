/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_6.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:06:06 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:35 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Ejercicio_6 {
	public static void main(String args[]) {
		
		//File directorio = new File(".\\bin");
		
		ProcessBuilder test = new ProcessBuilder();
		Map entorno = test.environment();
		System.out.println("Variables de entorno:");
		System.out.println(entorno);
//comando para ejecucion pasando un angumento tiene que estar en el mismo dir.
		test = new ProcessBuilder("java", "LeerNombre", "Maria Jesús");		
		
		// devuelve el nombre del proceso y sus argumentos
		List l = test.command();
		Iterator iter = l.iterator();
		System.out.println("\nArgumentos del comando:");
		while (iter.hasNext())
			System.out.println(iter.next());

		// ejecutamos el comando DIR
		test = test.command("/", "ls");
		try {
			Process p = test.start();
			InputStream is = p.getInputStream();
		    
			System.out.println();
			// mostramos en pantalla caracter a caracter
			 int c;
			 while ((c = is.read()) != -1)
				System.out.print((char) c);
			 is.close();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}// Ejemplo6