package ar.com.challenge.moneda;

/**
 *  Esta clase enum tiene declarado las constantes de tipo de cambio al valor del peso argentino al dia 
 * 30/7
 * Cabe aclarar que en este momento el pais vive una crisis inflacionaria muy grande, por lo tanto
 * los resultados son a modo demostrativo de que el programa cumple los requisitos.
 * @author facundo
 * @version 1.0 aprendiendo
 */
public enum TiposDeCambio {

	
	DOLAR_OFICIAL(271.80),
	
	EURO(295.48),
	
	REAL(58.35),
	
	LIBRA_ESTERLINA(327.69),
	
	YEN(178.40),
	
	WON_SURCOERANO(5.03);
	
	private final double valor;
	
	TiposDeCambio(double d) {
		valor=d;
	}

	public double getValor() {
		return valor;
	}
	

}