package A_3Final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServiceUser extends JFrame {

	private JFrame frmServices;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServiceUser window = new ServiceUser();
					window.frmServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ServiceUser() {
		setTitle("Services");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Service.class.getResource("/A_3/icon.png")));
		setBounds(100, 100, 625, 531);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		//frmServices = new JFrame();
		//frmServices.setTitle("Services");
		//frmServices.setIconImage(Toolkit.getDefaultToolkit().getImage(Service.class.getResource("/A_3/icon.png")));
		//frmServices.setBounds(100, 100, 503, 462);
		//frmServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frmServices.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Xymaxx Restaurant!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 13, 362, 40);
		getContentPane().add(lblNewLabel);
		//frmServices.getContentPane().add(lblNewLabel);
		
		JLabel lblServices = new JLabel("Services");
		lblServices.setForeground(Color.WHITE);
		lblServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblServices.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblServices.setBounds(124, 51, 362, 40);
		getContentPane().add(lblServices);
		//frmServices.getContentPane().add(button);
		
		JButton button_1 = new JButton("Advertising and Marketing");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				AdvertisingMarketing AM = new AdvertisingMarketing();
				AM.setModalExclusionType(null);
				AM.setVisible(true);
				//
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(223, 280, 185, 60);
		getContentPane().add(button_1);
		//frmServices.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Menu Description");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				MenuDescriptionUser MDU = new MenuDescriptionUser();
				MDU.setModalExclusionType(null);
				MDU.setVisible(true);
				//
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_5.setBackground(Color.BLACK);
		button_5.setBounds(223, 191, 185, 60);
		getContentPane().add(button_5);
		//frmServices.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Log Out");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JButton btnRestaurantDescription = new JButton("Restaurant Description");
		btnRestaurantDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				RestaurantDescription RD = new RestaurantDescription();
				RD.setModalExclusionType(null);
				RD.setVisible(true);
				//
			}
		});
		btnRestaurantDescription.setForeground(Color.WHITE);
		btnRestaurantDescription.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnRestaurantDescription.setBackground(Color.BLACK);
		btnRestaurantDescription.setBounds(223, 104, 185, 60);
		getContentPane().add(btnRestaurantDescription);
		//frmServices.getContentPane().add(btnRestaurantDescription);
		button_6.setIcon(new ImageIcon(Service.class.getResource("/A_3/e1.png")));
		button_6.setHorizontalAlignment(SwingConstants.RIGHT);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		button_6.setBackground(Color.BLACK);
		button_6.setBounds(465, 424, 142, 60);
		getContentPane().add(button_6);
		
		JButton btnReservation = new JButton("Reservation");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				ReservationSystem RS = new ReservationSystem();
				RS.setModalExclusionType(null);
				RS.setVisible(true);
				//
			}
		});
		btnReservation.setForeground(Color.WHITE);
		btnReservation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnReservation.setBackground(Color.BLACK);
		btnReservation.setBounds(223, 369, 185, 60);
		getContentPane().add(btnReservation);
		//frmServices.getContentPane().add(button_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Service.class.getResource("/A_3/rs2.png")));
		lblNewLabel_1.setBounds(0, 0, 607, 484);
		getContentPane().add(lblNewLabel_1);
		//frmServices.getContentPane().add(lblNewLabel_1);
	}
}
