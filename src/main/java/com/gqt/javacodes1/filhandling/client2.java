package com.gqt.javacodes1.filhandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket csoc=new Socket("localhost",4000);//192.168.110.39--convert to localhost if you are working at same pc
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		
		InputStream is=csoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
		System.out.println("Enter the message from Client: ");
		String message=sc.nextLine();
		dos.writeUTF(message);
		System.out.println("---------------");
		String res_message=dis.readUTF();
		System.out.println(res_message);
		}
		
		
	}

}