/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_8.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:06:28 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:38 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.File;
import java.io.IOException; 

public class Ejercicio_8 { 
  public static void main(String args[]) throws IOException {
    ProcessBuilder pb = new ProcessBuilder("");
    //hay que crear los ficheros para hecer las pruevas.
    File fBat = new File("fichero.bat");
    File fOut = new File("salida.txt");
    File fErr = new File("error.txt");
 
    pb.redirectInput(fBat);
    pb.redirectOutput(fOut);
    pb.redirectError(fErr); 
    pb.start(); 

  }
}// Ejemplo8