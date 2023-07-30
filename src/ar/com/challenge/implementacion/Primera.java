package ar.com.challenge.implementacion;
import javax.swing.JOptionPane;

import ar.com.challenge.manejo.*;
/**
 * Esta clase es la de implementacion del programa
 * @author facundo
 * @version 1.0 aprendiendo
 */
public class Primera {
	/**
	 *  La clase main siempre recibe un arreglo de string, todavia no se porques
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		ManejoConversiones input = new ManejoConversiones();
		try {
			while (input.isFin()) {
	/**
	 * este while asegura que el programa siga ejecutandose hasta que el usuario decida lo contrario
	 */
				String opciones = (String) JOptionPane.showInputDialog(null, "seleccione una opcion a convertir", "Menu",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "elejir");
	
				switch (opciones) {
				case "Conversor de Monedas":
					input.TratoMoneda();
					break;
					/**
					 * accede a las opciones del trato de la moneda
					 */
					
				case "Conversor de Temperatura":
					input.TratoTemperatura();
					break;
					/**
					 * accede a las opciones del trato de la temperatura
					 */
				}
			}
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
			/**
			 * @throw NullPointerException cuando el usuario apreta en cualquier ventana el
			 * boton cancelar
			 */
		}
	}

	

}

