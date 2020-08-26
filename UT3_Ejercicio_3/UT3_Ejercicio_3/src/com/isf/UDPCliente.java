package com.isf;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPCliente {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//instancio un DatagramSocket();
		DatagramSocket socket = new DatagramSocket();
		
		// buffer con info a enviar
		byte[] bEnviar = "hola".getBytes();
		
		// ip del server
		byte[] ip = {(byte) 192,(byte) 168,56,1};
		InetAddress address = InetAddress.getByAddress(ip);
		
		//paquete de informacion a enviar, ip + port (5432)
		DatagramPacket packet = new DatagramPacket(bEnviar, bEnviar.length,address,5432);
		
		//envio el paquete
		socket.send(packet);
		
		// buffer para recibir la respuesta
		byte[] bRecibe = new byte[256];
		packet = new DatagramPacket(bRecibe, bRecibe.length,address,5432);
		
		// recibo el saludo
		socket.receive(packet);
		
		// muestro el resultado
		String saludo = new String(packet.getData(),0,packet.getLength());
		
		System.out.println(saludo);
		socket.close();
	}

}
