package ar.com.challenge.manejo;
import javax.swing.JOptionPane;
import ar.com.challenge.moneda.*;
import ar.com.challenge.temperatura.*;
/**
 * Esta clase maneja las conversiones de los tipo monedas y temperatura
 * @author facundo
 * @version 1.0 aprendiendo
 * 
 * 
 *
 */


public class ManejoConversiones {
	
	private boolean fin = true;
	/**
	 * para finalizar el porgrama se declaro esta variable la cual cambia 
	 * a false al determinar si continua o no
	 * @param fin es el booleano que pone fin al ciclo de ejecucion de la clase main 
	 */
	public void setFin(boolean es) {
		this.fin = es;
		
	}
	/**
	 * returna el valor del parametro booleano Fin
	 */
	public boolean isFin() {
	
		return fin;
	}
	/**
	 * se inicializan los objetos que contienen las opciones de conversion
	 */
	OpcionesConversionMonedas moneda = new OpcionesConversionMonedas();
	OpcionesConversionTemperaturas temperatura = new OpcionesConversionTemperaturas();
	/**
	 * Accede a los valores de conversion de las monedas
	 */
	public void TratoMoneda() {
		
		
		
			String valor = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:","input",
					JOptionPane.QUESTION_MESSAGE);
			
			try {
				/**
				 * el usurio podria ingresar un valor que no sea del tipo double por lo tanto
				 * opte por sacarlo del programa, en vez de darle la opcion a que siga ingresando
				 */
			double input = Double.parseDouble(valor);
			moneda.OpcionesMonedas(input);
			}catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "debe ingresar un valor numerico", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				
			}
			/**
			 * para manejar esta excepcion se podria haber echo un bloque condicional
			 * para que vuelva a darle la opcion de ingresar el valor si no es del tipo numerico
			 */
			
			int respuesta = JOptionPane.showConfirmDialog(null,"Deseas hacer otra conversion?","selecione una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
			if (respuesta == JOptionPane.OK_OPTION) {
				System.out.println("");
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				this.setFin(false);
				/**
				 * al final setea el valor booleano fin en false para finalizar la ejecucion
				 */
			}
	
			
			
	}
	/**
	 *   Accede a los valores de la conversion de la temperatura
	 */
	public void TratoTemperatura() {
		
		
			String valor = JOptionPane.showInputDialog(null,"Ingrese el valor de la temperatura que deseas convertir:","input",JOptionPane.QUESTION_MESSAGE);
			try {
				/**
				 * el usurio podria ingresar un valor que no sea del tipo double por lo tanto
				 * opte por sacarlo del programa, en vez de darle la opcion a que siga ingresando
				 */
			double input = Double.parseDouble(valor);
			temperatura.OpcionesTemperatura(input);
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "debe ingresar un valor numerico", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				/**
				 * para manejar esta excepcion se podria haber echo un bloque condicional
				 * para que vuelva a darle la opcion de ingresar el valor si no es del tipo numerico
				 */
			}
			
			int respuesta = JOptionPane.showConfirmDialog(null,"Deseas hacer otra conversion?","selecione una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
			if (respuesta == JOptionPane.OK_OPTION) {
				System.out.println("");
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				this.setFin(false);
				/**
				 * al final setea el valor booleano fin en false para finalizar la ejecucion
				 */
			}
		}
}



