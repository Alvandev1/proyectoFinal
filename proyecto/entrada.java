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
					entrada frame = new entrada();
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
	public entrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 627);
		contentPane = new JPanel();
		contentPane.setToolTipText("1- Monster Hunter Wilds\r\n2- EA Sports FC 25\r\n3- Black Myth: Wukong\r\n4- Assassin’s Creed Shadows \r\n5- The Elder Scrolls IV: Oblivion Remastered\r\n6- NBA 2K25\r\n7- Call of Duty: Black Ops 6 \r\n8- Super Mario Party Jamboree \r\n9- Super Mario Bros. Wonder\r\n10- Grand Theft Auto V ");
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("PlayStation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayStation playStationVentana = new PlayStation();
		        playStationVentana.setVisible(true);
		 
			}
		});
		btnNewButton.setBounds(35, 138, 134, 105);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD));
		contentPane.add(btnNewButton);
		
		JButton btnXbox = new JButton("Xbox");
		btnXbox.setBounds(215, 138, 134, 105);
		btnXbox.setBackground(Color.LIGHT_GRAY);
		btnXbox.setForeground(Color.BLACK);
		btnXbox.setFont(btnXbox.getFont().deriveFont(btnXbox.getFont().getStyle() | Font.BOLD));
		contentPane.add(btnXbox);
		
		JButton btnPc = new JButton("PC");
		btnPc.setBounds(35, 254, 134, 105);
		btnPc.setBackground(Color.LIGHT_GRAY);
		btnPc.setFont(btnPc.getFont().deriveFont(btnPc.getFont().getStyle() | Font.BOLD));
		btnPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnPc);
		
		JButton btnNintendoSwitch = new JButton("Nintendo Switch");
		btnNintendoSwitch.setBounds(215, 254, 134, 105);
		btnNintendoSwitch.setBackground(Color.LIGHT_GRAY);
		btnNintendoSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNintendoSwitch.setFont(btnNintendoSwitch.getFont().deriveFont(btnNintendoSwitch.getFont().getStyle() | Font.BOLD));
		contentPane.add(btnNintendoSwitch);
		
		JLabel lblNuevaContrasea_1 = new JLabel("Bienvenido a JuegoLant ");
		lblNuevaContrasea_1.setBounds(233, 21, 399, 44);
		lblNuevaContrasea_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		contentPane.add(lblNuevaContrasea_1);
		
		JLabel lblNuevaContrasea_1_1 = new JLabel("Categoria ");
		lblNuevaContrasea_1_1.setBounds(157, 91, 150, 44);
		lblNuevaContrasea_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		contentPane.add(lblNuevaContrasea_1_1);
		
		JButton btnRebajas = new JButton("Rebajas ");
		btnRebajas.setBounds(129, 370, 134, 105);
		btnRebajas.setBackground(Color.LIGHT_GRAY);
		btnRebajas.setFont(btnRebajas.getFont().deriveFont(btnRebajas.getFont().getStyle() | Font.BOLD));
		contentPane.add(btnRebajas);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(372, 76, 3, 411);
		contentPane.add(separator_1);
		
		JLabel lblNuevaContrasea_1_1_1 = new JLabel("Top 10 Ventas ");
		lblNuevaContrasea_1_1_1.setBounds(630, 91, 150, 44);
		lblNuevaContrasea_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		contentPane.add(lblNuevaContrasea_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(529, 141, 344, 334);
		panel.setBackground(new Color(192, 192, 192));
		panel.setToolTipText("");
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNuevaContrasea_1_1_1_3 = new JLabel("1- Monster Hunter Wilds \r\n");
		lblNuevaContrasea_1_1_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego1 a=new Juego1();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_3.setBounds(25, 5, 170, 21);
		lblNuevaContrasea_1_1_1_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_3);
		
		JLabel lblNuevaContrasea_1_1_1_4 = new JLabel("7- Call of Duty: Black Ops 6 ");
		lblNuevaContrasea_1_1_1_4.setBounds(25, 192, 206, 21);
		lblNuevaContrasea_1_1_1_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_4);
		
		JLabel lblNuevaContrasea_1_1_1_5 = new JLabel("6- NBA 2K25");
		lblNuevaContrasea_1_1_1_5.setBounds(25, 160, 98, 21);
		lblNuevaContrasea_1_1_1_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_5);
		
		JLabel lblNuevaContrasea_1_1_1_6 = new JLabel("8- Super Mario Party Jamboree ");
		lblNuevaContrasea_1_1_1_6.setBounds(25, 224, 253, 21);
		lblNuevaContrasea_1_1_1_6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_6);
		
		JLabel lblNuevaContrasea_1_1_1_7 = new JLabel("9- Super Mario Bros. Wonder ");
		lblNuevaContrasea_1_1_1_7.setBounds(25, 256, 253, 21);
		lblNuevaContrasea_1_1_1_7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_7);
		
		JLabel lblNuevaContrasea_1_1_1_8 = new JLabel("2- EA Sports FC 25");
		lblNuevaContrasea_1_1_1_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Juego1 a=new Juego1();
				a.setVisible(true);
			}
		});
		lblNuevaContrasea_1_1_1_8.setBounds(25, 37, 170, 21);
		lblNuevaContrasea_1_1_1_8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_8);
		
		JLabel lblNuevaContrasea_1_1_1_9 = new JLabel("3- Black Myth: Wukong ");
		lblNuevaContrasea_1_1_1_9.setBounds(25, 69, 170, 21);
		lblNuevaContrasea_1_1_1_9.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_9);
		
		JLabel lblNuevaContrasea_1_1_1_10 = new JLabel("4- Assassin’s Creed Shadows ");
		lblNuevaContrasea_1_1_1_10.setBounds(25, 103, 200, 21);
		lblNuevaContrasea_1_1_1_10.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_10);
		
		JLabel lblNuevaContrasea_1_1_1_2 = new JLabel("10- Grand Theft Auto V");
		lblNuevaContrasea_1_1_1_2.setBounds(25, 288, 263, 21);
		lblNuevaContrasea_1_1_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_2);
		
		JLabel lblNuevaContrasea_1_1_1_1 = new JLabel("5- The Elder Scrolls IV: Oblivion Remastered ");
		lblNuevaContrasea_1_1_1_1.setBounds(25, 134, 309, 21);
		lblNuevaContrasea_1_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		panel.add(lblNuevaContrasea_1_1_1_1);
	}
}
