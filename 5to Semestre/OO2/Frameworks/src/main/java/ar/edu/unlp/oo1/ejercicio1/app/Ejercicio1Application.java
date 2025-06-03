package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Logger logger = Logger.getLogger("WALL_POST");

				List<String> palabrasCensurables = new ArrayList<String>();
				palabrasCensurables.add("like");
				palabrasCensurables.add("dislike");
				
				SimpleCensoreFormatter simpleCensoreFormatter = new SimpleCensoreFormatter(palabrasCensurables);
				
				FileHandler fileHandler = null;
				try {
					fileHandler = new FileHandler("log.txt", true);
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONFormatter formatter = new JSONFormatter();
				logger.addHandler(fileHandler);
		        fileHandler.setFormatter(simpleCensoreFormatter);
				new WallPostUI(logger);
				
				
			}
		});
	}

}
