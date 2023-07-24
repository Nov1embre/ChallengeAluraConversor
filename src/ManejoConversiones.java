import javax.swing.JOptionPane;

public class ManejoConversiones {
	private boolean es = true;

	public void setEs(boolean es) {
		this.es = es;
	}
	public boolean isEs() {
		return es;
	}
	OpcionesConversionMonedas moneda = new OpcionesConversionMonedas();
	OpcionesConversionTemperaturas temperatura = new OpcionesConversionTemperaturas();

	public void TratoMoneda() {
		
		
			String valor = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:","input",
					JOptionPane.QUESTION_MESSAGE);
			
			try {
			double input = Double.parseDouble(valor);
			moneda.OpcionesMonedas(input);
			}catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "debe ingresar un valor numerico", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			int respuesta = JOptionPane.showConfirmDialog(null,"Deseas hacer otra conversion?","selecione una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
			if (respuesta == JOptionPane.OK_OPTION) {
				System.out.println("");
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				this.setEs(false);
			}
	
			
			
	}
	
	public void TratoTemperatura() {
		
			String valor = JOptionPane.showInputDialog(null,"Ingrese el valor de la temperatura que deseas convertir:","input",JOptionPane.QUESTION_MESSAGE);
			try {
			double input = Double.parseDouble(valor);
			temperatura.OpcionesTemperatura(input);
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "debe ingresar un valor numerico", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
			
			int respuesta = JOptionPane.showConfirmDialog(null,"Deseas hacer otra conversion?","selecione una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
			if (respuesta == JOptionPane.OK_OPTION) {
				System.out.println("");
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				this.setEs(false);
			}
		}
}



