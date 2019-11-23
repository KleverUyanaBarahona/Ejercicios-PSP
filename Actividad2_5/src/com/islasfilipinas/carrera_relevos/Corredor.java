package com.islasfilipinas.carrera_relevos;

public class Corredor extends Thread{
	
	
	private static final int tiempo_maximo_sleep = 1000;
	private Testigo test;
	private int id;
	
    public Corredor(Testigo t, int id) {
        this.test= t;
        this.id = id;
    }

    public void run() {
    	
    	try{
    		
    		test.comprueba_id(id);
    		System.out.println("|------------------------------------|\n|---El corredor " + (id+1) + " empieza a correr---|\n|------------------------------------| \n");
    		

    		int tiempo =   (int) (Math.random() * tiempo_maximo_sleep);
    		Thread.sleep(tiempo);
    		
    		if (id <= 4 ) {
    			
    			System.out.println();
    			System.out.println("|----------------------------------------------|");
    			System.out.println("|<<<<<<<<<< Corredor " + (id+1) + " termina de correr <<<<<<|");
    			System.out.println("|----------------------------------------------|");

    			
    			int siguiente_corr = id + 1;
    			
    			if (id != 3) {
    			System.out.println("|>>>>>>> Paso el testigo al corredor" + (siguiente_corr+1) + " >>>>>>>>>| \n|----------------------------------------------|" );
    			System.out.println();
    			}
    			else if(id == 3){
        			System.out.println();
        			System.out.println("|**********************************************|");
        			System.out.println("|>>>>>>>>>> Los Corredores Descansan <<<<<<<<<<|");
        			System.out.println("|**********************************************|\n");
    			}

    			test.next_corredor(siguiente_corr);
    			
    		}else{
    			
    			System.out.printf(" Ya han acabado todos los corredores ");
    			
    		}
    		
    		
    	}catch(Exception e){
    		
    		System.out.println("Ya han acabado todos los corredores");
    	}

    }
    
}
