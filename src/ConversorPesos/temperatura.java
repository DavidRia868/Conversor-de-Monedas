package ConversorPesos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

public class temperatura extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temperatura frame = new temperatura();
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
	public temperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR DE TEMPERATURA");
		lblNewLabel.setBounds(95, 34, 237, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblFaltaProgramar = new JLabel("FALTA PROGRAMAR");
		lblFaltaProgramar.setForeground(SystemColor.textHighlight);
		lblFaltaProgramar.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblFaltaProgramar.setBounds(95, 112, 237, 19);
		contentPane.add(lblFaltaProgramar);
	}
}
