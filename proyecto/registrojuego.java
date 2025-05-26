package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Panel;
import javax.swing.JSeparator;

public class registrojuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrojuego frame = new registrojuego();
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
	public registrojuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(313, 312, 96, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(411, 312, 96, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setBounds(313, 66, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(313, 97, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(313, 128, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(313, 159, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(313, 190, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(313, 221, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(313, 252, 86, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("Usuario :");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel.setBounds(243, 69, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNombre.setBounds(243, 100, 60, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido :");
		lblApellido.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblApellido.setBounds(243, 131, 60, 14);
		contentPane.add(lblApellido);
		
		JLabel lblPin = new JLabel("Pin :");
		lblPin.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblPin.setBounds(243, 162, 46, 14);
		contentPane.add(lblPin);
		
		JLabel lblCorreoElectronico = new JLabel("Correo electronico:");
		lblCorreoElectronico.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblCorreoElectronico.setBounds(190, 193, 113, 14);
		contentPane.add(lblCorreoElectronico);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono :");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_5.setBounds(229, 224, 60, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Direccion :");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_6.setBounds(229, 255, 60, 14);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andalucía ", "Aragón ", "Canarias ", "Cantabria ", "Castilla La Mancha ", "Castilla y León ", "Cataluña ", "Comunidad de Madrid "}));
		comboBox.setBounds(315, 283, 124, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6_1 = new JLabel("Provincia :");
		lblNewLabel_6_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(229, 286, 60, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Genero :");
		lblNewLabel_6_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_6_1_1.setBounds(229, 316, 60, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JButton btnNewButton = new JButton("Registrarse ");
		btnNewButton.setBounds(229, 399, 114, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar ");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBounds(359, 399, 106, 23);
		contentPane.add(btnLimpiar);
		
		JLabel lblRegistroDeUsuario = new JLabel("Registro de Usuario");
		lblRegistroDeUsuario.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblRegistroDeUsuario.setBounds(108, 11, 399, 44);
		contentPane.add(lblRegistroDeUsuario);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("Pregunta de Recuperacion :");
		lblNewLabel_6_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_6_1_1_1.setBounds(81, 355, 150, 14);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"¿Cual es tu color Favorito ?", "¿Nombre de tu primera mascota ? ", "¿Nombre de tu Madre ? ", "¿Nombre de cantante favorito ?"}));
		comboBox_1.setBounds(243, 352, 156, 22);
		contentPane.add(comboBox_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(421, 353, 86, 20);
		contentPane.add(textField_7);
	}
}
