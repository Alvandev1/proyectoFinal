package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class OlvidarContraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlvidarContraseña frame = new OlvidarContraseña();
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
	public OlvidarContraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(181, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(237, 73, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(237, 104, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(237, 135, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblPin = new JLabel("Pin :");
		lblPin.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblPin.setBounds(181, 75, 46, 14);
		contentPane.add(lblPin);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario :");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_1.setBounds(168, 106, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCorreoElectroncio = new JLabel("Correo Electronico:");
		lblCorreoElectroncio.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblCorreoElectroncio.setBounds(112, 137, 115, 14);
		contentPane.add(lblCorreoElectroncio);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("Pregunta de Recuperacion :");
		lblNewLabel_6_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_6_1_1_1.setBounds(10, 174, 150, 14);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"¿Cual es tu color Favorito ?", "¿Nombre de tu primera mascota ? ", "¿Nombre de tu Madre ? ", "¿Nombre de cantante favorito ?"}));
		comboBox_1.setBounds(158, 174, 169, 17);
		contentPane.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(338, 172, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblRecuperarConstrasea = new JLabel("Recuperar Contraseña");
		lblRecuperarConstrasea.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblRecuperarConstrasea.setBounds(72, 11, 399, 44);
		contentPane.add(lblRecuperarConstrasea);
	}

}
