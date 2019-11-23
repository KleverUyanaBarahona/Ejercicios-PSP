package com.islasfilipinas.producto_consumidor_1;

public class Cola {
    private int numero;
    private boolean disponible = false;//inicialmente cola vacia

    public int get() {
	    if(disponible) {      //hay número en la cola
		disponible = false; //se pone cola vacía
            return numero;      //se devuelve
	    }
          return -1;	//no hay número disponible, cola vacía	
    }

 

	public void put(int valor) {
		// TODO Auto-generated method stub
		numero = valor;    //coloca valor en la cola 
        disponible = true; //disponible para consumir, cola llena
	}
}
