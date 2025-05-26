package proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Toolkit;

public class PlayStation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayStation frame = new PlayStation();
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
	public PlayStation() {
		setTitle("LionGame");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PlayStation.class.getResource("/imagenes/ChatGPT.png")));
		
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton monsterButton = new JButton("Monster Hunter");
		monsterButton.setForeground(new Color(255, 255, 255));
		monsterButton.setFont(new Font("Verdana", Font.BOLD, 12));
		monsterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego1 PCventana = new Juego1();
				PCventana.setVisible(true);
				dispose();
			}
		});
		
		JButton bo6Button = new JButton("Black Ops 6");
		bo6Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego7 PCventana = new Juego7();
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
		
		
		JButton wukongButton = new JButton("Wukong");
		wukongButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego3 PCventana = new Juego3();
				PCventana.setVisible(true);
				dispose();
			}
		});
		wukongButton.setForeground(new Color(255, 255, 255));
		wukongButton.setFont(new Font("Verdana", Font.BOLD, 12));
		wukongButton.setVerticalAlignment(SwingConstants.BOTTOM);
		wukongButton.setOpaque(false);
		wukongButton.setContentAreaFilled(false);
		wukongButton.setBorderPainted(false);
		wukongButton.setBounds(623, 10, 146, 268);
		contentPane.add(wukongButton);
		
		wukongButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                wukongButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                wukongButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
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
		bo6Button.setForeground(new Color(255, 255, 255));
		bo6Button.setFont(new Font("Verdana", Font.BOLD, 12));
		bo6Button.setVerticalAlignment(SwingConstants.BOTTOM);
		bo6Button.setOpaque(false);
		bo6Button.setContentAreaFilled(false);
		bo6Button.setBorderPainted(false);
		bo6Button.setBounds(228, 10, 146, 268);
		contentPane.add(bo6Button);
		
		bo6Button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bo6Button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                bo6Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		monsterButton.setVerticalAlignment(SwingConstants.BOTTOM);
		monsterButton.setBounds(30, 10, 152, 268);
		monsterButton.setOpaque(false);
		monsterButton.setContentAreaFilled(false);
		monsterButton.setBorderPainted(false);
		contentPane.add(monsterButton);
		
		monsterButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                monsterButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                monsterButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		
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
		
		JLabel mariopartyLabel = new JLabel("");
		mariopartyLabel.setIcon(new ImageIcon(PlayStation.class.getResource("/imagenes/monster.jpg")));
		mariopartyLabel.setBounds(32, 10, 146, 243);
		contentPane.add(mariopartyLabel);
		
		JLabel mariowonderLabel = new JLabel("");
		mariowonderLabel.setIcon(new ImageIcon(PlayStation.class.getResource("/imagenes/bo6ps5.jpg")));
		mariowonderLabel.setBounds(228, 10, 146, 243);
		contentPane.add(mariowonderLabel);
		
		JLabel fc25Label = new JLabel("");
		fc25Label.setIcon(new ImageIcon(PlayStation.class.getResource("/imagenes/fc25ps5.jpg")));
		fc25Label.setBounds(424, 10, 146, 243);
		contentPane.add(fc25Label);
		
		JLabel basquetLabel = new JLabel("");
		basquetLabel.setIcon(new ImageIcon(PlayStation.class.getResource("/imagenes/wukongps5.jpg")));
		basquetLabel.setBounds(623, 10, 146, 243);
		contentPane.add(basquetLabel);
		
		
		JLabel fondoLabel = new JLabel("");
		fondoLabel.setIcon(new ImageIcon(PlayStation.class.getResource("/imagenes/fondo.png")));
		fondoLabel.setBounds(0, 0, 806, 495);
		contentPane.add(fondoLabel);
		
		
		
		
		
	}

}
