package wrm2;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class companysignup extends javax.swing.JFrame {

   
    public companysignup() {
        initComponents();
    }                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel1.setText("Company Signup");

        jLabel2.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel2.setText("Company ID");

        jLabel3.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel3.setText("Comanpy Name");

        cid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });

        cname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton1.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jButton1.setText("Signup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel4.setText("Address");

        addr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        jLabel5.setText("Phone Number");

        phno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        
        txtAlreadyRegisteredWith = new JTextField();
        txtAlreadyRegisteredWith.setBackground(new Color(240, 240, 240));
        txtAlreadyRegisteredWith.setFont(new Font("Times New Roman", Font.BOLD, 20));
        txtAlreadyRegisteredWith.setText("Already registered with us?");
        txtAlreadyRegisteredWith.setColumns(10);
        
        btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		companylogin c = new companylogin();
        		c.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(42)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel5)
        						.addComponent(jLabel4)
        						.addComponent(jLabel3))
        					.addGap(52)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(cid, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        						.addComponent(addr, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        						.addComponent(cname, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        						.addComponent(phno, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(132)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
        			.addGap(71))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jButton1)
        				.addComponent(txtAlreadyRegisteredWith, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(btnNewButton)
        			.addGap(80))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(jLabel1)
        			.addGap(35)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(cid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(addr, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        				.addComponent(jLabel4))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(phno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5))
        			.addGap(25)
        			.addComponent(jButton1)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtAlreadyRegisteredWith, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnNewButton))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wrm2","root","1bi21cs057@I");
            String sql="insert into company values (?,?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(cid.getText()));
            pstmt.setString(2,new String(cname.getText()));
            pstmt.setString(3,new String(addr.getText()));
            pstmt.setString(4,new String(phno.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Company account successfully created!");
            companydashboard p=new companydashboard();
			p.setVisible(true);
			dispose();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new companysignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField addr;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField phno;
    private JTextField txtAlreadyRegisteredWith;
    private JButton btnNewButton;
    // End of variables declaration                   
}
