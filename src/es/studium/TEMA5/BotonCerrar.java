package es.studium.TEMA5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BotonCerrar implements ActionListener {
			
	Frame ventana = new Frame("Cerrar ventana");
	Button btnCerrar = new Button("Cerrar Ventana");
	
	public BotonCerrar() {
		
		ventana.setSize(270,220);
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		btnCerrar.addActionListener(this);
		ventana.add(btnCerrar);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new BotonCerrar();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
		
	}

}
