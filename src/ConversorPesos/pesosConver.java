package ConversorPesos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pesosConver extends JFrame {

	private JPanel contentPane;
	private JTextField txtDinero;
	public static double respuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pesosConver frame = new pesosConver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pesosConver() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 445, 198);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese La Cantidad de Dinero a Convertir");
		lblNewLabel.setBounds(111, 27, 277, 24);
		contentPane.add(lblNewLabel);
		
		txtDinero = new JTextField();
		txtDinero.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				int key = e.getKeyChar();

			    boolean numeros = key >= 48 && key <= 57;
			        
			    if (!numeros)
			    {
			    	JOptionPane.showMessageDialog(null, "DIGITE SOLO NÚMEROS");
			    	txtDinero.setText("");
			        e.consume();
			        
			    }
			}
		});
		txtDinero.setBounds(121, 62, 200, 24);
		contentPane.add(txtDinero);
		txtDinero.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				respuesta = Integer.parseInt(txtDinero.getText());
				
				dispose();
				formConver formConver = new formConver();
				formConver.setVisible(true);
				
				//JOptionPane.showMessageDialog(null, suma);
			}
		});
		btnNewButton.setBounds(181, 107, 89, 23);
		contentPane.add(btnNewButton);
	}
}
