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

public class Xbox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Xbox frame = new Xbox();
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
	public Xbox() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xbox.class.getResource("/imagenes/ChatGPT.png")));
		setTitle("LionGame");
	
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel wukongLabel = new JLabel("");
		wukongLabel.setIcon(new ImageIcon(Xbox.class.getResource("/imagenes/wukong.jpg")));
		wukongLabel.setBounds(32, 10, 146, 243);
		contentPane.add(wukongLabel);
		
		JLabel bo6Label = new JLabel("");
		bo6Label.setIcon(new ImageIcon(Xbox.class.getResource("/imagenes/bo6.jpg")));
		bo6Label.setBounds(228, 10, 146, 243);
		contentPane.add(bo6Label);
		
		JLabel fc25Label = new JLabel("");
		fc25Label.setIcon(new ImageIcon(Xbox.class.getResource("/imagenes/fc25xbox.jpg")));
		fc25Label.setBounds(424, 10, 146, 243);
		contentPane.add(fc25Label);
		
		JLabel assasinsLabel = new JLabel("");
		assasinsLabel.setIcon(new ImageIcon(Xbox.class.getResource("/imagenes/assasinscrixbox.jpg")));
		assasinsLabel.setBounds(623, 10, 146, 243);
		contentPane.add(assasinsLabel);
		
		JButton wukongButton = new JButton("Wukong");
		wukongButton.setForeground(new Color(255, 255, 255));
		wukongButton.setFont(new Font("Verdana", Font.BOLD, 12));
		wukongButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego3 PCventana = new Juego3();
				PCventana.setVisible(true);
				dispose();
			}
		});
		wukongButton.setVerticalAlignment(SwingConstants.BOTTOM);
		wukongButton.setBounds(30, 10, 152, 268);
		wukongButton.setOpaque(false);
		wukongButton.setContentAreaFilled(false);
		wukongButton.setBorderPainted(false);
		contentPane.add(wukongButton);
		
		JButton bo6Button = new JButton("Black Ops 6");
		bo6Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego7 PCventana = new Juego7();
				PCventana.setVisible(true);
				dispose();
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
		
		JButton fc25Button = new JButton("FC 25");
		fc25Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego2 PCventana = new Juego2();
				PCventana.setVisible(true);
				dispose();
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
		
		JButton assasinsButton = new JButton("Assasins Creed");
		assasinsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego4 PCventana = new Juego4();
				PCventana.setVisible(true);
				dispose();
			}
		});
		assasinsButton.setForeground(new Color(255, 255, 255));
		assasinsButton.setFont(new Font("Verdana", Font.BOLD, 12));
		assasinsButton.setVerticalAlignment(SwingConstants.BOTTOM);
		assasinsButton.setOpaque(false);
		assasinsButton.setContentAreaFilled(false);
		assasinsButton.setBorderPainted(false);
		assasinsButton.setBounds(623, 10, 146, 268);
		contentPane.add(assasinsButton);
		
		
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
		fondoLabel.setIcon(new ImageIcon(Xbox.class.getResource("/imagenes/fondo.png")));
		fondoLabel.setBounds(0, 0, 806, 495);
		contentPane.add(fondoLabel);
	}

}
