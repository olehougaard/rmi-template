package dk.via.requestreply.client;

import dk.via.requestreply.Message;

import java.io.IOException;
import java.net.Socket;
import java.rmi.RemoteException;

public class CommunicationModule {
	public static final int PORT = 9090;
	
	public static byte[] doOperation(Message msg) {
		try (Socket socket = new Socket("localhost", PORT)) {
			// Send and receive messages here
		} catch (IOException e) {
			// Handle the exception, but how?
		}
		return null; // Erase this when the code is complete.
	}
}
