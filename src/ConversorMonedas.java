

public class ConversorMonedas {
	
	public double ConvertirDePesosADolar(double valor) {
			
		return Math.round(valor/TiposDeCambio.DOLAR_OFICIAL.getValor()*100d)/100d; 
	}
	
	public double ConvertirDePesosAEuro (double valor) {
		return Math.round(valor/TiposDeCambio.EURO.getValor()*100d)/100d;
		
	}
	public double ConvertirDePesosAReal (double valor) {
		return Math.round(valor/TiposDeCambio.REAL.getValor()*100d)/100d;
		}
	public double ConvertirDePesosALibraE (double valor) {
		return Math.round(valor/TiposDeCambio.LIBRA_ESTERLINA.getValor()*100d)/100d;
		}
	public double ConvertirDePesosaYen (double valor) {
		return Math.round(valor/TiposDeCambio.YEN.getValor()*100d)/100d;
		}
	public double ConvertirDePesosAWon (double valor) {
		return Math.round(valor/TiposDeCambio.WON_SURCOERANO.getValor()*100d)/100d;
		}
	
	public double ConvertirDeDollarAPesos(double valor) {
		return Math.round(valor*TiposDeCambio.DOLAR_OFICIAL.getValor()*100d)/100d;
	}
	public double ConvertirDeEuroAPesos(double valor) {
		return Math.round(valor*TiposDeCambio.EURO.getValor()*100d)/100d;
	}
	public double ConvertirDeLibraEAPesos(double valor) {
		return Math.round(valor*TiposDeCambio.LIBRA_ESTERLINA.getValor()*100d)/100d;
	}
	public double ConvertirDeYenAPesos(double valor) {
		return Math.round(valor*TiposDeCambio.YEN.getValor()*100d)/100d;
	}
	public double ConvertirDeWonAPesos(double valor) {
		return Math.round(valor*TiposDeCambio.WON_SURCOERANO.getValor()*100d)/100d;
	}
	public double ConvertirDeRealAPesos(double valor) {
		return Math.round(valor*TiposDeCambio.REAL.getValor()*100d)/100d;
	}
}
