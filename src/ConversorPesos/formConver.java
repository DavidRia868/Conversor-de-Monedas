package ConversorPesos;

import java.awt.EventQueue;
//import java.lang.Math;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formConver extends JFrame {

	private JPanel contentPane;
	protected JLabel txtDinero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formConver frame = new formConver();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public formConver() {
		setBackground(new Color(255, 140, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 449, 212);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<?> menuite = new JComboBox();
		menuite.setModel(new DefaultComboBoxModel(new String[] {"Pesos a Dólar", "Pesos a Euros", 
											"Pesos a Libras Esterlinas","Pesos a Yen Japonés",
											"Pesos a Won Surcoreano", "Dólar a Pesos",
											"Euros a Pesos", "Libras Esterlinas a Pesos", "Yen Japonés a Pesos", 
											"Won Surcoreano a Pesos"}));
		//menuite.setToolTipText("");
		menuite.setBounds(97, 64, 222, 23);
		contentPane.add(menuite);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if (menuite.getSelectedItem() == "Pesos a Dólar")
				{
					
					double resul = Math.ceil((pesosConver.respuesta * 0.00021)*100)/100;
					
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Dolares" );
					dispose();
					menSeleccion.Regresar();
				}
				else if (menuite.getSelectedItem() == "Pesos a Euros")
				{
					double resul = Math.ceil((pesosConver.respuesta * 0.00020)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Euros" );
					dispose();
					menSeleccion.Regresar();
				}
				else if (menuite.getSelectedItem() == "Pesos a Libras Esterlinas")
				{
					double resul = Math.ceil((pesosConver.respuesta * 0.00018)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Libras Esterlinas" );
					dispose();
					menSeleccion.Regresar();
				}
				else if (menuite.getSelectedItem() == "Pesos a Yen Japonés")
				{
					double resul = Math.ceil((pesosConver.respuesta * 0.034)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Yen Japonés" );
					dispose();
					menSeleccion.Regresar();
				}
				else if (menuite.getSelectedItem() == "Pesos a Won Surcoreano")
				{
					double resul = Math.ceil((pesosConver.respuesta * 0.2793)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Won Surcoreano" );
					dispose();
					menSeleccion.Regresar();
				}
				//CONVERTIDOR DE DOLARES, EUROS TC.. A PESOS COLOMBIANOS
				else if (menuite.getSelectedItem() == "Dólar a Pesos")
				{
					double resul = Math.ceil((pesosConver.respuesta * 4718.50)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Pesos Colombianos" );
					dispose();
					menSeleccion.Regresar();
				}
				else if (menuite.getSelectedItem() == "Euros a Pesos")
				{
					double resul = Math.ceil((pesosConver.respuesta * 5020.86)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Pesos Colombianos" );
					dispose();
					menSeleccion.Regresar();
				}
				else if (menuite.getSelectedItem() == "Libras Esterlinas a Pesos")
				{
					double resul = Math.ceil((pesosConver.respuesta * 5673.26)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Pesos Colombianos" );
					dispose();
					menSeleccion.Regresar();
				}
				else if (menuite.getSelectedItem() == "Yen Japonés a Pesos")
				{
					double resul = Math.ceil((pesosConver.respuesta * 34.98)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Pesos Colombianos" );
					dispose();
					menSeleccion.Regresar();
				}
				else if (menuite.getSelectedItem() == "Won Surcoreano a Pesos")
				{
					double resul = Math.ceil((pesosConver.respuesta * 3.5719)*100)/100;
					JOptionPane.showMessageDialog(null, "Usted Tiene: " + "$"+resul + " Pesos Colombianos" );
					dispose();
					menSeleccion.Regresar();
				}
				
				
			}
		});
		
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(171, 121, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Convertir De:");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		lblNewLabel.setBounds(171, 11, 111, 27);
		contentPane.add(lblNewLabel);
		
		String opcion  = menuite.getSelectedItem().toString();
		

		
		
		
	}
}
