
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