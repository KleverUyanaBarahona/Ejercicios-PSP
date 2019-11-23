package com.islasfilipinas.ping_pong;

public class Cola {
    private int numero;
    private boolean disponible = false;//inicialmente cola vacia

    public synchronized int get() {
    	  while (!disponible) {
    	    try {
    	          wait();
    	    } catch (InterruptedException e) { }
    	  }
    	  System.out.print("PING " );    	  
    	  disponible = false;
    	  notify();
    	  return numero;
    	}

    public synchronized void put(int valor) {
  	  while (disponible){
  	    try {
  	          wait();
  	    } catch (InterruptedException e) { }
  	  }
  	  numero = valor;
  	  disponible = true;
  	  System.out.print("PONG ");   
  	  notify();
  	}

   
   
}