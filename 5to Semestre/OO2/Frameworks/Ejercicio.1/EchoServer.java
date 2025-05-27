package oo2.unlp.frameworks.SingleThreadTCPServer;

import java.io.PrintWriter;
import java.net.Socket;

public class EchoServer extends SingleThreadTCPServer {
   
    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }

    public static void main(String[] args) {
        new PasswordServer().startLoop(args);
    }

	@Override
	public boolean checkTerminationMessage(String input) {
		return (input.equalsIgnoreCase(""));
	}

	@Override
	public void showMessageOpen(Socket clientSocket, String inputLine) {
		System.out.println("Received message: " + inputLine + " from "
				+ clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
	}

	@Override
	public void showMessageClose(Socket clientSocket, String inputLine) {
		// TODO Auto-generated method stub
		
	}
}