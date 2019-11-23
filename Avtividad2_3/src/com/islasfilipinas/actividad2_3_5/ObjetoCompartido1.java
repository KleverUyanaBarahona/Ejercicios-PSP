package com.islasfilipinas.actividad2_3_5;

class ObjetoCompartido1 {	
	public void PintaCadena (String s) {
		System.out.print(s);
	}
  }// ObjetoCompartido1

class HiloCadena1 extends Thread {
	private ObjetoCompartido1 objeto;
    String cad;
	public HiloCadena1 (ObjetoCompartido1 c, String s) {		
		this.objeto = c;
		this.cad=s;
	}
	public void run() {		
			  synchronized (objeto) {
				  for (int j = 0; j < 10; j++)	
				     objeto.PintaCadena(cad);	
		  }//fin bloque synchronized

		  System.out.print("\n"+cad + " finalizado");
		}//run

}//HiloCadena1
