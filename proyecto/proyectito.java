package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

public class proyectito extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					proyectito frame = new proyectito();
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
	public proyectito() {
		setTitle("LionGame");
		setResizable(false);
		setForeground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alfonso\\Downloads\\ChatGPT Image 21 may 2025, 09_47_302.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 52, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		// Agregar etiqueta para el GIF (inicialmente oculto)
		ImageIcon gifIcon = new ImageIcon("C:/Users/Alfonso/Downloads/carga.gif");
		JLabel gifLabel = new JLabel(new ImageIcon(proyectito.class.getResource("/imagenes/carga.gif")));
		gifLabel.setBounds(247, 106, 363, 268);
		gifLabel.setVisible(false); // No se muestra al inicio
		contentPane.add(gifLabel);
		
		JButton loginButton = new JButton("Iniciar sesión");
		loginButton.setForeground(new Color(255, 255, 255));
		loginButton.setIcon(null);
		loginButton.setBackground(new Color(128, 128, 128));
		loginButton.setFont(new Font("Verdana", Font.BOLD, 15));
		loginButton.setBounds(339, 293, 169, 44);
		loginButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                loginButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });

		loginButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String usuario = loginField.getText();
		        String contraseña = new String(passwordField.getPassword());
		        
		        if (usuario.isEmpty() || contraseña.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "❌ Debes llenar ambos campos antes de continuar", "Error", JOptionPane.WARNING_MESSAGE);
		            return; // Detener la ejecución si los campos están vacíos
		        }


		        gifLabel.setVisible(true); // Mostrar el GIF de carga

		        new Thread(() -> {
		            try {
		                Thread.sleep(3000); // Simular carga de datos
		            } catch (InterruptedException ex) {
		                ex.printStackTrace();
		            }

		            gifLabel.setVisible(false); // Ocultar el GIF después de la carga

		            if (iniciarSesion(usuario, contraseña)) {
		                usuarioLogueado = usuario;
		                JOptionPane.showMessageDialog(null, "✅ Inicio de sesión exitoso");
		                
		                entrada nuevoFrame = new entrada(usuarioLogueado);
		                nuevoFrame.setVisible(true); // Abrir nueva ventana

		                dispose(); // Cerrar `proyectito`
		            } else {
		                JOptionPane.showMessageDialog(null, "❌ Usuario o contraseña incorrectos.");
		            }
		        }).start();
		    }
		});
		contentPane.setLayout(null);
		
		JButton registracionButton = new JButton("Registrate si no tienes cuenta");
		registracionButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                registracionButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                registracionButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		registracionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton olvidarcontraButton = new JButton("¿Olvidaste tu contraseña?");
		olvidarcontraButton.setOpaque(false);
		olvidarcontraButton.setForeground(Color.WHITE);
		olvidarcontraButton.setFont(new Font("Verdana", Font.BOLD, 15));
		olvidarcontraButton.setContentAreaFilled(false);
		olvidarcontraButton.setBorderPainted(false);
		olvidarcontraButton.setBackground(Color.BLACK);
		olvidarcontraButton.setBounds(289, 425, 285, 21);
		contentPane.add(olvidarcontraButton);
		olvidarcontraButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                olvidarcontraButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                olvidarcontraButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		
		olvidarcontraButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	OlvidarContraseña nuevoFrame = new OlvidarContraseña(); // Instancia la nueva ventana
	            nuevoFrame.setVisible(true); // La muestra en pantalla
	            dispose(); // Cierra el JFrame actual
		    }});
		registracionButton.setForeground(new Color(255, 255, 255));
		registracionButton.setBackground(new Color(0, 0, 0));
		registracionButton.setFont(new Font("Verdana", Font.BOLD, 15));
		registracionButton.setBounds(273, 367, 318, 21);
		contentPane.add(registracionButton);
		contentPane.add(loginButton);
		registracionButton.setOpaque(false);
		registracionButton.setContentAreaFilled(false);
		registracionButton.setBorderPainted(false);
		registracionButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	registrojuego nuevoFrame = new registrojuego(); // Instancia la nueva ventana
	            nuevoFrame.setVisible(true); // La muestra en pantalla
	            dispose(); // Cierra el JFrame actual
		    }});
		
		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setForeground(new Color(255, 255, 255));
		usuarioLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		usuarioLabel.setBounds(188, 102, 102, 53);
		contentPane.add(usuarioLabel);
		
		JLabel ContrasenaLabel = new JLabel("Contraseña:");
		ContrasenaLabel.setForeground(new Color(255, 255, 255));
		ContrasenaLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		ContrasenaLabel.setBounds(153, 195, 128, 53);
		contentPane.add(ContrasenaLabel);
		
		loginField = new JTextField();
		loginField.setFont(new Font("SansSerif", Font.BOLD, 15));
		loginField.setForeground(new Color(255, 255, 255));
		loginField.setBackground(new Color(128, 128, 128));
		loginField.setBounds(300, 111, 260, 35);
		contentPane.add(loginField);
		loginField.setColumns(10);
		
		JLabel tituloLabel = new JLabel("Inicio de sesión");
		tituloLabel.setForeground(new Color(255, 255, 255));
		tituloLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		tituloLabel.setBounds(339, 21, 184, 53);
		contentPane.add(tituloLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.BOLD, 15));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(128, 128, 128));
		passwordField.setBounds(300, 206, 260, 35);
		contentPane.add(passwordField);
		
		JLabel fondoLabel = new JLabel("");
		fondoLabel.setIcon(new ImageIcon(proyectito.class.getResource("/imagenes/fondo.png")));
		fondoLabel.setBounds(0, 0, 816, 495);
		contentPane.add(fondoLabel);	
	}	
	private static String usuarioLogueado = "";
	
	
	public static boolean iniciarSesion(String usuario, String contraseña) {
	    // Establece conexión con la base de datos usando la clase ConexionDB.
	    Connection conn = ConexionDB.conectar(); 

	    // Si la conexión falla, devuelve 'false', indicando que el inicio de sesión no es posible.
	    if (conn == null) return false; 

	    try {
	        // Prepara la consulta SQL para buscar el usuario y su contraseña en la tabla 'usuarios'.
	        String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?"; 
	        PreparedStatement stmt = conn.prepareStatement(query); 

	        // Establece los valores ingresados por el usuario en la consulta SQL de manera segura.
	        stmt.setString(1, usuario); // Reemplaza el primer '?' por el nombre de usuario.
	        stmt.setString(2, contraseña); // Reemplaza el segundo '?' por la contraseña.

	        // Ejecuta la consulta en la base de datos y almacena el resultado.
	        ResultSet rs = stmt.executeQuery(); 

	        // Si la consulta encuentra un usuario que coincida, devuelve 'true', indicando éxito.
	        return rs.next(); 

	    } catch (Exception e) {
	        // Si ocurre un error durante la ejecución de la consulta, imprime el error en la consola.
	        e.printStackTrace(); 

	        // Devuelve 'false', indicando que el inicio de sesión falló por algún error.
	        return false; 
	    }
	}
	}