package com.islasfilipinas.filosofos_2;

public class Palillo {
	private int id_palillo;
	private boolean libre; //estado true libre y false ocupado
	Palillo (int id) {
		id_palillo=id;
	}
	synchronized public void coger (int quien)  throws InterruptedException{
		while (!libre){
			 try {
   	          wait();
   	    } catch (InterruptedException e) { }
   	  }
		libre=false;
		System.out.println ("El filosofo "+ quien + " coge Palillo:"+ id_palillo);
		notifyAll();
	}
	synchronized public void soltar(){
		   	libre=true;
			System.out.println ("Se suelta Palillo:"+ id_palillo);
			notifyAll();
	}
	synchronized public boolean eslibre() {
		return libre;
		
	}
	synchronized public void cambiaestado(boolean newestado) {
		libre=newestado;
	}
	public int getPalillo() {
		return id_palillo;
		
	}
}
