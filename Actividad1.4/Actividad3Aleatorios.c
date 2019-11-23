/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Actividad3Aleatorios.c                             :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:12:11 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:12:34 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
#include <unistd.h>
//numeros aleatorios
int main(int argc, char **argv)
{
char buf[1024];
int num;
while(fgets(buf, 1024, stdin) != NULL){
num = 1+(int) (10.0*rand()/(RAND_MAX+1.0));
fprintf(stdout, "%d\n", num);
fflush(stdout);
}
exit(0);
}
