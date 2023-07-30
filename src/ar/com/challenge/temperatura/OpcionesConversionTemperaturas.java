package ar.com.challenge.temperatura;
import javax.swing.JOptionPane;
/**
 * 
 * @author facundo
 *
 *Esta clase tiene las opciones de conversion de temperatura que se le permiten 
 *al usuario
 */

public class OpcionesConversionTemperaturas {

	ConversorTemperaturas temperatura = new ConversorTemperaturas();
	/**
	 * Este metodo despliega una ventana con opciones de conversion y recibe el valor que el usuario quiere convertir
	 * @param valor es el valor que ingresa el usuario para convertir la temperatura
	 */

	public void OpcionesTemperatura(double valor) {
		

		String seleccion = (JOptionPane.showInputDialog(null, "Elije la temperatura que deseas convertir",
				"Temperaturas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Celsius a Kelvin", "De Kelvin a Celsius", "De Celsius a Fahrenheit",
						"De Fahrenheit a Celsius", "De Kelvin a Fahrenheit", "De Fahrenheit a Kelvin" },
				"seleccion")).toString();
		switch (seleccion) {
		case "De Celsius a Kelvin":
			JOptionPane.showMessageDialog(null,
					valor + " Grados Celsius son : " + temperatura.DeCelsiusAKelvin(valor) + " Grados Kelvin");
			break;
		case "De Kelvin a Celsius":
			JOptionPane.showMessageDialog(null,
					valor + " Grados Kelvin son : "+ temperatura.DeKelvinACelsius(valor)+ " Grados Celsius");
			break;
		case "De Celsius a Fahrenheit":
			JOptionPane.showMessageDialog(null,
					valor + " Grados Celsius son : "+ temperatura.DeCelsiusAFahrenheit(valor)+ " Grados Fahrenheit");
			break;
		case "De Fahrenheit a Celsius":
			JOptionPane.showMessageDialog(null,
					valor + " Grados Fahrenheit son : "+temperatura.DeFahrenheitACelsius(valor)+ " Grados Celsius");
			break;
		case "De Kelvin a Fahrenheit":
			JOptionPane.showMessageDialog(null,
					valor + " Grados Kelvin son : "+temperatura.DeKelvinAFahrenheit(valor)+ " Grados Farenheit");
			break;
		}
	}
}
