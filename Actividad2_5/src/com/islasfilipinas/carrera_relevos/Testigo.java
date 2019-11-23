package com.islasfilipinas.carrera_relevos;

public class Testigo {
	
	private int siguiente_corredor;
	
	Testigo(){
		
		this.siguiente_corredor = 0;
		
	}
	
    public synchronized void next_corredor(int id){
    	
    	this.siguiente_corredor = id;
    	

    	notifyAll();
  	  
  	}
    
    public synchronized void comprueba_id(int id) throws InterruptedException {
    	
    	while(siguiente_corredor != id){
    		
				wait(); 
				
				
				System.out.println("\n|#### El corredor " + (id+1) + " esta en espera ####|\n");
    	}
    	
  	}

	

}
