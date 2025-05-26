package proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class PC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PC frame = new PC();
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
	public PC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PC.class.getResource("/imagenes/ChatGPT.png")));
		setTitle("LionGame");
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton gtavButton = new JButton("GTA V");
		gtavButton.setForeground(new Color(255, 255, 255));
		gtavButton.setFont(new Font("Verdana", Font.BOLD, 12));
		gtavButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego10 PCventana = new Juego10();
				PCventana.setVisible(true);
				dispose();
			}
		});
		
		JButton assasinsButton = new JButton("Assasins Creed");
		assasinsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego4 PCventana = new Juego4();
				PCventana.setVisible(true);
				dispose();
			}
		});
		
		JButton fc25Button = new JButton("FC 25");
		fc25Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego2 PCventana = new Juego2();
				PCventana.setVisible(true);
				dispose();
			}
		});
		
		JButton basquetButton = new JButton("2K 25");
		basquetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego6 PCventana = new Juego6();
				PCventana.setVisible(true);
				dispose();
			}
		});
		basquetButton.setForeground(new Color(255, 255, 255));
		basquetButton.setFont(new Font("Verdana", Font.BOLD, 12));
		basquetButton.setVerticalAlignment(SwingConstants.BOTTOM);
		basquetButton.setOpaque(false);
		basquetButton.setContentAreaFilled(false);
		basquetButton.setBorderPainted(false);
		basquetButton.setBounds(623, 10, 146, 268);
		contentPane.add(basquetButton);
		
		basquetButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                basquetButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                basquetButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		fc25Button.setFont(new Font("Verdana", Font.BOLD, 12));
		fc25Button.setForeground(new Color(255, 255, 255));
		fc25Button.setFont(new Font("Verdana", Font.BOLD, 12));
		fc25Button.setVerticalAlignment(SwingConstants.BOTTOM);
		fc25Button.setOpaque(false);
		fc25Button.setContentAreaFilled(false);
		fc25Button.setBorderPainted(false);
		fc25Button.setBounds(424, 10, 146, 268);
		contentPane.add(fc25Button);
		
		fc25Button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                fc25Button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                fc25Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		assasinsButton.setForeground(new Color(255, 255, 255));
		assasinsButton.setFont(new Font("Verdana", Font.BOLD, 12));
		assasinsButton.setVerticalAlignment(SwingConstants.BOTTOM);
		assasinsButton.setOpaque(false);
		assasinsButton.setContentAreaFilled(false);
		assasinsButton.setBorderPainted(false);
		assasinsButton.setBounds(228, 10, 146, 268);
		contentPane.add(assasinsButton);
		
		assasinsButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                assasinsButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                assasinsButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		gtavButton.setVerticalAlignment(SwingConstants.BOTTOM);
		gtavButton.setBounds(30, 10, 152, 268);
		gtavButton.setOpaque(false);
		gtavButton.setContentAreaFilled(false);
		gtavButton.setBorderPainted(false);
		contentPane.add(gtavButton);
		
		gtavButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                gtavButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                gtavButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		
		JLabel gtavLabel = new JLabel("");
		gtavLabel.setIcon(new ImageIcon(PC.class.getResource("/imagenes/gtav.jpg")));
		gtavLabel.setBounds(32, 10, 146, 243);
		contentPane.add(gtavLabel);
		
		JLabel mariowonderLabel = new JLabel("");
		mariowonderLabel.setIcon(new ImageIcon(PC.class.getResource("/imagenes/assasinscri.jpg")));
		mariowonderLabel.setBounds(228, 10, 146, 243);
		contentPane.add(mariowonderLabel);
		
		JLabel fc25Label = new JLabel("");
		fc25Label.setIcon(new ImageIcon(PC.class.getResource("/imagenes/fc25pc.jpg")));
		fc25Label.setBounds(424, 10, 146, 243);
		contentPane.add(fc25Label);
		
		JLabel basquetLabel = new JLabel("");
		basquetLabel.setIcon(new ImageIcon(PC.class.getResource("/imagenes/2k25pc.jpg")));
		basquetLabel.setBounds(623, 10, 146, 243);
		contentPane.add(basquetLabel);
		
		JButton volverButton = new JButton("Volver");
		volverButton.setForeground(new Color(255, 255, 255));
		volverButton.setBackground(new Color(128, 128, 128));
		volverButton.setFont(new Font("Verdana", Font.BOLD, 15));
		volverButton.setBounds(656, 423, 127, 51);
		contentPane.add(volverButton);
		
		volverButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	entrada nuevoFrame = new entrada(""); // Instancia la nueva ventana
	            nuevoFrame.setVisible(true); // La muestra en pantalla
	            dispose(); // Cierra el JFrame actual
		    }});
		volverButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                volverButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                volverButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		JLabel fondoLabel = new JLabel("");
		fondoLabel.setIcon(new ImageIcon(PC.class.getResource("/imagenes/fondo.png")));
		fondoLabel.setBounds(0, 0, 806, 495);
		contentPane.add(fondoLabel);
	}

}
