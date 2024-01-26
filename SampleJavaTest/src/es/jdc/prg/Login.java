package es.jdc.prg;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usuarioField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usuarioField = new JTextField();
		usuarioField.setToolTipText("Usuario");
		usuarioField.setBounds(166, 135, 232, 28);
		contentPane.add(usuarioField);
		usuarioField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(166, 174, 232, 28);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("EMAIL:");
		lblNewLabel.setBounds(48, 135, 108, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONTRASEÑA:");
		lblNewLabel_1.setBounds(48, 174, 108, 28);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String user = usuarioField.getText();
				String password = passwordField.getText();
				System.out.println(user);
				System.out.println(password);
				performLogin(user, password);
				
				
			}
		});
		btnNewButton.setBounds(241, 225, 89, 23);
		contentPane.add(btnNewButton);
		
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(221, 29, 108, 85);
		BufferedImage img = null;
		try {
		    img = ImageIO.read(getClass().getResource("/resources/img.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg = img.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(),
		        Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		
		
		lblNewLabel_2.setIcon(imageIcon);

		contentPane.add(lblNewLabel_2);
	}
	
	public void performLogin(String user, String password) {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.getUsuario(user);
		if(usuario==null) {
			JOptionPane.showMessageDialog(null, "Usuario/contraseña incorrecto");
		}else {
			//TODO Perform login
			MenuLogged m = new MenuLogged();
			m.setUsuario(usuario);
			m.setVisible(true);
			this.dispose();
		}
	}
	
}
