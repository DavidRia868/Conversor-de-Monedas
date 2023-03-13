package ConversorPesos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;// para crear el grupo de leccion enr adio button

public class menSeleccion extends JFrame {
	

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//CREA UN GRUPO PARA SELECCIONAR UN SOLO
	//tipo nombregrupopordefecto nuevonombregrupo = new nombregrupopordefecto
	private ButtonGroup opciones = new ButtonGroup();
	public static void Regresar()
	{
		int volverInicio = JOptionPane.showConfirmDialog(null,"¿DESEAS CONTINUAR?","VOLVER AL MENÚ", JOptionPane.YES_NO_OPTION);
		
		if(volverInicio == 0)
		{
			menSeleccion formInicio = new menSeleccion();
			formInicio.setVisible(true);
		}
		else if(volverInicio == 1)
		{
			JOptionPane.showMessageDialog(null, "GRACIAS POR USAR EL CONVERTIDO DE MONEDAS");
			System.exit(0);
		}
	
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menSeleccion frame = new menSeleccion();
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
	public menSeleccion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(167, 26, 116, 41);
		contentPane.add(lblNewLabel);
		
		JRadioButton radioConversor = new JRadioButton("Conversor de Monedas");
		radioConversor.setBackground(new Color(0, 153, 255));
		radioConversor.setForeground(new Color(0, 0, 0));
		radioConversor.setBounds(136, 95, 192, 23);
		contentPane.add(radioConversor);
		
		JRadioButton radioTempera = new JRadioButton("Conversor de Temperatura");
		radioTempera.setBackground(new Color(0, 153, 255));
		radioTempera.setForeground(new Color(0, 0, 0));
		radioTempera.setBounds(136, 131, 218, 23);
		contentPane.add(radioTempera);
		
		opciones.add(radioConversor);
		opciones.add(radioTempera);
		
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioConversor.isSelected() == true)
				{
					
					JOptionPane.showInternalMessageDialog(null, "USTED SELECCIONO EL CONVERSOR DE MONEDA");
					dispose();
					//cerrarForm();
					pesosConver formPesos = new pesosConver();
					formPesos.setVisible(true);
					
					
					
					
				
				}
				else
				{
					JOptionPane.showInternalMessageDialog(null, "USTED SELECCIONO la temperatura");
					temperatura formTempe = new temperatura();
					formTempe.setVisible(true);
				}
			}
		});
		btnEnviar.setBackground(new Color(204, 153, 0));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEnviar.setForeground(Color.BLUE);
		btnEnviar.setBounds(185, 188, 89, 23);
		contentPane.add(btnEnviar);
		
	}
}
