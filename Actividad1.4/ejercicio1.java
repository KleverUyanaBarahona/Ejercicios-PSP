/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ejercicio1.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:12:51 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:12:55 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejercicio1  {
	
	public static void main(String args []) {
		String linea;
		try {
			Process proceso1 = new ProcessBuilder ("ls","-la").start();
			Process proceso2 = new ProcessBuilder ("tr","d","D").start();
			PrintStream pos = new PrintStream(proceso2.getOutputStream());
			BufferedReader br1 = new BufferedReader (new InputStreamReader(proceso1.getInputStream()));
			BufferedReader br2 = new BufferedReader (new InputStreamReader(proceso2.getInputStream()));
			
			while ((linea=br1.readLine())!=null) {
				pos.println(linea);
			}
			pos.close();
			System.out.println("Finalizacion de ejecucion");
			while((linea=br2.readLine())!=null){
				System.out.println(linea);
			}
			
			}
		catch(IOException e) {
			System.out.println("hshdhdshds ");
		}
		
		
		
	}
}

