package wrm2;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class wastedeposit extends javax.swing.JFrame {

    /**
     * Creates new form wastedeposit
     */
    public wastedeposit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */                        
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        waste = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        wid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel1.setText("Waste Deposit");

        jLabel2.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel2.setText("userid");

        uid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel4.setText("weight");

        weight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel5.setText("waste type");

        waste.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel6.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel6.setText("waste_id");

        wid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        wid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(38)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel2)
        				.addComponent(jLabel6)
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5))
        			.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(waste)
        				.addComponent(weight)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(uid, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        					.addComponent(wid)))
        			.addGap(42))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(60)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel6)
        				.addComponent(wid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(uid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(36)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(weight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(waste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jButton1.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		userdashboard s=new userdashboard();
				s.setVisible(true);
				dispose();
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(19)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(41)
        							.addComponent(btnNewButton))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(31)
        							.addComponent(jButton1))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(151)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(35)
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(94)
        					.addComponent(jButton1)
        					.addGap(44)
        					.addComponent(btnNewButton)))
        			.addContainerGap(32, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wrm2","root","1bi21cs057@I");
                    String sql="insert into wastes values (?,?,?,?)";
                    PreparedStatement pstmt=conn.prepareStatement(sql);
                    pstmt.setInt(1,Integer.parseInt(wid.getText()));
                    int userId = Integer.parseInt(uid.getText());
                    pstmt.setInt(2, userId);
                    //pstmt.setInt(2,Integer.parseInt(uid.getText()));
                    pstmt.setInt(3,Integer.parseInt(weight.getText()));
                    pstmt.setString(4,new String(waste.getText()));
                    pstmt.executeUpdate();
                    
                    Random random = new Random();
                    int c = random.nextInt(2000000);
                    String sql2="insert into coupons values (?,?,?)";
                    PreparedStatement pstmt1=conn.prepareStatement(sql2);
                    pstmt1.setInt(1,c);
                    pstmt1.setInt(2,10);
                    pstmt1.setInt(3, userId);
                    pstmt1.executeUpdate();

                   
                    JOptionPane.showMessageDialog(null,"Insertion successfull.");
                    
                    
                    
                    JOptionPane.showMessageDialog(null,"Deposit successful. Coupon awarded.");
                    wid.setText("");
                    uid.setText("");
                    
                    weight.setText("");
                    waste.setText("");
                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                
    }                                        

    private void widActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(wastedeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wastedeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wastedeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wastedeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wastedeposit().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField waste;
    private javax.swing.JTextField weight;
    private javax.swing.JTextField wid;
    private JButton btnNewButton;
    // End of variables declaration                   
}