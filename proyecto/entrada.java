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
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class entrada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public entrada(String usuario) {
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
		 
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(entrada.class.getResource("/imagenes/ChatGPT.png")));
		lblNewLabel_1.setBounds(10, 16, 75, 68);
		contentPane.add(lblNewLabel_1);
		
		JButton btnPc_5 = new JButton("Plataform");
		btnPc_5.setForeground(Color.WHITE);
		btnPc_5.setFont(new Font("Verdana", Font.BOLD, 15));
		btnPc_5.setBackground(Color.GRAY);
		btnPc_5.setBounds(148, 434, 118, 40);
		contentPane.add(btnPc_5);
		
		JButton btnPc_4 = new JButton("Disparos");
		btnPc_4.setForeground(Color.WHITE);
		btnPc_4.setFont(new Font("Verdana", Font.BOLD, 15));
		btnPc_4.setBackground(Color.GRAY);
		btnPc_4.setBounds(148, 361, 118, 40);
		contentPane.add(btnPc_4);
		
		JButton btnPc_3 = new JButton("Puzzle");
		btnPc_3.setForeground(Color.WHITE);
		btnPc_3.setFont(new Font("Verdana", Font.BOLD, 15));
		btnPc_3.setBackground(Color.GRAY);
		btnPc_3.setBounds(148, 287, 118, 40);
		contentPane.add(btnPc_3);
		
		JButton btnPc_2 = new JButton("Deporte");
		btnPc_2.setForeground(Color.WHITE);
		btnPc_2.setFont(new Font("Verdana", Font.BOLD, 15));
		btnPc_2.setBackground(Color.GRAY);
		btnPc_2.setBounds(148, 211, 118, 40);
		contentPane.add(btnPc_2);
		
		JButton aventura = new JButton("Aventura");
		aventura.setForeground(Color.WHITE);
		aventura.setFont(new Font("Verdana", Font.BOLD, 15));
		aventura.setBackground(Color.GRAY);
		aventura.setBounds(148, 138, 118, 40);
		contentPane.add(aventura);
		
		JLabel lblNuevaContrasea_1_1_2 = new JLabel("Categorias");
		lblNuevaContrasea_1_1_2.setForeground(Color.WHITE);
		lblNuevaContrasea_1_1_2.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNuevaContrasea_1_1_2.setBounds(153, 83, 129, 44);
		contentPane.add(lblNuevaContrasea_1_1_2);
		playButton.setBounds(10, 287, 118, 40);
		playButton.setBackground(new Color(128, 128, 128));
		playButton.setFont(new Font("Verdana", Font.BOLD, 15));
		contentPane.add(playButton);
		
		JButton xboxButton = new JButton("Xbox");
		xboxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Xbox Xboxventana = new Xbox();
				Xboxventana.setVisible(true);
			}
		});
		xboxButton.setBounds(10, 211, 118, 41);
		xboxButton.setBackground(new Color(128, 128, 128));
		xboxButton.setForeground(new Color(255, 255, 255));
		xboxButton.setFont(new Font("Verdana", Font.BOLD, 15));
		contentPane.add(xboxButton);
		
		
		JButton pcButton = new JButton("PC");
		pcButton.setForeground(new Color(255, 255, 255));
		pcButton.setBounds(10, 138, 118, 40);
		pcButton.setBackground(new Color(128, 128, 128));
		pcButton.setFont(new Font("Verdana", Font.BOLD, 15));
		pcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PC PCventana = new PC();
				PCventana.setVisible(true);
			}
		});
		contentPane.add(pcButton);
		
		JButton switchButton = new JButton("Switch");
		switchButton.setForeground(new Color(255, 255, 255));
		switchButton.setBounds(10, 361, 118, 41);
		switchButton.setBackground(new Color(128, 128, 128));
		switchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NintendoSwitch NintendoSwitchventana = new NintendoSwitch();
				NintendoSwitchventana.setVisible(true);
			}
		});
		switchButton.setFont(new Font("Verdana", Font.BOLD, 15));
		contentPane.add(switchButton);
		
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
		
		JButton rebajasButton = new JButton("Rebajas ");
		rebajasButton.setForeground(new Color(255, 255, 255));
		rebajasButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rebajas Rebajasventana = new Rebajas();
				Rebajasventana.setVisible(true); 
			}
		});
		rebajasButton.setBounds(10, 434, 118, 41);
		rebajasButton.setBackground(new Color(128, 128, 128));
		rebajasButton.setFont(new Font("Verdana", Font.BOLD, 15));
		contentPane.add(rebajasButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(372, 76, 3, 411);
		contentPane.add(separator_1);
		
		JLabel lblNuevaContrasea_1_1_1 = new JLabel("Top 10 Ventas ");
		lblNuevaContrasea_1_1_1.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1.setBounds(579, 92, 189, 44);
		lblNuevaContrasea_1_1_1.setFont(new Font("Verdana", Font.BOLD, 18));
		contentPane.add(lblNuevaContrasea_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(516, 138, 317, 324);
		panel.setBackground(new Color(128, 128, 128));
		panel.setToolTipText("");
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNuevaContrasea_1_1_1_3 = new JLabel("1. Monster Hunter Wilds \r\n");
		lblNuevaContrasea_1_1_1_3.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego1 a=new Juego1();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_3.setBounds(10, 10, 326, 21);
		lblNuevaContrasea_1_1_1_3.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_3);
		
		JLabel lblNuevaContrasea_1_1_1_4 = new JLabel("7. Call of Duty Black Ops 6 ");
		lblNuevaContrasea_1_1_1_4.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego7 a= new Juego7();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_4.setBounds(10, 196, 326, 21);
		lblNuevaContrasea_1_1_1_4.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_4);
		
		JLabel lblNuevaContrasea_1_1_1_5 = new JLabel("6. NBA 2K25");
		lblNuevaContrasea_1_1_1_5.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego6 a= new Juego6();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_5.setBounds(10, 165, 309, 21);
		lblNuevaContrasea_1_1_1_5.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_5);
		
		JLabel lblNuevaContrasea_1_1_1_6 = new JLabel("8. Mario Party Jamboree ");
		lblNuevaContrasea_1_1_1_6.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego8 a= new Juego8();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_6.setBounds(10, 227, 326, 21);
		lblNuevaContrasea_1_1_1_6.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_6);
		
		JLabel lblNuevaContrasea_1_1_1_7 = new JLabel("9. Mario Bros Wonder ");
		lblNuevaContrasea_1_1_1_7.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego9 a= new Juego9();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_7.setBounds(10, 258, 309, 21);
		lblNuevaContrasea_1_1_1_7.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_7);
		
		JLabel lblNuevaContrasea_1_1_1_8 = new JLabel("2. EA Sports FC 25");
		lblNuevaContrasea_1_1_1_8.setBackground(new Color(240, 240, 240));
		lblNuevaContrasea_1_1_1_8.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego2 a=new Juego2();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_8.setBounds(10, 41, 257, 21);
		lblNuevaContrasea_1_1_1_8.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_8);
		
		JLabel lblNuevaContrasea_1_1_1_9 = new JLabel("3. Black Myth: Wukong ");
		lblNuevaContrasea_1_1_1_9.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego3 a= new Juego3();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_9.setBounds(10, 72, 332, 21);
		lblNuevaContrasea_1_1_1_9.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_9);
		
		JLabel lblNuevaContrasea_1_1_1_10 = new JLabel("4. Assassin’s Creed Shadows ");
		lblNuevaContrasea_1_1_1_10.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego4 a= new Juego4();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_10.setBounds(10, 103, 347, 21);
		lblNuevaContrasea_1_1_1_10.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_10);
		
		JLabel lblNuevaContrasea_1_1_1_2 = new JLabel("10. Grand Theft Auto V");
		lblNuevaContrasea_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego10 a= new Juego10();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_2.setBounds(10, 289, 263, 21);
		lblNuevaContrasea_1_1_1_2.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_2);
		
		JLabel lblNuevaContrasea_1_1_1_1 = new JLabel("5. The Elder Scrolls IV");
		lblNuevaContrasea_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNuevaContrasea_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego5 a= new Juego5();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_1.setBounds(10, 134, 309, 21);
		lblNuevaContrasea_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblNuevaContrasea_1_1_1_1);
		
		JLabel tituloLabel = new JLabel("LionGame");
		tituloLabel.setForeground(new Color(255, 255, 0));
		tituloLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		tituloLabel.setBounds(88, 10, 178, 44);
		contentPane.add(tituloLabel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(entrada.class.getResource("/imagenes/fondo.png")));
		lblNewLabel.setBounds(0, 0, 806, 495);
		contentPane.add(lblNewLabel);
	}
}
