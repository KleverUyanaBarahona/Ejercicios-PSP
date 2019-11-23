package com.islasfilipinas.carrera_relevos;

public class Relevos {

	public static void main(String[] args) {
		
		Testigo testis = new Testigo();
		
		Corredor [] corredores = new Corredor[4];
		
		System.out.println();
		System.out.println("|*************************************|");
		System.out.println("|**********Preparados, listos*********|");
		System.out.println("|*************************************|");
		System.out.println();
		System.out.println("|********************************************************|");
		System.out.println("|*******YA!!. Que empiece el corredor con dorsal 1*******|");
		System.out.println("|********************************************************|");
		System.out.println();
		
		for(int i=0; i < 4 ; i++){
			
			corredores[i] = new Corredor(testis, i);
			corredores[i].start();
		}


		testis.next_corredor(0);

		try{
			
			for (int i=0; i< 4; i++){
				
			
				corredores [i].join();
				
			}
		
		}catch (InterruptedException ex){
			
			System.out.println("La carrera se ha interrumpido");
			
		}
		

		//System.out.println( "La carrera de relevos ha acabado");
		System.out.println();
		System.out.println("|********************************************************|");
		System.out.println("|********** La carrera de relevos ha acabado ************|");
		System.out.println("|********************************************************|");
		System.out.println();

	}

}
