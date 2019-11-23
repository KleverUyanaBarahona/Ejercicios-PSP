package com.islasfilipinas.filosofos_1;

class MesaCircular
{
	private Palillo palillos[];
	private int filosofos;
	
	public MesaCircular (int personas)
	{
		this.filosofos= personas;
		palillos= new Palillo[personas];
		for (int i= 0; i < personas; i++)
		palillos[i]= new Palillo(i);
	}
	
	public Palillo palillo_derecho(int i)
	{
		return palillos[(i+1)%filosofos];
	}
	
	public Palillo palillo_izquierdo(int i)
	{
		return palillos[i];
	}
}

public class CenaFilosofos {
	
	public static MesaCircular mesa;
	
	public static void main(String[] args) throws InterruptedException {
		
		int filosofos = Integer.parseInt (args[0]);
		mesa = new MesaCircular(filosofos);
		System.out.println ("Sentados " + filosofos + " filosofos");
		for (int i= 0; i < filosofos; i++)
		{
			Filosofo f = new Filosofo(i);
			f.start();
		}
	}
}
