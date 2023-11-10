package JavaMensaje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaMensaje {

	private JFrame frmEjemploRemoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaMensaje window = new JavaMensaje();
					window.frmEjemploRemoto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaMensaje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemploRemoto = new JFrame();
		frmEjemploRemoto.setTitle("Ejemplo remoto.\r\n");
		frmEjemploRemoto.setBounds(100, 100, 450, 300);
		frmEjemploRemoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_principal = new JPanel();
		frmEjemploRemoto.getContentPane().add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Boton pulsado.";
			
			}
		});
		panel_principal.add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Boton pulsado.";
			}
		});
		panel_principal.add(btnNewButton_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Boton pulsado.";
			}
		});
		panel_principal.add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String mensaje="Boton pulsado.";
			
			}
		});
		panel_principal.add(btnNewButton_3, BorderLayout.CENTER);
	}

}
