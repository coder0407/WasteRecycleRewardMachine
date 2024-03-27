package wrm2;
import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class companyorders extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextField company_id;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    companyorders frame = new companyorders();
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
    public companyorders() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Display");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	    try {
        	        int companyId = Integer.parseInt(company_id.getText());
        	        Class.forName("com.mysql.cj.jdbc.Driver");
        	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wrm2", "root", "1bi21cs057@I");
        	        String query = "select * from orders where company_id = ?";
        	        PreparedStatement pstmt = con.prepareStatement(query);
        	        pstmt.setInt(1, companyId);
        	        ResultSet rs = pstmt.executeQuery();
        	        ResultSetMetaData rsmd = rs.getMetaData();
        	        DefaultTableModel model = (DefaultTableModel) table.getModel();
        	        int cols = rsmd.getColumnCount();
        	        String[] colName = new String[cols];
        	        for (int i = 0; i < cols; i++)
        	            colName[i] = rsmd.getColumnName(i + 1);
        	        model.setColumnIdentifiers(colName);
        	        while (rs.next()) {
        	            Object[] rowData = new Object[cols];
        	            for (int i = 0; i < cols; i++) {
        	                rowData[i] = rs.getObject(i + 1);
        	            }
        	            model.addRow(rowData);
        	        }
        	    } catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
        	        e1.printStackTrace();
        	    }
        	}

        });
        btnNewButton.setBounds(122, 189, 85, 21);
        contentPane.add(btnNewButton);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(31, 10, 261, 153);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        JButton btnNewButton_1 = new JButton("Clear");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
        	}
        });
        btnNewButton_1.setBounds(122, 220, 85, 21);
        contentPane.add(btnNewButton_1);
        
        company_id = new JTextField();
        company_id.setText("cid");
        company_id.setBounds(278, 209, 117, 19);
        contentPane.add(company_id);
        company_id.setColumns(10);
        
        JButton btnNewButton_2 = new JButton("Back");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		companydashboard c = new companydashboard();
        		c.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton_2.setBounds(10, 242, 85, 21);
        contentPane.add(btnNewButton_2);
    }
}
