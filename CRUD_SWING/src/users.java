import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.table.TableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class users {

	private JFrame frmCrudSwing;
	private JTextField txtID;
	private JTextField txtNAME;
	private JTextField txtAGE;
	private JTextField txtCITY;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					users window = new users();
					window.frmCrudSwing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public users() {
		initialize();
		Connect();
		loadData();
	}
	
	
	//Database Connection
	Connection con=null;
	PreparedStatement  pst;
	ResultSet rs ;
	
	
	public void Connect() {
		try {
			//System.out.print("running");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dblokii?characterEncoding=utf8";
			String username="root";
			String password="Loki@2003";
	        con = DriverManager.getConnection(url,username,password);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//clear all
	public void clear() {
		txtID.setText("");
		txtNAME.setText("");
		txtAGE.setText("");
		txtCITY.setText("");
		txtNAME.requestFocus();
	}
	
	public void loadData() {
		try {
			pst=con.prepareStatement("Select*from users");
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrudSwing = new JFrame();
		frmCrudSwing.setTitle("CRUD SWING");
		frmCrudSwing.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 188, 29);
		frmCrudSwing.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(20, 49, 321, 319);
		frmCrudSwing.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 27, 73, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 73, 73, 26);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("AGE");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 112, 73, 26);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CITY");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 154, 73, 26);
		panel.add(lblNewLabel_1_3);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(101, 33, 200, 20);
		panel.add(txtID);
		txtID.setColumns(10);
		
		txtNAME = new JTextField();
		txtNAME.setColumns(10);
		txtNAME.setBounds(101, 79, 200, 20);
		panel.add(txtNAME);
		
		txtAGE = new JTextField();
		txtAGE.setColumns(10);
		txtAGE.setBounds(101, 118, 200, 20);
		panel.add(txtAGE);
		
		txtCITY = new JTextField();
		txtCITY.setColumns(10);
		txtCITY.setBounds(101, 160, 200, 20);
		panel.add(txtCITY);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =txtID.getText();
				String name=txtNAME.getText();
				String age=txtAGE.getText();
				String city=txtCITY.getText();
				
				if(name==null||name.isEmpty()||name.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter Name");
				    txtNAME.requestFocus();
				    return;
				    
				}
				
				if(age==null||age.isEmpty()||age.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter Age");
				    txtAGE.requestFocus();
				    return;
				    
				}
				
				if(city==null||city.isEmpty()||city.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter city");
				    txtCITY.requestFocus();
				    return;
				    
				}
				if(txtID.getText().isEmpty()) {
					try {
						String sql="insert into users(NAME,AGE,CITY)values(?,?,?)";
						pst=con.prepareStatement(sql);
						pst.setString(1, name);
						pst.setString(2, age);
						pst.setString(3,city);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Data insert Success");
						clear();
						loadData();
					}catch(SQLException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSave.setBounds(10, 219, 85, 21);
		panel.add(btnSave);
		
		JButton btnUpdate = new JButton("Update");
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =txtID.getText();
				String name=txtNAME.getText();
				String age=txtAGE.getText();
				String city=txtCITY.getText();
				
				if(name==null||name.isEmpty()||name.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter Name");
				    txtNAME.requestFocus();
				    return;
				    
				}
				
				if(age==null||age.isEmpty()||age.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter Age");
				    txtAGE.requestFocus();
				    return;
				    
				}
				
				if(city==null||city.isEmpty()||city.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter city");
				    txtCITY.requestFocus();
				    return;
				    
				}
				if(!txtID.getText().isEmpty()) {
					try {
						String sql="update users set NAME=?,AGE=?,CITY=? where ID=?";
						pst=con.prepareStatement(sql);
						pst.setString(1, name);
						pst.setString(2, age);
						pst.setString(3,city);
						pst.setString(4, id);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Data Update Success");
						clear();
						loadData();
					}catch(SQLException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUpdate.setBounds(113, 220, 85, 21);
		panel.add(btnUpdate);
		
		JButton bttnDelete = new JButton("Delete");
		bttnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				String id=txtID.getText();
				if(!txtID.getText().isEmpty()) {
					
					int result =JOptionPane.showConfirmDialog(null, "Sure? You want to Delete?","Delete?",
							JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					
					if(result == JOptionPane.YES_OPTION) {
						try {
							String sql="delete from users where ID=?";
							pst=con.prepareStatement(sql);
							pst.setString(1, id);
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Data Deleted Success");
						    clear();
						    loadData();
						}catch(SQLException e1) {
							e1.printStackTrace();
						}
					}
					
				}
				
				
			}
		});
		bttnDelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bttnDelete.setBounds(216, 220, 85, 21);
		panel.add(bttnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(351, 49, 444, 319);
		frmCrudSwing.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index=table.getSelectedRow();
				TableModel model=table.getModel();
				
				txtID.setText(model.getValueAt(index, 0).toString());
				txtNAME.setText(model.getValueAt(index, 1).toString());
				txtAGE.setText(model.getValueAt(index, 2).toString());
				txtCITY.setText(model.getValueAt(index, 3).toString());
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
	}
}
