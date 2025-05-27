package oo2.unlp.frameworks.SingleThreadTCPServer;
 // CORREGIR
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

public class RepeatServer extends SingleThreadTCPServer {	
	//
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ");
        
        try {
            if (args.length < 2)
            	throw new RuntimeException("Se deben pasar por lo menos dos argumentos");
            
        	System.out.println("CADENA: " + obtenerCadena(args));
        }
        catch (Exception ex) {
        	System.out.println("Excepcion: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new RepeatServer().startLoop(args);
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
	
	private String obtenerCadena(String[] args) {
		String cadena = args[0];
		String delimitador = "";
		
		revisarValidezCadena(cadena);		
		int cantidad = controlarCantidad(args);
		delimitador = controlarDelimitador(args, delimitador);
		
		cadena += delimitador;
		return cadena.repeat(cantidad);
	}

	public String controlarDelimitador(String[] args, String delimitador) {
		if (args[2] != null && !args[2].isBlank())
			delimitador = args[2];
		return delimitador;
	}

	public int controlarCantidad(String[] args) {
		int cantidad = Integer.parseInt(args[1]);
		
		if (cantidad < 0)
			throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
		return cantidad;
	}

	public void revisarValidezCadena(String cadena) {
		if (cadena == null)
			throw new NullPointerException("El string es nulo");
		
		if (cadena.isEmpty())
			throw new IllegalArgumentException("El string está vacío");
	}

}
