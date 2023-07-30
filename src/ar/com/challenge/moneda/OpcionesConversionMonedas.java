package ar.com.challenge.moneda;
import javax.swing.JOptionPane;
/**
 * 
 * @author facundo
 *esta clase genera un cuadro de dialogo que da a conocer las opciones de conversion de las monedas tratadas,
 *recibiendo como parametro el valor que el usuario desea convertir de una moneda a pesos, o de pesos a otra moneda
 */
public class OpcionesConversionMonedas {

	ConversorMonedas moneda = new ConversorMonedas();
/**
 * 
 * @param valor es el valor que ingresa el usuario para convertir de una opcion a otra
 */
	public void OpcionesMonedas(double valor) {
/**
 * Muestra un ventana de dialogo en la que el usuario elije que opciones usar
 * se encuentran dentro del arreglo que en vez de definirlo afuera lo defini dentro de las opciones que da la 
 * clase JOptionPane de Java.Swing
 */
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
