package job_post;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame {

	private JPanel contentPane;
	
	private ImageIcon ii;
	private JTextField login;
	private JPasswordField mdp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(new Color(255, 255, 224));
		setResizable(false);
		setForeground(Color.BLACK);
		setTitle("Authentification");
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		setBounds(100, 100, 981, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ii = new ImageIcon("index.png");
		JLabel image_label = new JLabel("");
		image_label.setIcon(ii);
		image_label.setBounds(302, 0, 663, 555);
		contentPane.add(image_label, BorderLayout.SOUTH);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("connexion");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 50));
		lblNewLabel.setBounds(73, 29, 299, 86);
		contentPane.add(lblNewLabel);
		
		login = new JTextField();
		login.setFont(new Font("Andalus", Font.PLAIN, 18));
		login.setBounds(123, 171, 317, 37);
		contentPane.add(login);
		login.setColumns(10);
		
		mdp = new JPasswordField();
		mdp.setFont(new Font("Andalus", Font.PLAIN, 18));
		mdp.setBounds(123, 219, 317, 37);
		contentPane.add(mdp);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 171, 87, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 219, 87, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Connecter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.setVisible(false);
				Connexion c = new Connexion();
				setContentPane(c);
				
			}
		});
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Andalus", Font.BOLD, 27));
		btnNewButton.setBounds(198, 297, 195, 55);
		contentPane.add(btnNewButton);
		

	}
}
