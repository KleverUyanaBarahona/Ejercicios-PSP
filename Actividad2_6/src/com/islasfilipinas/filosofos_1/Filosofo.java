package com.islasfilipinas.filosofos_1;

public class Filosofo extends Thread
{
	protected Palillo ind_izq, ind_der;
	protected int identidad;
	static final protected int MAX_DELAY=1000;
	
	public Filosofo (int id)
	{
		this.identidad= id;
		ind_izq= CenaFilosofos.mesa.palillo_izquierdo(id);
		ind_der= CenaFilosofos.mesa.palillo_derecho(id);
	}
	
	protected void pensar()
	{
		try
		{
			System.out.println ("Filosofo " + identidad + " est· pensando");
			Thread.sleep((int) Math.random()*MAX_DELAY);
		} catch (InterruptedException e) {
			System.out.println ("Filosofo " + identidad + " interrumpido");
			System.exit(1);
		}
	}
	
	protected void comer()
	{
		try
		{
			System.out.println ("Filosofo " + identidad + " esta comiendo");
			Thread.sleep((int) Math.random()*MAX_DELAY);
		} catch (InterruptedException e) {
			System.out.println ("Filosofo " + identidad + " interrumpido");
			System.exit(1);
		}
	}
		
	protected void queriendo_comer()
		{
		System.out.println ("Filosofo " + identidad + " quiere comer");
		ind_izq.coger();
		ind_der.coger();
		}
	
	protected void dejando_de_comer()
	{
		ind_izq.soltar();
		ind_der.soltar();
	}
	
	public void run()
	{
		while (true)
		{
			pensar();
			queriendo_comer();
			comer();
			dejando_de_comer();
		}
		}
}