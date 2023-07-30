package ar.com.challenge.moneda;
/**
 * Esta clase realiza la conversion dependiendo de la eleccion
 * @author facundo
 * @version 1.0 aprendiendo
 */

public class ConversorMonedas {
	/**
	 * Convierte de Pesos a Dolares
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDePesosADolar(double valor) {
		
			
		return Math.round(valor/TiposDeCambio.DOLAR_OFICIAL.getValor()*100d)/100d; 
	}
	/**
	 * Convierte de Pesos a Euro
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDePesosAEuro (double valor) {
		
		return Math.round(valor/TiposDeCambio.EURO.getValor()*100d)/100d;
		
	}
	/**
	 * Convierte de Pesos a Real
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDePesosAReal (double valor) {
		
		return Math.round(valor/TiposDeCambio.REAL.getValor()*100d)/100d;
		}
	/**
	 * Convierte de Pesos a Libra Esterlina
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDePesosALibraE (double valor) {
		
		return Math.round(valor/TiposDeCambio.LIBRA_ESTERLINA.getValor()*100d)/100d;
		}
	/**
	 * Convierte de Pesos a Yenes
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDePesosaYen (double valor) {
		
		return Math.round(valor/TiposDeCambio.YEN.getValor()*100d)/100d;
		}
	/**
	 * Convierte de Pesos a Won Surcoreano
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDePesosAWon (double valor) {
		
		return Math.round(valor/TiposDeCambio.WON_SURCOERANO.getValor()*100d)/100d;
		}
	/**
	 * Convierte de Dolares a Pesos
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDeDollarAPesos(double valor) {
		
		return Math.round(valor*TiposDeCambio.DOLAR_OFICIAL.getValor()*100d)/100d;
	}
	/**
	 * Convierte de Euro a Peso
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDeEuroAPesos(double valor) {
		
		return Math.round(valor*TiposDeCambio.EURO.getValor()*100d)/100d;
	}
	/**
	 * Convierte de Libra Esterlina a Pesos
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDeLibraEAPesos(double valor) {
		
		return Math.round(valor*TiposDeCambio.LIBRA_ESTERLINA.getValor()*100d)/100d;
	}
	/**
	 * Convierte de Yenes a Pesos
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDeYenAPesos(double valor) {
		
		return Math.round(valor*TiposDeCambio.YEN.getValor()*100d)/100d;
	}
	/**
	 * Convierte de Won Surcoreano a Pesos
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDeWonAPesos(double valor) {
		
		return Math.round(valor*TiposDeCambio.WON_SURCOERANO.getValor()*100d)/100d;
	}
	/**
	 * Convierte de Reales a Pesos
	 * @param valor ingresado por el usuario 
	 * @return el valor redondeado con dos decimales
	 */
	public double ConvertirDeRealAPesos(double valor) {
		
		return Math.round(valor*TiposDeCambio.REAL.getValor()*100d)/100d;
	}
}
