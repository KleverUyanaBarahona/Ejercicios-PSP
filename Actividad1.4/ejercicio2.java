/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ejercicio2.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:13:13 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:13:16 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ejercicio2 {
public static void main (String args [])throws IOException {
	if(args.length<=0) {
		System.err.println("Needcommando run");
		System.exit(-1);
	}
	Runtime runtime =Runtime.getRuntime();
	Process proceso = runtime.exec(args);
	BufferedReader br = new BufferedReader (new InputStreamReader(proceso.getErrorStream()));
	String linea;
	System.out.println("Error of running %s es "+ Arrays.toString(args));
	while((linea=br.readLine())!=null) {
		System.out.println(linea);
	}
}
}

