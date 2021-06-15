package databasegui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import models.Contacts;

public class Contact {

	private JFrame frame;
	private JTextField txtNama;
	private JTextField txtHp;
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/test?autoReconnect=true&useSSL=false";
    static final String USER = "harkespan";
    static final String PASS = "rahasia123";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    private JTable tabelData;
//    private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact window = new Contact();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Contact() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				show();
			}
			
		});
		frame.setBounds(100, 100, 567, 719);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKontakBaru = new JLabel("Kontak Baru");
		lblKontakBaru.setBounds(215, 12, 105, 15);
		frame.getContentPane().add(lblKontakBaru);
		
		JLabel lblNamaLengkap = new JLabel("Nama Lengkap");
		lblNamaLengkap.setBounds(27, 62, 105, 15);
		frame.getContentPane().add(lblNamaLengkap);
		
		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setBounds(27, 89, 70, 15);
		frame.getContentPane().add(lblAlamat);
		
		JLabel lblTelphp = new JLabel("Telp/HP");
		lblTelphp.setBounds(27, 177, 70, 15);
		frame.getContentPane().add(lblTelphp);
		
		txtNama = new JTextField();
		txtNama.setBounds(192, 60, 216, 19);
		frame.getContentPane().add(txtNama);
		txtNama.setColumns(10);
		
		JTextArea txtAlamat = new JTextArea();
		txtAlamat.setBounds(192, 89, 216, 57);
		frame.getContentPane().add(txtAlamat);
		
		txtHp = new JTextField();
		txtHp.setBounds(192, 175, 152, 19);
		frame.getContentPane().add(txtHp);
		txtHp.setColumns(10);
		
		JLabel notif = new JLabel("");
		notif.setBounds(27, 242, 262, 20);
		frame.getContentPane().add(notif);
		JLabel txtID = new JLabel("");
		txtID.setVisible(false);
		txtID.setBounds(27, 37, 70, 15);
		frame.getContentPane().add(txtID);

		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nama = txtNama.getText().toString().trim();
				String alamat = txtAlamat.getText().toString().trim();
				String telp = txtHp.getText().toString().trim();
				
				insert(nama,alamat,telp);//method digunakan untuk insert data
				notif.setText("Input Data Berhasil!");
				show();
				txtNama.setText("");
				txtAlamat.setText("");
				txtHp.setText("");
			}
		});
		btnSimpan.setBounds(356, 237, 117, 25);
		frame.getContentPane().add(btnSimpan);
		JButton btnEdit = new JButton("Edit");
		btnEdit.setVisible(false);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 335, 502, 327);
		frame.getContentPane().add(scrollPane);
		JButton btnHapus = new JButton("Hapus");
		
		tabelData = new JTable();
		tabelData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		scrollPane.setViewportView(tabelData);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		btnEdit.setBounds(281, 237, 117, 25);
		frame.getContentPane().add(btnEdit);
		
		btnHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnHapus.setVisible(false);
		btnHapus.setBounds(412, 237, 117, 25);
		frame.getContentPane().add(btnHapus);
		
		
		
	}
	
	protected int parseInt(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void insert(String nama,String alamat, String telp)
	{
		try {
            Class.forName(JDBC_DRIVER);
            
   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
 
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO kontak (nama,alamat,telp) VALUES (?,?,?)";
            
            PreparedStatement pms = conn.prepareStatement(sql);
            pms.setString(1, nama);
            pms.setString(2, alamat);
            pms.setString(3, telp);
            
            pms.execute();

            
           
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void show()
	{

		try {
			Class.forName(JDBC_DRIVER);
            
			   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("Nama");
            model.addColumn("Alamat");
            model.addColumn("Telp/HP");
 
            stmt = conn.createStatement();
            String sql = "SELECT * FROM kontak";
            int i = 1;
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
            	model.addRow(new Object[] {
            		rs.getString("id"),
            		rs.getString("nama"),
            		rs.getString("alamat"),
            		rs.getString("telp")
            	});
            	i++;
            }
            rs.close();
            conn.close();
            stmt.close();
            
            tabelData.setModel(model);
            tabelData.setAutoResizeMode(0);
            //modifikasi lebar kolom (optional)
            tabelData.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelData.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelData.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabelData.getColumnModel().getColumn(3).setPreferredWidth(100);
           
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        
	}
	
	public void update()
	{
		
	}
	
	public void delete()
	{
		
	}
}

// array [0]{'nama','alamat','telp'}
//array[1] {'nama','alamat','telp'}

