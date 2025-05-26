package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class entrada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entrada frame = new entrada("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public entrada(String usuario) {
		setTitle("LionGame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alfonso\\Downloads\\ChatGPT Image 21 may 2025, 09_47_302.png"));
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setToolTipText("1- Monster Hunter Wilds\r\n2- EA Sports FC 25\r\n3- Black Myth: Wukong\r\n4- Assassin’s Creed Shadows \r\n5- The Elder Scrolls IV: Oblivion Remastered\r\n6- NBA 2K25\r\n7- Call of Duty: Black Ops 6 \r\n8- Super Mario Party Jamboree \r\n9- Super Mario Bros. Wonder\r\n10- Grand Theft Auto V ");
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton playButton = new JButton("PS5");
		playButton.setForeground(new Color(255, 255, 255));
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayStation playStationVentana = new PlayStation();
		        playStationVentana.setVisible(true);
		        dispose();
			}
		});		
		
		playButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                playButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                playButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		
		JButton borrarButton = new JButton("Borrar cuenta");
		borrarButton.addActionListener(e -> {
		    String usuarioEliminar = JOptionPane.showInputDialog("🗑 Ingrese el usuario a eliminar:");
		    String contraseñaEliminar = JOptionPane.showInputDialog("🔑 Ingrese la contraseña:");

		    if (usuarioEliminar != null && contraseñaEliminar != null) {
		        eliminarUsuario(usuarioEliminar, contraseñaEliminar);
		    } else {
		        JOptionPane.showMessageDialog(null, "⚠️ Cancelado.");
		    }
		});
		
		JLabel usuariosLabel = new JLabel("Usuarios registrados");
		usuariosLabel.setForeground(new Color(255, 255, 255));
		usuariosLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		usuariosLabel.setBounds(276, 21, 317, 27);
		contentPane.add(usuariosLabel);
		mostrarCantidadUsuarios(usuariosLabel);


		borrarButton.setForeground(Color.WHITE);
		borrarButton.setFont(new Font("Verdana", Font.BOLD, 15));
		borrarButton.setBackground(Color.GRAY);
		borrarButton.setBounds(618, 16, 178, 40);
		contentPane.add(borrarButton);
		
		JLabel logoLabel = new JLabel("New label");
		logoLabel.setIcon(new ImageIcon(entrada.class.getResource("/imagenes/ChatGPT.png")));
		logoLabel.setBounds(10, 16, 75, 68);
		contentPane.add(logoLabel);
		
		JButton disparosButton = new JButton("Disparos");
		disparosButton.setForeground(Color.WHITE);
		disparosButton.setFont(new Font("Verdana", Font.BOLD, 15));
		disparosButton.setBackground(Color.GRAY);
		disparosButton.setBounds(148, 421, 118, 40);
		contentPane.add(disparosButton);
		
		JButton puzzleButton = new JButton("Puzzle");
		puzzleButton.setForeground(Color.WHITE);
		puzzleButton.setFont(new Font("Verdana", Font.BOLD, 15));
		puzzleButton.setBackground(Color.GRAY);
		puzzleButton.setBounds(148, 327, 118, 40);
		contentPane.add(puzzleButton);
		
		JButton deporteButton = new JButton("Deporte");
		deporteButton.setForeground(Color.WHITE);
		deporteButton.setFont(new Font("Verdana", Font.BOLD, 15));
		deporteButton.setBackground(Color.GRAY);
		deporteButton.setBounds(148, 233, 118, 40);
		contentPane.add(deporteButton);
		
		JButton aventuraButton = new JButton("Aventura");
		aventuraButton.setForeground(Color.WHITE);
		aventuraButton.setFont(new Font("Verdana", Font.BOLD, 15));
		aventuraButton.setBackground(Color.GRAY);
		aventuraButton.setBounds(148, 138, 118, 40);
		contentPane.add(aventuraButton);
		
		JLabel categoriasLabel = new JLabel("Categorias");
		categoriasLabel.setForeground(Color.WHITE);
		categoriasLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		categoriasLabel.setBounds(153, 83, 129, 44);
		contentPane.add(categoriasLabel);
		playButton.setBounds(10, 327, 118, 40);
		playButton.setBackground(new Color(128, 128, 128));
		playButton.setFont(new Font("Verdana", Font.BOLD, 15));
		contentPane.add(playButton);
		
		JButton xboxButton = new JButton("Xbox");
		xboxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Xbox Xboxventana = new Xbox();
				Xboxventana.setVisible(true);
				dispose();
			}
		});
		xboxButton.setBounds(10, 233, 118, 41);
		xboxButton.setBackground(new Color(128, 128, 128));
		xboxButton.setForeground(new Color(255, 255, 255));
		xboxButton.setFont(new Font("Verdana", Font.BOLD, 15));
		contentPane.add(xboxButton);
		
		xboxButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                xboxButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                xboxButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		JButton pcButton = new JButton("PC");
		pcButton.setForeground(new Color(255, 255, 255));
		pcButton.setBounds(10, 138, 118, 40);
		pcButton.setBackground(new Color(128, 128, 128));
		pcButton.setFont(new Font("Verdana", Font.BOLD, 15));
		pcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PC PCventana = new PC();
				PCventana.setVisible(true);
				dispose();
			}
		});
		pcButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                pcButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                pcButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		contentPane.add(pcButton);
		
		JButton switchButton = new JButton("Switch");
		switchButton.setForeground(new Color(255, 255, 255));
		switchButton.setBounds(10, 421, 118, 41);
		switchButton.setBackground(new Color(128, 128, 128));
		switchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NintendoSwitch NintendoSwitchventana = new NintendoSwitch();
				NintendoSwitchventana.setVisible(true);
				dispose();
			}
		});
		switchButton.setFont(new Font("Verdana", Font.BOLD, 15));
		contentPane.add(switchButton);
		
		switchButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                switchButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                switchButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		
		JLabel bienvenidaLabel = new JLabel("Bienvenido de nuevo " + usuario);
		bienvenidaLabel.setForeground(new Color(255, 255, 255));
		bienvenidaLabel.setBounds(88, 50, 536, 44);
		bienvenidaLabel.setFont(new Font("Verdana", Font.BOLD, 22));
		contentPane.add(bienvenidaLabel);
		
		JLabel plataformasLabel = new JLabel("Plataformas");
		plataformasLabel.setForeground(new Color(255, 255, 255));
		plataformasLabel.setBounds(9, 83, 129, 44);
		plataformasLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		contentPane.add(plataformasLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(372, 76, 3, 411);
		contentPane.add(separator_1);
		
		JLabel topLabel = new JLabel("Top 10 Ventas ");
		topLabel.setForeground(new Color(255, 255, 255));
		topLabel.setBounds(579, 92, 189, 44);
		topLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		contentPane.add(topLabel);
		
		JPanel cuadroPanel = new JPanel();
		cuadroPanel.setBounds(516, 138, 317, 324);
		cuadroPanel.setBackground(new Color(128, 128, 128));
		cuadroPanel.setToolTipText("");
		contentPane.add(cuadroPanel);
		cuadroPanel.setLayout(null);
		
		JLabel monsterLabel = new JLabel("1. Monster Hunter Wilds \r\n");
		monsterLabel.setForeground(new Color(255, 255, 255));
		monsterLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego1 a=new Juego1();
				a.setVisible(true);
			}
		});
		monsterLabel.setBounds(10, 10, 326, 21);
		monsterLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(monsterLabel);
		
		JLabel bo6Label = new JLabel("7. Call of Duty Black Ops 6 ");
		bo6Label.setForeground(new Color(255, 255, 255));
		bo6Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego7 a= new Juego7();
				a.setVisible(true);
			}
		});
		bo6Label.setBounds(10, 196, 326, 21);
		bo6Label.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(bo6Label);
		
		JLabel nbaLabel = new JLabel("6. NBA 2K25");
		nbaLabel.setForeground(new Color(255, 255, 255));
		nbaLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego6 a= new Juego6();
				a.setVisible(true);
			}
		});
		nbaLabel.setBounds(10, 165, 309, 21);
		nbaLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(nbaLabel);
		
		JLabel partyLabel = new JLabel("8. Mario Party Jamboree ");
		partyLabel.setForeground(new Color(255, 255, 255));
		partyLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego8 a= new Juego8();
				a.setVisible(true);
			}
		});
		partyLabel.setBounds(10, 227, 326, 21);
		partyLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(partyLabel);
		
		JLabel wonderLabel = new JLabel("9. Mario Bros Wonder ");
		wonderLabel.setForeground(new Color(255, 255, 255));
		wonderLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego9 a= new Juego9();
				a.setVisible(true);
			}
		});
		wonderLabel.setBounds(10, 258, 309, 21);
		wonderLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(wonderLabel);
		
		JLabel fc25Label = new JLabel("2. EA Sports FC 25");
		fc25Label.setBackground(new Color(240, 240, 240));
		fc25Label.setForeground(new Color(255, 255, 255));
		fc25Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego2 a=new Juego2();
				a.setVisible(true);
			}
		});
		fc25Label.setBounds(10, 41, 257, 21);
		fc25Label.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(fc25Label);
		
		JLabel wukongLabel = new JLabel("3. Black Myth: Wukong ");
		wukongLabel.setForeground(new Color(255, 255, 255));
		wukongLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego3 a= new Juego3();
				a.setVisible(true);
			}
		});
		wukongLabel.setBounds(10, 72, 332, 21);
		wukongLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(wukongLabel);
		
		JLabel asassinsLabel = new JLabel("4. Assassin’s Creed Shadows ");
		asassinsLabel.setForeground(new Color(255, 255, 255));
		asassinsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego4 a= new Juego4();
				a.setVisible(true);
			}
		});
		asassinsLabel.setBounds(10, 103, 347, 21);
		asassinsLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(asassinsLabel);
		
		JLabel gtaLabel = new JLabel("10. Grand Theft Auto V");
		gtaLabel.setForeground(new Color(255, 255, 255));
		gtaLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego10 a= new Juego10();
				a.setVisible(true);
			}
		});
		gtaLabel.setBounds(10, 289, 263, 21);
		gtaLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(gtaLabel);
		
		JLabel elderLabel = new JLabel("5. The Elder Scrolls IV");
		elderLabel.setForeground(new Color(255, 255, 255));
		elderLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego5 a= new Juego5();
				a.setVisible(true);
			}
		});
		elderLabel.setBounds(10, 134, 309, 21);
		elderLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		cuadroPanel.add(elderLabel);
		
		JLabel tituloLabel = new JLabel("LionGame");
		tituloLabel.setForeground(new Color(255, 255, 0));
		tituloLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		tituloLabel.setBounds(88, 10, 178, 44);
		contentPane.add(tituloLabel);
		
		JLabel fondoLabel = new JLabel("");
		fondoLabel.setIcon(new ImageIcon(entrada.class.getResource("/imagenes/fondo.png")));
		fondoLabel.setBounds(0, 0, 806, 495);
		contentPane.add(fondoLabel);
	}
	
	
	public void eliminarUsuario(String usuario, String contraseña) {
	    Connection conn = ConexionDB.conectar();
	    if (conn == null) {
	        JOptionPane.showMessageDialog(null, "❌ Error al conectar con la base de datos.");
	        return;
	    }

	    try {
	        // Verificar si el usuario y la contraseña coinciden
	        String sqlCheck = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
	        PreparedStatement stmtCheck = conn.prepareStatement(sqlCheck);
	        stmtCheck.setString(1, usuario);
	        stmtCheck.setString(2, contraseña);
	        ResultSet rs = stmtCheck.executeQuery();

	        if (rs.next()) {
	            // Si coincide, eliminar el usuario
	            String sqlDelete = "DELETE FROM usuarios WHERE username = ?";
	            PreparedStatement stmtDelete = conn.prepareStatement(sqlDelete);
	            stmtDelete.setString(1, usuario);
	            stmtDelete.executeUpdate();

	            JOptionPane.showMessageDialog(null, "✅ Usuario eliminado correctamente.");
	            proyectito nuevoFrame = new proyectito(); // Instancia la nueva ventana
	            nuevoFrame.setVisible(true); // La muestra en pantalla
	            dispose();
	        } else {
	            JOptionPane.showMessageDialog(null, "❌ Usuario o contraseña incorrectos.");
	        }

	        conn.close();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}
	public void mostrarCantidadUsuarios(JLabel labelUsuarios) {
	    Connection conn = ConexionDB.conectar();
	    if (conn == null) {
	        labelUsuarios.setText("❌ Error al conectar con la base de datos.");
	        return;
	    }

	    try {
	        String sql = "SELECT contar_usuarios() AS total";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();

	        if (rs.next()) {
	            int totalUsuarios = rs.getInt("total");
	            labelUsuarios.setText("👥 Usuarios registrados: " + totalUsuarios);
	        } else {
	            labelUsuarios.setText("No hay usuarios registrados.");
	        }

	        conn.close();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}
}