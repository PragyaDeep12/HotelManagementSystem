package reception;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class AddRoom extends JFrame {

	private JPanel contentPane;
	private JTextField troomno;
	private JRadioButton rdbtnAC,rdbtnNonAC;
	private JComboBox tcity;
	private JTextField trate;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRoom frame = new AddRoom();
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
	public AddRoom() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 3));
		panel.setBounds(0, 0, 424, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRoomno = new JLabel("RoomNo");
		lblRoomno.setForeground(new Color(0, 0, 139));
		lblRoomno.setFont(new Font("Arial", Font.BOLD, 13));
		lblRoomno.setBounds(23, 25, 55, 14);
		panel.add(lblRoomno);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setForeground(new Color(0, 0, 139));
		lblCity.setFont(new Font("Arial", Font.BOLD, 13));
		lblCity.setBounds(23, 77, 46, 14);
		panel.add(lblCity);
		
		JLabel lblBeds = new JLabel("Beds");
		lblBeds.setForeground(new Color(0, 0, 139));
		lblBeds.setFont(new Font("Arial", Font.BOLD, 13));
		lblBeds.setBounds(23, 106, 46, 14);
		panel.add(lblBeds);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setForeground(new Color(25, 25, 112));
		lblRate.setFont(new Font("Arial", Font.BOLD, 13));
		lblRate.setBounds(23, 133, 46, 14);
		panel.add(lblRate);
		
		troomno = new JTextField();
		troomno.setBounds(91, 23, 86, 17);
		panel.add(troomno);
		troomno.setColumns(10);
		//troomno.validate();
		String cityList[]={"Kolkata","Chennai","Delhi","Bangalore"};
		tcity = new JComboBox(cityList);
		tcity.setForeground(new Color(255, 0, 0));
		tcity.setFont(new Font("Arial", Font.BOLD, 11));
		tcity.setBackground(new Color(192, 192, 192));
		tcity.setBounds(91, 77, 86, 20);
		panel.add(tcity);
		String num[]={"1","2","3"};
		JComboBox tbeds = new JComboBox(num);
		tbeds.setFont(new Font("Arial", Font.BOLD, 11));
	
		tbeds.setBounds(91, 103, 46, 20);
		panel.add(tbeds);
	
		
		trate = new JTextField();
		trate.setBounds(91, 130, 86, 20);
		panel.add(trate);
		trate.setColumns(10);
		
		JRadioButton rdbtnAC = new JRadioButton("AC");
		rdbtnAC.setBackground(new Color(255, 255, 255));
		rdbtnAC.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		rdbtnAC.setForeground(new Color(255, 0, 0));
		rdbtnAC.setBounds(91, 47, 109, 23);
		//panel.add(rdbtnAC);
		
		JRadioButton rdbtnNonAC = new JRadioButton("NonAC");
		rdbtnNonAC.setBackground(new Color(255, 255, 255));
		rdbtnNonAC.setForeground(new Color(255, 0, 0));
		rdbtnNonAC.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		rdbtnNonAC.setBounds(223, 46, 109, 23);
		//panel.add(rdbtnNonAC);
		JPanel roomType=new JPanel();
		roomType.setBackground(new Color(0, 255, 255));
		roomType.setForeground(new Color(255, 255, 255));
		roomType.add(rdbtnAC);
		ButtonGroup rgrp=new ButtonGroup();
		rgrp.add(rdbtnAC);
        rgrp.add(rdbtnNonAC);		
		roomType.add(rdbtnNonAC);
		panel.add(roomType);
		roomType.isVisible();
		roomType.setBounds(88, 43, 125, 23);
		
		JButton btnAddRoom = new JButton("Add Room");
		btnAddRoom.setIcon(new ImageIcon("C:\\HMS\\src\\iconImg\\1486107863_Red_button.png"));
		btnAddRoom.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnAddRoom.setForeground(new Color(0, 0, 205));
		btnAddRoom.setBackground(new Color(0, 255, 255));
		btnAddRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String roomno,city,beds,rate,type;
				
				roomno=troomno.getText().trim();
				city=tcity.getSelectedItem().toString();
				beds=tbeds.getSelectedItem().toString();
				rate=trate.getText().trim();
				if(rdbtnAC.isSelected())
					type="AC";
				else
					type="NonAC";
				new Room(roomno,type,city,beds,rate);
				JOptionPane.showMessageDialog(null,"record Added Successfully");
			}
		});
		btnAddRoom.setBounds(88, 168, 209, 82);
		panel.add(btnAddRoom);
		JLabel lblType = new JLabel("Type");
		lblType.setForeground(new Color(0, 0, 139));
		lblType.setFont(new Font("Arial", Font.BOLD, 13));
		lblType.setBounds(23, 50, 55, 16);
		panel.add(lblType);
		
		JLabel lblRoomInformation = new JLabel("ROOM INFORMATION");
		lblRoomInformation.setForeground(new Color(0, 0, 128));
		lblRoomInformation.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblRoomInformation.setBounds(129, 0, 197, 21);
		panel.add(lblRoomInformation);
		
	
	
		
	
	    //System.out.println(roomno);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
