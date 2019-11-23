/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_4.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:05:51 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:34 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
//Supongamos que tenemos el siguiente programa Java “EjemploLectura” que lee una cadena desde la entrada estándar y la visualiza:
public class Ejercicio_4{
	 public static void main (String [] args)
	 {
	   InputStreamReader in = new InputStreamReader(System.in);
	   BufferedReader br = new BufferedReader (in);
	   String texto;
	   try {
	    System.out.println("Introduce una cadena....");
	    texto= br.readLine();
	    System.out.println("Cadena escrita: "+texto); 
	    in.close();	 
	   }catch (Exception e) { e.printStackTrace();}	
	 }
	}//EjemploLectura
