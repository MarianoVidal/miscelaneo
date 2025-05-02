package unlp.oo2.patrones.ej19;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherTest {

	HomeWeatherStation hws;
	List<Double> tempHist;
	
	@BeforeEach
	void setUp() throws Exception {
		tempHist = new ArrayList<Double>();
		
		tempHist.add(27.0);
		tempHist.add(28.0);
		tempHist.add(29.0);
		tempHist.add(30.0);
		tempHist.add(31.0);
		tempHist.add(32.0);
		
		hws = new HomeWeatherStation(30, 1008, 200, tempHist);
	}
	
	@Test
	void test_enunciado_ejemplo_5() {
		WeatherDecorator objetoActual = new WeatherDecoratorMaximo(
					new WeatherDecoratorMinimo(
								new WeatherDecoratorPromedio(
											new WeatherDecoratorCelsius(hws)
										)
							)
				);
				
		String valorEsperado = "Temperatura C: 30.0; Presión atmosf: 1008.0; Radiación solar: 200.0; Promedio: 29.5; Mínimo: 27.0; Máximo: 32.0;";
		Assertions.assertEquals(valorEsperado, objetoActual.displayData());
	}
}
