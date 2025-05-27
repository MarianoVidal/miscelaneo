package unlp.oo2.patrones.ej22;

public class LightMix extends ProcessStep {
	//
	// INTERFAZ PÚBLICA
	
	@Override
	public boolean basicExecute(MixingTank tank) {
		return tank.heatPower(20) 
				&& tank.mixerPower(5);
	}
}