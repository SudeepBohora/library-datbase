package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class userform extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userform frame = new userform();
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
	public userform() {
		setTitle("user form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNormalUser = new JButton("normal user");
		GridBagConstraints gbc_btnNormalUser = new GridBagConstraints();
		gbc_btnNormalUser.insets = new Insets(0, 0, 5, 0);
		gbc_btnNormalUser.gridx = 4;
		gbc_btnNormalUser.gridy = 1;
		contentPane.add(btnNormalUser, gbc_btnNormalUser);
		
		JButton btnRegisterUser = new JButton("register user");
		GridBagConstraints gbc_btnRegisterUser = new GridBagConstraints();
		gbc_btnRegisterUser.gridx = 4;
		gbc_btnRegisterUser.gridy = 2;
		contentPane.add(btnRegisterUser, gbc_btnRegisterUser);
	}

}
