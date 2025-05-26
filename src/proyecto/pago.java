package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class pago extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombreField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tarjetaField;
	private JLabel lblNewLabel_3;
	private JTextField cvcField;
	private JLabel lblNewLabel_4;
	private JTextField pinField;
	private JButton pagarButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pago frame = new pago();
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
	public pago() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(pago.class.getResource("/imagenes/ChatGPT.png")));
		setTitle("LionGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 543, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pagarButton = new JButton("PAGAR");
		pagarButton.setBackground(new Color(128, 128, 128));
		pagarButton.setForeground(new Color(255, 255, 255));
		pagarButton.setFont(new Font("Verdana", Font.BOLD, 15));
		pagarButton.setBounds(190, 210, 98, 29);
		contentPane.add(pagarButton);
		
		pagarButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nombre = nombreField.getText();
		        String pin = pinField.getText();

		        if (validarUsuario(nombre, pin)) {
		            String codigo = generarCodigo();
		            JOptionPane.showMessageDialog(null, "Este es tu código: " + codigo);
		        } else {
		            JOptionPane.showMessageDialog(null, "Error: Datos incorrectos.");
		        }
		    }

			private String generarCodigo() {
				Random random = new Random();
			    int numeroAleatorio = 100000000 + random.nextInt(900000000); // Garantiza 9-10 dígitos
			    return String.valueOf(numeroAleatorio);

			}
		});

		
		pinField = new JTextField();
		pinField.setFont(new Font("Verdana", Font.PLAIN, 14));
		pinField.setColumns(10);
		pinField.setBounds(158, 128, 74, 24);
		contentPane.add(pinField);
		
		
		lblNewLabel_4 = new JLabel("Pin:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_4.setBounds(114, 134, 34, 13);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("CVC:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_3.setBounds(242, 134, 46, 13);
		contentPane.add(lblNewLabel_3);
		
		cvcField = new JTextField();
		cvcField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cvcField.setColumns(10);
		cvcField.setBounds(285, 128, 74, 24);
		contentPane.add(cvcField);
		
		lblNewLabel_2 = new JLabel("Numeración:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 87, 118, 13);
		contentPane.add(lblNewLabel_2);
		
		tarjetaField = new JTextField();
		tarjetaField.setFont(new Font("Verdana", Font.PLAIN, 14));
		tarjetaField.setColumns(10);
		tarjetaField.setBounds(132, 76, 244, 24);
		contentPane.add(tarjetaField);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 38, 74, 13);
		contentPane.add(lblNewLabel_1);
		
		nombreField = new JTextField();
		nombreField.setFont(new Font("Verdana", Font.PLAIN, 14));
		nombreField.setBounds(132, 32, 244, 24);
		contentPane.add(nombreField);
		nombreField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(pago.class.getResource("/imagenes/fondo.png")));
		lblNewLabel.setBounds(0, 0, 529, 306);
		contentPane.add(lblNewLabel);
	}
	
	private boolean validarUsuario(String nombre, String pin) {
	    try {
	        // Establece la conexión con la base de datos a través de 'ConexionDB'.
	        Connection con = ConexionDB.conectar(); // Usamos la conexión establecida.

	        // Si la conexión falla, muestra un mensaje de error y devuelve 'false'.
	        if (con == null) { 
	            System.out.println("Error: No se pudo establecer conexión con la base de datos.");
	            return false;
	        }

	        // Prepara la consulta SQL para buscar el usuario y el PIN en la tabla 'usuarios'.
	        String sql = "SELECT * FROM usuarios WHERE nombre = ? AND pin = ?";
	        PreparedStatement stmt = con.prepareStatement(sql); // Crea un objeto 'PreparedStatement' para ejecutar la consulta.

	        // Sustituye los parámetros '?' de la consulta por los valores ingresados.
	        stmt.setString(1, nombre); // Asigna el nombre del usuario a la consulta.
	        stmt.setString(2, pin); // Asigna el PIN a la consulta.

	        // Ejecuta la consulta y almacena el resultado en un 'ResultSet'.
	        ResultSet rs = stmt.executeQuery();

	        // Si la consulta encuentra un usuario con el nombre y PIN ingresados, devuelve 'true'.
	        return rs.next(); // Devuelve 'true' si hay coincidencia en la base de datos.

	    } catch (SQLException ex) { 
	        // Si ocurre un error en la ejecución de la consulta, lo imprime en la consola.
	        ex.printStackTrace();
	        return false; // Devuelve 'false' si hay un problema en la base de datos.
	    }
	}
}
