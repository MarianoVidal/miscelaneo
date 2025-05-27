package oo2.unlp.frameworks.SingleThreadTCPServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {
	
	// HOT SPOTS - Lo tiene que implementar cada clase que extienda
    
	public abstract void handleMessage(String message, PrintWriter out);
    public abstract boolean checkTerminationMessage(String input);
    public abstract void showMessageOpen(Socket clientSocket, String inputLine);
    public abstract void showMessageClose(Socket clientSocket, String inputLine);
    
    /*
	public void showMessage(Socket clientSocket, String inputLine) {
		System.out.println("Received message: " + inputLine + " from "
		+ clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
	}
	*/

    // FROZEN SPOTS
    
    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

    
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java"+this.getClass().getName() +"<port number>");
    }

    

    private final void handleClient(Socket clientSocket) {
        
        try (
        		// Este objeto escribe el contenido que se obtiene
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        		
        		//Este objeto obtiene el contenido que se ingresa
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
            		String inputLine;
            		while ((inputLine = in.readLine()) != null) {
            			// Hook
            			showMessageOpen(clientSocket, inputLine);
            			
            			// Hook
            			if (checkTerminationMessage(inputLine)) {
            				break; // Client requested to close the connection
            		}
            		// Hook
            		handleMessage(inputLine, out);
            	}
            	
            	// Una vez que se apretó espacio, se cierra la conexión del Socket - Hook
            	showMessageClose(clientSocket, inputLine);
        } catch (IOException e) {
        	// Mensaje de error al tratar de establecer la comunicación
            System.err.println("Problem with communication with client: " + e.getMessage());
        } finally {
            try {
            	// Cerrar el Socket
                clientSocket.close();
            } catch (IOException e) {
            	// Si sale mal, devolver un mensaje con el error
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }
}
