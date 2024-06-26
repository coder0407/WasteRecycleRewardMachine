package wrm2;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form singup
     */
    public signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        phno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        psswrd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel1.setText("User Signup");

        jLabel2.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel2.setText("phone_number");

        phno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel3.setText("password");

        psswrd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        psswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psswrdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel6.setText("user_name");

        uname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });

        jButton1.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jButton1.setText("Signup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        txtAlreadyAUser = new JTextField();
        txtAlreadyAUser.setBackground(new Color(240, 240, 240));
        txtAlreadyAUser.setFont(new Font("Times New Roman", Font.BOLD, 20));
        txtAlreadyAUser.setText("Already a user?");
        txtAlreadyAUser.setColumns(10);
        
        btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Loginform l = new Loginform();
        		l.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(38)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel2)
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        						.addPreferredGap(ComponentPlacement.RELATED))
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel3)
        						.addGap(77))))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(phno, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        				.addComponent(psswrd, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        				.addComponent(uname, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        			.addGap(42))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(205, Short.MAX_VALUE)
        			.addComponent(txtAlreadyAUser, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnNewButton))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(158)
        			.addComponent(jButton1)
        			.addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(25)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(uname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(phno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addComponent(psswrd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(27)
        			.addComponent(jButton1)
        			.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNewButton)
        				.addComponent(txtAlreadyAUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(13))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(30)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(55, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(201, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
        			.addGap(193))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(29, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(23))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void phnoActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void psswrdActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wrm2","root","1bi21cs057@I");
            String sql="insert into user values (?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(psswrd.getText()));
            pstmt.setString(2,new String(uname.getText()));
            pstmt.setString(3,new String(phno.getText()));

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Insertion successfull.");
            userdashboard u=new userdashboard();
			u.setVisible(true);
			dispose();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phno;
    private javax.swing.JTextField psswrd;
    private javax.swing.JTextField uname;
    private JTextField txtAlreadyAUser;
    private JButton btnNewButton;
    // End of variables declaration                   
}