package unlp.oo2.patrones.ej22;

public class Purge extends ProcessStep {
	//
	// INTERFAZ PÚBLICA
	
	@Override
	public boolean basicExecute(MixingTank tank) {
		return tank.heatPower(0) 
				&& tank.mixerPower(0)
				&& tank.purge();
	}
}