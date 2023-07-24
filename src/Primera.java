import javax.swing.JOptionPane;

public class Primera {

	public static void main(String[] args) {
		
		ManejoConversiones input = new ManejoConversiones();
		try {
			while (input.isEs()) {
	
				String opciones = (String) JOptionPane.showInputDialog(null, "seleccione una opcion a convertir", "Menu",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "elejir");
	
				switch (opciones) {
				case "Conversor de Monedas":
					input.TratoMoneda();
					break;
					
				case "Conversor de Temperatura":
					input.TratoTemperatura();
					break;
				}
			}
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
	}

	

}

