package proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class NintendoSwitch extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NintendoSwitch frame = new NintendoSwitch();
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
	public NintendoSwitch() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NintendoSwitch.class.getResource("/imagenes/ChatGPT.png")));
		setTitle("LionGame");
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton mariopartyButton = new JButton("Mario Party");
		mariopartyButton.setForeground(new Color(255, 255, 255));
		mariopartyButton.setFont(new Font("Verdana", Font.BOLD, 12));
		mariopartyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego8 PCventana = new Juego8();
				PCventana.setVisible(true);
				dispose();
			}
		});
		JButton mariowonderButton = new JButton("Mario Wonder");
		mariowonderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego9 PCventana = new Juego9();
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
		mariowonderButton.setForeground(new Color(255, 255, 255));
		mariowonderButton.setFont(new Font("Verdana", Font.BOLD, 12));
		mariowonderButton.setVerticalAlignment(SwingConstants.BOTTOM);
		mariowonderButton.setOpaque(false);
		mariowonderButton.setContentAreaFilled(false);
		mariowonderButton.setBorderPainted(false);
		mariowonderButton.setBounds(228, 10, 146, 268);
		contentPane.add(mariowonderButton);
		
		mariowonderButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                mariowonderButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                mariowonderButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		mariopartyButton.setVerticalAlignment(SwingConstants.BOTTOM);
		mariopartyButton.setBounds(30, 10, 152, 268);
		mariopartyButton.setOpaque(false);
		mariopartyButton.setContentAreaFilled(false);
		mariopartyButton.setBorderPainted(false);
		contentPane.add(mariopartyButton);
		
		mariopartyButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                mariopartyButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                mariopartyButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		
		JLabel mariopartyLabel = new JLabel("");
		mariopartyLabel.setIcon(new ImageIcon(NintendoSwitch.class.getResource("/imagenes/marioparty.png")));
		mariopartyLabel.setBounds(32, 10, 146, 243);
		contentPane.add(mariopartyLabel);
		
		JLabel mariowonderLabel = new JLabel("");
		mariowonderLabel.setIcon(new ImageIcon(NintendoSwitch.class.getResource("/imagenes/mariowonder.png")));
		mariowonderLabel.setBounds(228, 10, 146, 243);
		contentPane.add(mariowonderLabel);
		
		JLabel fc25Label = new JLabel("");
		fc25Label.setIcon(new ImageIcon(NintendoSwitch.class.getResource("/imagenes/fc25.jpg")));
		fc25Label.setBounds(424, 10, 146, 243);
		contentPane.add(fc25Label);
		
		JLabel basquetLabel = new JLabel("");
		basquetLabel.setIcon(new ImageIcon(NintendoSwitch.class.getResource("/imagenes/nba25.jpg")));
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
		fondoLabel.setIcon(new ImageIcon(NintendoSwitch.class.getResource("/imagenes/fondo.png")));
		fondoLabel.setBounds(0, 0, 806, 495);
		contentPane.add(fondoLabel);
	}
}
