package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class OlvidarContraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userField;
	private JTextField emailField;
	private JPasswordField pinField;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alfonso\\Downloads\\ChatGPT Image 21 may 2025, 09_47_302.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton recuperarButton = new JButton("Recuperar");
		recuperarButton.setFont(new Font("Verdana", Font.BOLD, 15));
		recuperarButton.setForeground(new Color(255, 255, 255));
		recuperarButton.setBackground(new Color(128, 128, 128));
		recuperarButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                recuperarButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                recuperarButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		recuperarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                recuperarCredenciales();
            }
        });

		
		pinField = new JPasswordField();
		pinField.setForeground(new Color(255, 255, 255));
		pinField.setFont(new Font("Verdana", Font.BOLD, 15));
		pinField.setBackground(new Color(128, 128, 128));
		pinField.setBounds(493, 313, 71, 32);
		contentPane.add(pinField);
		pinField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) { // Bloquear entrada si no es número
                    e.consume();
                }

                if (pinField.getPassword().length >= 4) { // Limitar a 4 caracteres
                    e.consume();
                }
            }
        });
		
		JButton salirButton = new JButton("Salir");
		salirButton.setForeground(Color.WHITE);
		salirButton.setFont(new Font("Verdana", Font.BOLD, 15));
		salirButton.setBackground(Color.GRAY);
		salirButton.setBounds(459, 385, 136, 32);
		contentPane.add(salirButton);
		recuperarButton.setBounds(270, 385, 136, 32);
		contentPane.add(recuperarButton);
		salirButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                salirButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                salirButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		salirButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	proyectito nuevoFrame = new proyectito(); // Instancia la nueva ventana
	            nuevoFrame.setVisible(true); // La muestra en pantalla
	            dispose(); // Cierra el JFrame actual
		    }});
		
		userField = new JTextField();
		userField.setForeground(new Color(255, 255, 255));
		userField.setBackground(new Color(128, 128, 128));
		userField.setFont(new Font("Verdana", Font.BOLD, 15));
		userField.setColumns(10);
		userField.setBounds(368, 159, 196, 32);
		contentPane.add(userField);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Verdana", Font.BOLD, 15));
		emailField.setForeground(new Color(255, 255, 255));
		emailField.setBackground(new Color(128, 128, 128));
		emailField.setColumns(10);
		emailField.setBounds(368, 237, 196, 32);
		contentPane.add(emailField);
		
		JLabel lblPin = new JLabel("Pin:");
		lblPin.setForeground(new Color(255, 255, 255));
		lblPin.setBackground(new Color(255, 255, 255));
		lblPin.setFont(new Font("Verdana", Font.BOLD, 15));
		lblPin.setBounds(426, 322, 46, 14);
		contentPane.add(lblPin);
		
		JLabel userLabel = new JLabel("Usuario:");
		userLabel.setForeground(new Color(255, 255, 255));
		userLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		userLabel.setBounds(270, 168, 82, 14);
		contentPane.add(userLabel);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setForeground(new Color(255, 255, 255));
		emailLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		emailLabel.setBounds(287, 245, 54, 14);
		contentPane.add(emailLabel);
		
		JLabel tituloLabel = new JLabel("Recuperar Contraseña");
		tituloLabel.setForeground(new Color(255, 255, 255));
		tituloLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		tituloLabel.setBounds(286, 34, 258, 44);
		contentPane.add(tituloLabel);
		
		JLabel pinLabel = new JLabel("");
		pinLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		pinLabel.setIcon(new ImageIcon("C:\\Users\\Alfonso\\Downloads\\fondo.png"));
		pinLabel.setBounds(0, 0, 806, 495);
		contentPane.add(pinLabel);
	}
	
	private void recuperarCredenciales() {
	    // Obtiene los valores ingresados por el usuario en los campos de texto.
	    String usuario = userField.getText(); 
	    String email = emailField.getText();
	    String pin = pinField.getText();
	    
	    // Verifica si el correo electrónico tiene un formato válido (debe contener "@" y ".").
	    if (!email.contains("@") || !email.contains(".")) { 
	        JOptionPane.showMessageDialog(null, "❌ El correo electrónico no cumple con el formato", "Error", JOptionPane.WARNING_MESSAGE);
	        email = null; // Invalida el email si el formato es incorrecto.
	    }

	    // Verifica que ninguno de los campos esté vacío. Si lo están, muestra una advertencia.
	    if (usuario.isEmpty() || email.isEmpty() || pin.isEmpty()) { 
	        JOptionPane.showMessageDialog(null, "⚠️ Todos los campos son obligatorios.");
	        return; // Detiene la ejecución de la función si algún campo está vacío.
	    }

	    // Llama al método 'recuperarCredenciales' de la clase 'RecuperarContraseñaDAO' 
	    // para verificar los datos en la base de datos y obtener un resultado.
	    String resultado = RecuperarContraseñaDAO.recuperarCredenciales(usuario, email, pin); 

	    // Muestra el resultado obtenido en un mensaje emergente (puede ser éxito o error).
	    JOptionPane.showMessageDialog(null, resultado); 
	}}