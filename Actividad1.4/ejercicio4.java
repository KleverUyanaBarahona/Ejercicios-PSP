/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ejercicio4.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:13:29 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:15:31 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejercicio4 {
public static void main (String args[]) {
	String line ;
	try {
		Process hijo = new ProcessBuilder("./mayusculas").start();
		BufferedReader br  = new  BufferedReader(new InputStreamReader(hijo.getInputStream()));
		PrintStream ps = new PrintStream (hijo.getOutputStream());
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		//Control+d
	while ((line =in.readLine())!=null){
		ps.println(line);
		ps.flush();
		if((line=br.readLine())!=null){
			System.out.println(line);
		}
	}
	System.out.println("finalizado");
	
	
}
	catch (Exception ex) {
		System.out.println(ex.getMessage());
	}
}}
