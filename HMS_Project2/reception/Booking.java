package reception;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Booking {

	private JFrame frame;
	private JTable table_Food;
	int i;
	int city;
	int  Date_in;
	int Month_in;
	int Year_in;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking window = new Booking();
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
	public Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		String s;
		frame.setBounds(100, 100, 944, 701);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(10, 10, 906, 306);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblHotelTaj = new JLabel("HOTEL TAJ");
		lblHotelTaj.setForeground(new Color(64, 224, 208));
		lblHotelTaj.setFont(new Font("Courier New", Font.BOLD, 91));
		lblHotelTaj.setBounds(0, -67, 647, 256);
		panel.add(lblHotelTaj);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\HMS\\bin\\hotelpics\\140596_275_z.jpg"));
		lblNewLabel.setBounds(0, 0, 906, 306);
		panel.add(lblNewLabel);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(10, 351, 421, 293);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_City = new JComboBox();
		comboBox_City.addActionListener(new ActionListener() {
			String s;
			public void actionPerformed(ActionEvent arg0) {
				String g;
				city=comboBox_City.getSelectedIndex();
			
			}
		});
		comboBox_City.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_City.setModel(new DefaultComboBoxModel(new String[] {"Kolkata", "Chennai", "Mumbai", "Bengalore"}));
		comboBox_City.setBounds(186, 13, 98, 28);
		panel_1.add(comboBox_City);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCity.setBounds(12, 16, 69, 22);
		panel_1.add(lblCity);
		
		JLabel lblCheckInDate = new JLabel("Check In Date:");
		lblCheckInDate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCheckInDate.setBounds(12, 72, 137, 41);
		panel_1.add(lblCheckInDate);
		
		JLabel lblCheckOutDate = new JLabel("Check Out Date:");
		lblCheckOutDate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCheckOutDate.setBounds(12, 150, 162, 22);
		panel_1.add(lblCheckOutDate);
		
		JComboBox comboBox_inDate = new JComboBox();
		comboBox_inDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date_in=comboBox_inDate.getSelectedIndex();
				System.out.println(e);
				
				
			}
		});
		comboBox_inDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_inDate.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_inDate.setMaximumRowCount(31);
		comboBox_inDate.setBounds(186, 80, 49, 29);
		panel_1.add(comboBox_inDate);
		
		JComboBox comboBox_inMonth = new JComboBox();
		comboBox_inMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month_in=comboBox_inMonth.getSelectedIndex();
			}
		});
		comboBox_inMonth.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_inMonth.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_inMonth.setMaximumRowCount(12);
		comboBox_inMonth.setBounds(241, 80, 49, 28);
		panel_1.add(comboBox_inMonth);
		
		JComboBox comboBox_inYear = new JComboBox();
		comboBox_inYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Year_in=comboBox_inYear.getSelectedIndex();
			}
		});
		comboBox_inYear.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_inYear.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"}));
		comboBox_inYear.setBounds(297, 80, 67, 28);
		panel_1.add(comboBox_inYear);
		
		JComboBox comboBox_outDate = new JComboBox();
		comboBox_outDate.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_outDate.setMaximumRowCount(31);
		comboBox_outDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_outDate.setBounds(186, 143, 49, 29);
		panel_1.add(comboBox_outDate);
		
		JComboBox comboBox_outMonth = new JComboBox();
		comboBox_outMonth.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_outMonth.setMaximumRowCount(12);
		comboBox_outMonth.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_outMonth.setBounds(241, 143, 49, 28);
		panel_1.add(comboBox_outMonth);
		
		JComboBox comboBox_outYear = new JComboBox();
		comboBox_outYear.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"}));
		comboBox_outYear.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_outYear.setBounds(297, 143, 67, 28);
		panel_1.add(comboBox_outYear);
		
		JButton btnCheckRooms = new JButton("Check Rooms");
		btnCheckRooms.setBackground(UIManager.getColor("ComboBox.selectionBackground"));
		btnCheckRooms.setIcon(null);
		btnCheckRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Could Not Found");
				}
				
			}
		});
		btnCheckRooms.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCheckRooms.setBounds(121, 213, 217, 67);
		panel_1.add(btnCheckRooms);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(437, 351, 467, 293);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox_Cuisine = new JComboBox();
		comboBox_Cuisine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=comboBox_Cuisine.getSelectedIndex();
			}
		});
		comboBox_Cuisine.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_Cuisine.setModel(new DefaultComboBoxModel(new String[] {"Chinese-Veg", "Chinese Non-Veg", "Indian-Veg", "Indian Non-Veg", "Continental-Veg", "Continental Non-Veg"}));
		comboBox_Cuisine.setBounds(268, 17, 187, 35);
		panel_2.add(comboBox_Cuisine);
		
		JLabel lblCuisine = new JLabel("Prefered Cuisine :");
		lblCuisine.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCuisine.setBounds(32, 22, 187, 22);
		panel_2.add(lblCuisine);
		
		table_Food = new JTable();
		table_Food.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_Food.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_Food.setModel(new DefaultTableModel(
			new Object[][] {
				{"Price" , "Food Type(Rs)"},
				{"Chinese-Veg", "150"},
				{"Indian-Veg", "100"},
				{"Continental-Veg", "150"},
				{"Chinese Non-Veg", "150"},
				{"Indian Non-Veg", "100"},
				{"Continental Non-Veg", "150"},
				
			},
			new String[] {
				"Food Type", "Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_Food.setEnabled(false);
		table_Food.setBounds(32, 65, 424, 160);
		panel_2.add(table_Food);

		
		
		JButton btnNewButton = new JButton("Book Food");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=comboBox_Cuisine.getSelectedItem().toString();
				Billing Billing_Food=new Billing(s,i);
				//Billing_Food.Bill();
				Billing_Food.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(176, 238, 187, 42);
		panel_2.add(btnNewButton);
		
		JRadioButton rdbtnLodging = new JRadioButton("Lodging");
		rdbtnLodging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				
			}
		});
		rdbtnLodging.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnLodging.setBounds(139, 322, 127, 25);
		frame.getContentPane().add(rdbtnLodging);
		
		JRadioButton rdbtnFoodingAndLodging = new JRadioButton("Fooding And Lodging");
		rdbtnFoodingAndLodging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
			    panel_2.setVisible(true);
			}
		});
		rdbtnFoodingAndLodging.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnFoodingAndLodging.setBounds(579, 322, 199, 25);
		frame.getContentPane().add(rdbtnFoodingAndLodging);
		
		
		
	
	}
}
