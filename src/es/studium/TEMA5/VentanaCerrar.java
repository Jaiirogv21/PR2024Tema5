package es.studium.TEMA5;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VentanaCerrar implements WindowListener {
	
	Frame ventana = new Frame("Ventana que se cierra");
	
	public VentanaCerrar() {
		ventana.setSize(270, 220);
		ventana.addWindowListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaCerrar();

	}


	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println();
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("La ventana se cerró");
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("La ventana se minimizó");
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("La ventana se restauró");
	}


	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("La ventana se activó");
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("La ventana se desactivó");
		
	

}
}