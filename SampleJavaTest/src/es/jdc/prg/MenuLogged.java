package es.jdc.prg;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.GroupLayout.Alignment;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MenuLogged extends javax.swing.JFrame {
    
	Usuario usuario;
	private Usuario user;
    
    public void setUsuario(Usuario u){
        this.usuario = u;
        jLabel1.setText("Bienvenido, "+u.getNombre());
    }

    /**
     * Creates new form MenuLogged
     * @param stm 
     */
    public MenuLogged() {
    	
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        menuBar_1 = new JMenuBar();
        setJMenuBar(menuBar_1);
        
        mnOpciones_1 = new JMenu("Opciones");
        menuBar_1.add(mnOpciones_1);
        
        mntmSali = new JMenuItem("Salir");
        mntmSali.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		Login pr;
				pr = new Login();
				pr.setVisible(true);
				dispose();
        		
        	}
        });
        
        mntmCambiarContrasea_1 = new JMenuItem("Cambiar contrase\u00F1a");
        mntmCambiarContrasea_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//TODO
        		/*CambioClave cl = new CambioClave();
				cl.user=user;
				cl.setVisible(true);*/
        	}
        });
        mnOpciones_1.add(mntmCambiarContrasea_1);
        mnOpciones_1.add(mntmSali);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Iniciar nuevo cuestionario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver historial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido ");
        
        lblNewLabel = new JLabel();
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(221, 29, 108, 85);
		BufferedImage img = null;
		try {
		    img = ImageIO.read(getClass().getResource("/resources/img.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),
		        Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		lblNewLabel.setIcon(imageIcon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton1)
        					.addGap(248))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton2)
        					.addGap(278))))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(152)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addGap(47)
        			.addComponent(jButton1)
        			.addGap(18)
        			.addComponent(jButton2)
        			.addGap(46))
        );
        getContentPane().setLayout(layout);

        pack();
        
    }

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButton2ActionPerformed
		//TODO
        /*Historial h = new Historial(this.nombre, this.user, stm);
        h.setVisible(true);
        this.dispose();*/
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    	Test test = new Test();
        test.setVisible(true);
        test.setUser(this.user);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private JMenuBar menuBar;
    private JMenu mnOpciones;
    private JMenuItem mntmCambiarContrasea;
    private JMenuBar menuBar_1;
    private JMenu mnOpciones_1;
    private JMenuItem mntmSali;
    private JMenuItem mntmCambiarContrasea_1;
    private JLabel lblNewLabel;
    // End of variables declaration//GEN-END:variables
}