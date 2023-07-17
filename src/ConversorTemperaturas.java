
public class ConversorTemperaturas {
	      
	public double DeCelsiusAKelvin (double valor) {
		return valor+273.15;
	}
	public double DeKelvinACelsius(double valor) {
		return valor-273.15;
	}
	public double DeCelsiusAFahrenheit(double valor) {
		return valor*1.8+32;
	}
	public double DeFahrenheitACelsius(double valor) {
		return (valor-32)/1.8;
	}
	public double DeKelvinAFahrenheit (double valor) {
		return 1.8*(valor+273.15)+32;
	}
	public double DeFahrenheitAKelvin(double valor) {
		return (valor-32)/1.8+273.15;
	}
}
