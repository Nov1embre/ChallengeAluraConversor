package ar.com.challenge.temperatura;
/**
 * Esta clase realiza la conversion de temperaturas
 * @author facundo
 *
 */

public class ConversorTemperaturas {
	      /**
	       * @param valor es el valor que ingresa el usuario del tipo double
	       * @return la conversion ya realizada
	       */
	public double DeCelsiusAKelvin (double valor) {
		
		return valor+273.15;
	}
	/**
	 * Convierte de Grados Kelvin a Grados Celcius
	 * @param valor ingresado por el usuario
	 * @return el valor convertido
	 */
	public double DeKelvinACelsius(double valor) {
		
		return valor-273.15;
	}
	/**
	 * Convierte de Grados Celcius a Grados Fahrenheit
	 * @param valor ingresado por el usuario
	 * @return el valor convetido
	 */
	public double DeCelsiusAFahrenheit(double valor) {
		
		return valor*1.8+32;
	}
	/**
	 * Convierte de Grados Fahrenheit a Grados Celcius
	 * @param valor ingresado por el usuario
	 * @return el valor convertido
	 */
	public double DeFahrenheitACelsius(double valor) {
	
		return (valor-32)/1.8;
	}
	/**
	 * Convierte de Grados Kelvin a Grados Fahrenheit
	 * @param valor ingresado por el usuario
	 * @return el valor convertido
	 */
	public double DeKelvinAFahrenheit (double valor) {
		
		return 1.8*(valor+273.15)+32;
	}
	/**
	 * Convierte de Grados Fahrenhei a Grados Kelvin
	 * @param valor ingresado por el usuario
	 * @return el valor convertido
	 */
	
	public double DeFahrenheitAKelvin(double valor) {
		
		return (valor-32)/1.8+273.15;
	}
}
