/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   mayusculas.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kleveruyana <kleveruyana@student.42.fr>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/10/16 13:13:49 by kleveruyana       #+#    #+#             */
/*   Updated: 2019/10/16 13:13:52 by kleveruyana      ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main(int argc ,char **argv)
{
char buf[1024];
int longitud;
int i;
while (fgets(buf,1024,stdin)!=NULL){
longitud =strlen(buf);
for(i =0;i<longitud ;i++){
buf[i]=toupper(buf[i]);
}
fputs(buf,stdout);
fflush(stdout);
}
return 0;
}
