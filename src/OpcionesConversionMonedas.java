import javax.swing.JOptionPane;

public class OpcionesConversionMonedas {

	ConversorMonedas moneda = new ConversorMonedas();

	public void OpcionesMonedas(double valor) {

		String seleccion = (JOptionPane.showInputDialog(null, "Elije a la Moneda que deseas convertir tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {
						"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Real", "De Pesos a Libra",
						"De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos",
						"De Libra a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos","De Real a Pesos"},
				"seleccion")).toString();
		
		switch (seleccion) {
		case "De Pesos a Dolar":
			JOptionPane.showMessageDialog(null, "tienes $" + moneda.ConvertirDePesosADolar(valor)+" Dolares");
			break;
		case "De Pesos a Euro":
			JOptionPane.showMessageDialog(null, "tienes $"+ moneda.ConvertirDePesosAEuro(valor)+ " Euros");
			break;
		case "De Pesos a Real":
			JOptionPane.showMessageDialog(null, "tienes $"+ moneda.ConvertirDePesosAReal(valor)+ " Reales");
			break;
		case "De Pesos a Libra":
			JOptionPane.showMessageDialog(null,"tienes $"+ moneda.ConvertirDePesosALibraE(valor)+ " Libras");
			break;
		case "De Pesos a Yen":
			JOptionPane.showMessageDialog(null,"tienes $"+ moneda.ConvertirDePesosaYen(valor)+" Yenes");
			break;
		case "De Pesos a Won Coreano":
			JOptionPane.showMessageDialog(null,"tienes $"+ moneda.ConvertirDePesosAWon(valor)+" Wones Coreanos");
			break;
		case "De Dolar a Pesos":
			JOptionPane.showMessageDialog(null,"tienes $"+moneda.ConvertirDeDollarAPesos(valor)+ "Pesos Argentinos" );
			break;
		case "De Euro a Pesos":
			JOptionPane.showMessageDialog(null,"tienes $"+ moneda.ConvertirDeEuroAPesos(valor)+"Pesos Argentinos" );
			break;
		case "De Libra a Pesos":
			JOptionPane.showMessageDialog(null,"tienes $"+ moneda.ConvertirDeLibraEAPesos(valor)+"Pesos Argentinos" );
			break;
		case "De Yen a Pesos":
			JOptionPane.showMessageDialog(null,"tienes $"+moneda.ConvertirDeYenAPesos(valor)+ "Pesos Argentinos" );
			break;
		case "De Won Coreano a Pesos":
			JOptionPane.showMessageDialog(null,"tienes $"+moneda.ConvertirDeWonAPesos(valor)+ "Pesos Argentinos" );
			break;
		case "De Real a Pesos":
			JOptionPane.showMessageDialog(null,"tienes $"+moneda.ConvertirDeRealAPesos(valor)+ "Pesos Argentinos" );
			break;
			
		}
	}
}
