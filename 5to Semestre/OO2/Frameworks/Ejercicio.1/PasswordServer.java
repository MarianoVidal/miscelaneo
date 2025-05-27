package oo2.unlp.frameworks.SingleThreadTCPServer;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {	
	final int LONGITUD = 8;
	
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ", 3);
        
        if (args.length < 2)
        	throw new RuntimeException("Se deben pasar tres argumentos");
        
        System.out.println("CONTRASEÑA: " + obtenerContraseña(args));
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
		System.out.println("Mensaje recibido: " + inputLine + " de "
				+ clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
	}

	@Override
	public void showMessageClose(Socket clientSocket, String inputLine) {
		System.out.println("Cerrando conexión");
	}
	
	// Métodos privados
	
	private String obtenerContraseña(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		char caracterEspecial = obtenerCaracterRandom(args[2]);
		sb.append(caracterEspecial);
		
		int num_long = new Random().nextInt(LONGITUD - 2);
		int let_long = LONGITUD - num_long;
		
		insertarCaracteresRandom(args[1], sb, num_long);
		insertarCaracteresRandom(args[0], sb, let_long);
		
		return sb.toString();
	}

	private void insertarCaracteresRandom(String cadena, StringBuilder sb, int longitud) {
		for (int i = 0; i < longitud; i++)
			sb.append(obtenerCaracterRandom(cadena));
	}
	
	public static char obtenerCaracterRandom(String str) {
        Random random = new Random();
        int randomIndex = random.nextInt(str.length());
        return str.charAt(randomIndex);
    }
}
