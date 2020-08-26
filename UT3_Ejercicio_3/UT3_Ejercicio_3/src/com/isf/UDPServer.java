package com.isf;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	
	public static void main(String[] args) throws Exception{
		
		// creo el socket
		DatagramSocket socket = new DatagramSocket(5432);
		String saludo = null; 
		String nombre = null;
		InetAddress address;
		while(true) {
			
			nombre=null;
			System.out.println("\nEsperando conexion....\n");
			
			
			// buffer para recibir el nombre del cliente
			byte[] bRecibe = new byte[256];
			
			//recibo el nombre del cliente
			DatagramPacket packet = new DatagramPacket(bRecibe, bRecibe.length);
			
			socket.receive(packet);
			
			System.out.println("Conexion Recibida !");
			//------------------

			//------------------
			
			// preparo el saludo a enviar
			nombre = new String (packet.getData(),0,packet.getLength());

			System.out.println(nombre+" = Hola o "+nombre+" = hola" );
			
			if(nombre .equals("hola") || nombre.equals("Hola")) {
				
			saludo = "¿Que tal?";
			System.out.println("He resivido: ["+nombre+"]");
			System.out.println("Voy a enviar: ["+saludo+"]");
			System.out.println("Saludo Enviado !!");
			
			//buffer para enviar saludo
			byte[] bEnviar = saludo.getBytes();
			
			// envio el saludo
			address = packet.getAddress();
			packet = new DatagramPacket(bEnviar, bEnviar.length,address,packet.getPort());
			
			socket.send(packet);
			
			}else {
				System.out.println("no se ha enviado nada");
			}			
					
		}
	}

}
