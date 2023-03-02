package interfac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ejer5 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JScrollPane scrollPane;
	Ejer5 frame;
	private JTable table;
	JTextArea textapp;
	private JTextField textnom;
	private JTextField textdni;
	private JTextField texttel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					Ejer5 	frame = new Ejer5();
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
	public Ejer5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Panel1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel textos_tablas = (DefaultTableModel)table.getModel();
				contentPane.remove(scrollPane);
				table = new JTable();
			
				  textos_tablas.addRow(
						new Object[] {Integer.parseInt( textnom.getText()) ,Integer.parseInt( textapp.getText()),Integer.parseInt( textdni.getText()),Integer.parseInt( texttel.getText()) });

				  	
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(165, 83, 100, 100);
				scrollPane.setViewportView(table);
				contentPane.add(scrollPane);
				contentPane.updateUI();
				
			}
		});
		btnNewButton.setBounds(49, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		
		table.setEnabled(false);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"nombre", "appelido", "DNI", "telefono"
			}
		));
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 90, 367, 108);
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
		textapp = new JTextArea();
		textapp.setBounds(10, 53, 89, 23);
		contentPane.add(textapp);
		
		textnom = new JTextField();
		textnom.setBounds(10, 13, 86, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textdni = new JTextField();
		textdni.setBounds(301, 13, 86, 20);
		contentPane.add(textdni);
		textdni.setColumns(10);
		
		texttel = new JTextField();
		texttel.setBounds(301, 55, 86, 20);
		contentPane.add(texttel);
		texttel.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Teléfono");
		lblNewLabel.setBounds(327, 16, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(20, 35, 46, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(322, 0, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(20, 0, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(311, 44, 46, 14);
		contentPane.add(lblTelefono);
	}
}