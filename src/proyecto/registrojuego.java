package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Panel;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class registrojuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userField;
	private JTextField nombreField;
	private JTextField apellidoField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JPasswordField pinField;

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
		setTitle("LionGame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alfonso\\Downloads\\ChatGPT Image 21 may 2025, 09_47_302.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pinLabel = new JLabel("Pin:");
		pinLabel.setForeground(Color.WHITE);
		pinLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		pinLabel.setBounds(398, 315, 34, 14);
		contentPane.add(pinLabel);
		
		pinField = new JPasswordField(4);
		pinField.setFont(new Font("Verdana", Font.BOLD, 15));
		pinField.setForeground(new Color(255, 255, 255));
		pinField.setBackground(new Color(128, 128, 128));
		pinField.setBounds(452, 307, 122, 32);
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
		
		
		JButton iniciasesionButton = new JButton("Inicia sesión si tienes cuenta");
		iniciasesionButton.setOpaque(false);
		iniciasesionButton.setForeground(Color.WHITE);
		iniciasesionButton.setFont(new Font("Verdana", Font.BOLD, 15));
		iniciasesionButton.setContentAreaFilled(false);
		iniciasesionButton.setBorderPainted(false);
		iniciasesionButton.setBackground(Color.BLACK);
		iniciasesionButton.setBounds(285, 453, 295, 21);
		contentPane.add(iniciasesionButton);
		iniciasesionButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                iniciasesionButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                iniciasesionButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		iniciasesionButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	proyectito nuevoFrame = new proyectito(); // Instancia la nueva ventana
	            nuevoFrame.setVisible(true); // La muestra en pantalla
	            dispose(); // Cierra el JFrame actual
		    }});
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.BOLD, 15));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(128, 128, 128));
		passwordField.setBounds(328, 204, 246, 32);
		contentPane.add(passwordField);
		

		
		
		JComboBox generoBox = new JComboBox();
		generoBox.setForeground(new Color(255, 255, 255));
		generoBox.setBackground(new Color(128, 128, 128));
		generoBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		generoBox.setFont(new Font("Verdana", Font.BOLD, 15));
		generoBox.setBounds(263, 359, 173, 35);
		contentPane.add(generoBox);
		
		
		userField = new JTextField();
		userField.setFont(new Font("Verdana", Font.BOLD, 15));
		userField.setForeground(new Color(255, 255, 255));
		userField.setBackground(new Color(128, 128, 128));
		userField.setBounds(328, 54, 245, 32);
		contentPane.add(userField);
		userField.setColumns(10);
		
		nombreField = new JTextField();
		nombreField.setFont(new Font("Verdana", Font.BOLD, 15));
		nombreField.setForeground(new Color(255, 255, 255));
		nombreField.setBackground(new Color(128, 128, 128));
		nombreField.setColumns(10);
		nombreField.setBounds(327, 104, 245, 32);
		contentPane.add(nombreField);
		
		apellidoField = new JTextField();
		apellidoField.setFont(new Font("Verdana", Font.BOLD, 15));
		apellidoField.setForeground(new Color(255, 255, 255));
		apellidoField.setBackground(new Color(128, 128, 128));
		apellidoField.setColumns(10);
		apellidoField.setBounds(328, 152, 246, 32);
		contentPane.add(apellidoField);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Verdana", Font.BOLD, 15));
		emailField.setForeground(new Color(255, 255, 255));
		emailField.setBackground(new Color(128, 128, 128));
		emailField.setColumns(10);
		emailField.setBounds(328, 255, 245, 32);
		contentPane.add(emailField);
		
		JLabel userLabel = new JLabel("Usuario:");
		userLabel.setForeground(new Color(255, 255, 255));
		userLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		userLabel.setBounds(217, 62, 86, 14);
		contentPane.add(userLabel);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setForeground(new Color(255, 255, 255));
		nombreLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		nombreLabel.setBounds(217, 112, 74, 14);
		contentPane.add(nombreLabel);
		
		JLabel apellidoLabel = new JLabel("Apellidos:");
		apellidoLabel.setForeground(new Color(255, 255, 255));
		apellidoLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		apellidoLabel.setBounds(205, 160, 86, 14);
		contentPane.add(apellidoLabel);
		
		JLabel contraLabel = new JLabel("Contraseña:");
		contraLabel.setForeground(new Color(255, 255, 255));
		contraLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		contraLabel.setBounds(186, 212, 105, 14);
		contentPane.add(contraLabel);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setForeground(new Color(255, 255, 255));
		emailLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		emailLabel.setBounds(237, 263, 55, 14);
		contentPane.add(emailLabel);
		
		JComboBox paisBox = new JComboBox();
		paisBox.setForeground(new Color(255, 255, 255));
		paisBox.setBackground(new Color(128, 128, 128));
		paisBox.setToolTipText("");
		paisBox.setFont(new Font("Verdana", Font.BOLD, 15));
		paisBox.setModel(new DefaultComboBoxModel(new String[] {"Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Palestina (como Estado Observador Permanente)", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"}));
		paisBox.setBounds(525, 359, 173, 35);
		contentPane.add(paisBox);
		
		JLabel paisLabel = new JLabel("País:");
		paisLabel.setForeground(new Color(255, 255, 255));
		paisLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		paisLabel.setBounds(473, 369, 42, 14);
		contentPane.add(paisLabel);
		
		JLabel generoLabel = new JLabel("Género:");
		generoLabel.setForeground(new Color(255, 255, 255));
		generoLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		generoLabel.setBounds(186, 369, 68, 14);
		contentPane.add(generoLabel);
		
		JButton registrarButton = new JButton("Registrarse ");
		registrarButton.setBackground(new Color(128, 128, 128));
		registrarButton.setFont(new Font("Verdana", Font.BOLD, 15));
		registrarButton.setBounds(353, 409, 144, 34);
		contentPane.add(registrarButton);
		registrarButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                registrarButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                registrarButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                registrarUsuario(generoBox, paisBox);
            }
        });


		
		JLabel TituloLabel = new JLabel("Registro de Usuario");
		TituloLabel.setForeground(new Color(255, 255, 255));
		TituloLabel.setBackground(new Color(255, 255, 255));
		TituloLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		TituloLabel.setBounds(307, 0, 240, 44);
		contentPane.add(TituloLabel);
		
		JLabel fondoLabel = new JLabel("");
		fondoLabel.setIcon(new ImageIcon(registrojuego.class.getResource("/imagenes/fondo.png")));
		fondoLabel.setBounds(0, 0, 806, 495);
		contentPane.add(fondoLabel);
	}
	
	/**
	 * Registra un nuevo usuario en la base de datos y maneja la interfaz gráfica.
	 * 
	 * @param generoBox JComboBox que contiene la selección de género del usuario.
	 * @param paisBox JComboBox que contiene la selección de país del usuario.
	 */
	public void registrarUsuario(JComboBox generoBox, JComboBox paisBox) {
	    // Obtiene los valores ingresados por el usuario en los campos de texto.
	    String usuario = userField.getText();
	    String apellido = apellidoField.getText();
	    String contraseña = new String(passwordField.getPassword()); // Captura la contraseña del campo 'passwordField'.
	    String email = emailField.getText();
	    String pais = (String) paisBox.getSelectedItem(); // Obtiene el país seleccionado en el JComboBox.
	    String genero = (String) generoBox.getSelectedItem(); // Obtiene el género seleccionado en el JComboBox.
	    String nombre = nombreField.getText();
	    String pin = pinField.getText();

	    // Validación: Verifica que los campos obligatorios no estén vacíos.
	    if (usuario.isEmpty() || apellido.isEmpty() || contraseña.isEmpty() || email.isEmpty() || nombre.isEmpty()) { 
	        JOptionPane.showMessageDialog(null, "⚠️ Todos los campos obligatorios deben estar llenos.");
	        return; // Se detiene la ejecución si falta información.
	    }

	    // Validación del formato del correo electrónico: debe contener '@' y '.'.
	    if (!email.contains("@") || !email.contains(".")) { 
	        JOptionPane.showMessageDialog(null, "❌ El correo electrónico no cumple con el formato", "Error", JOptionPane.WARNING_MESSAGE);
	        email = null; // Invalida el email si el formato es incorrecto.
	    }

	    // Intenta registrar el usuario en la base de datos.
	    if (registrarUsuario(usuario, apellido, contraseña, email, pais, genero, nombre, pin)) { 
	        JOptionPane.showMessageDialog(null, "✅ Usuario registrado exitosamente."); // Mensaje de éxito.

	        // Instancia una nueva ventana 'proyectito' después de registrar el usuario.
	        proyectito nuevoFrame = new proyectito(); 
	        nuevoFrame.setVisible(true); // Muestra la ventana.

	        dispose(); // Cierra la ventana de registro actual.
	    } else { 
	        // Mensaje de error si la inserción en la base de datos falla.
	        JOptionPane.showMessageDialog(null, "❌ Error al registrar usuario."); 
	    }
	}

	/**
	 * Realiza la inserción de un nuevo usuario en la base de datos.
	 * 
	 * @param usuario Nombre de usuario único.
	 * @param apellido Apellido del usuario.
	 * @param contraseña Contraseña del usuario. ⚠️ Se recomienda encriptarla con hashing para mayor seguridad.
	 * @param email Dirección de correo electrónico.
	 * @param pais País de origen del usuario.
	 * @param genero Género seleccionado del usuario.
	 * @param nombre Nombre completo del usuario.
	 * @param pin Código PIN de seguridad.
	 * @return {@code true} si la inserción fue exitosa, {@code false} si hubo un error o fallo en la conexión.
	 */
	public boolean registrarUsuario(String usuario, String apellido, String contraseña, String email, String pais, String genero, String nombre, String pin) {
	    // Establece la conexión con la base de datos usando 'ConexionDB'.
	    Connection conn = ConexionDB.conectar(); // Conectar con la base de datos.

	    // Si la conexión falla, se devuelve 'false', evitando que el registro continúe.
	    if (conn == null) return false;

	    try {
	        // Prepara la consulta SQL para insertar un nuevo usuario en la tabla 'usuarios'.
	        String sql = "INSERT INTO usuarios (username, apellido, password, email, pais, genero, nombre, pin) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	        PreparedStatement stmt = conn.prepareStatement(sql); // Crea un objeto 'PreparedStatement' para ejecutar la consulta.

	        // Asigna los valores ingresados por el usuario a la consulta SQL de manera segura.
	        stmt.setString(1, usuario); // Nombre de usuario.
	        stmt.setString(2, apellido); // Apellido del usuario.
	        stmt.setString(3, contraseña); // ⚠️ Se recomienda encriptar con hashing para mayor seguridad.
	        stmt.setString(4, email); // Correo electrónico.
	        stmt.setString(5, pais); // País de origen del usuario.
	        stmt.setString(6, genero); // Género del usuario.
	        stmt.setString(7, nombre); // Nombre completo del usuario.
	        stmt.setString(8, pin); // PIN de seguridad.

	        // Ejecuta la consulta y verifica si la inserción fue exitosa (si afectó alguna fila).
	        return stmt.executeUpdate() > 0; // Devuelve `true` si se insertó correctamente.

	    } catch (SQLException e) {
	        // Si ocurre un error, muestra un mensaje en la consola y devuelve 'false'.
	        System.out.println("❌ Error al registrar usuario.");
	        e.printStackTrace();
	        return false;
	    }
	}
}

