/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Ejercicio_7.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:06:12 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:07:36 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.File;
import java.io.IOException;
 
public class Ejercicio_7 { 
  public static void main(String args[]) throws IOException {
    ProcessBuilder pb = new ProcessBuilder("./" ,"ls");
    //hay que crear el archivo salida txt y error.txt en el mismo dir.
    File fOut = new File("salida.txt");
    File fErr = new File("error.txt");
 
    pb.redirectOutput(fOut);
    pb.redirectError(fErr); 
    pb.start(); 
  }
}// Ejemplo7