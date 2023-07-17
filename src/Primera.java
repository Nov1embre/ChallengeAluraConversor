import javax.swing.JOptionPane;

public class Primera {

	public static void main(String[] args) {

		OpcionesConversionMonedas moneda = new OpcionesConversionMonedas();
		OpcionesConversionTemperaturas temperatura = new OpcionesConversionTemperaturas();

		while (true) {

			String opciones = (String) JOptionPane.showInputDialog(null, "seleccione una opcion a convertir", "Menu",
					JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "elejir");

			switch (opciones) {
			case "Conversor de Monedas":
				String valor = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:","input",
						JOptionPane.QUESTION_MESSAGE);
				double input = Double.parseDouble(valor);
				moneda.OpcionesMonedas(input);
				
				int respuesta = JOptionPane.showConfirmDialog(null,"Deseas hacer otra conversion?","selecione una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
				if (respuesta == JOptionPane.OK_OPTION) {
					System.out.println("");
				}else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}break;
				
			case "Conversor de Temperatura":
				String valor1 = JOptionPane.showInputDialog(null,"Ingrese el valor de la temperatura que deseas convertir:","input",JOptionPane.QUESTION_MESSAGE);
				double input1 = Double.parseDouble(valor1);
				temperatura.OpcionesTemperatura(input1);
				
				int respuesta1 = JOptionPane.showConfirmDialog(null,"Deseas hacer otra conversion?","selecione una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
				if (respuesta1 == JOptionPane.OK_OPTION) {
					System.out.println("");
				}else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}break;
			}
		}

	

	}
}
