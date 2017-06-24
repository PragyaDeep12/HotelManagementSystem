package BookingFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientDetails extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private String fName,mName,lName,Address,AdharNo,Gender,MobileNo,EmailID,Password;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientDetails frame = new ClientDetails();
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
	public ClientDetails() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1272, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHotelTaj = new JLabel("Hotel Taj\r\n");
		lblHotelTaj.setForeground(new Color(255, 255, 255));
		lblHotelTaj.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 54));
		lblHotelTaj.setBounds(0, -38, 390, 153);
		contentPane.add(lblHotelTaj);
		
		JLabel lblWeServeYou = new JLabel("We Serve You Best...");
		lblWeServeYou.setFont(new Font("Brush Script MT", Font.BOLD | Font.ITALIC, 23));
		lblWeServeYou.setForeground(new Color(255, 255, 255));
		lblWeServeYou.setBounds(0, 100, 206, 49);
		contentPane.add(lblWeServeYou);
		
		JLabel lblPleaseEnterYour = new JLabel("Please Enter Your Details");
		lblPleaseEnterYour.setForeground(new Color(255, 255, 255));
		lblPleaseEnterYour.setFont(new Font("Brush Script MT", Font.BOLD | Font.ITALIC, 23));
		lblPleaseEnterYour.setBounds(549, 11, 270, 41);
		contentPane.add(lblPleaseEnterYour);
		
		JLabel lblYourName = new JLabel("First Name");
		lblYourName.setForeground(new Color(255, 255, 255));
		lblYourName.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		lblYourName.setBounds(496, 69, 141, 32);
		contentPane.add(lblYourName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		//textField_1=null;
		textField_1.setBounds(587, 72, 148, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setForeground(new Color(255, 255, 255));
		lblMiddleName.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		lblMiddleName.setBounds(745, 72, 115, 27);
		contentPane.add(lblMiddleName);
		
		textField_2 = new JTextField();
		//textField_2=null;
		textField_2.setBounds(861, 69, 148, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		lblLastName.setBounds(1019, 69, 115, 27);
		contentPane.add(lblLastName);
		
		textField_3 = new JTextField();
		//textField_3=null;
		textField_3.setBounds(1107, 65, 148, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAddess = new JLabel("Address");
		lblAddess.setForeground(new Color(255, 255, 255));
		lblAddess.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		lblAddess.setBounds(496, 129, 115, 32);
		contentPane.add(lblAddess);
		
		textField_4 = new JTextField();
		//textField_4=null;
		textField_4.setBounds(587, 122, 635, 49);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAdharNumber = new JLabel("Adhar Number");
		lblAdharNumber.setForeground(new Color(255, 255, 255));
		lblAdharNumber.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		lblAdharNumber.setBounds(496, 197, 141, 32);
		contentPane.add(lblAdharNumber);
		
		textField_5 = new JTextField();
		//textField_5=null;
		textField_5.setBounds(629, 197, 148, 35);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Mobile Number");
		lblPhoneNumber.setForeground(new Color(255, 255, 255));
		lblPhoneNumber.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		lblPhoneNumber.setBounds(496, 255, 141, 32);
		contentPane.add(lblPhoneNumber);
		
		textField_6 = new JTextField();
		//textField_6=null;
		textField_6.setBounds(629, 256, 148, 32);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email-ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(496, 308, 127, 32);
		contentPane.add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		//textField_7=null;
		textField_7.setBounds(629, 306, 437, 32);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		rdbtnMale.setBounds(881, 203, 68, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 18));
		rdbtnFemale.setBounds(974, 203, 109, 23);
		contentPane.add(rdbtnFemale);

		ButtonGroup rgrp=new ButtonGroup();
		rgrp.add(rdbtnMale);
		rgrp.add(rdbtnFemale);
		//fName=new String();
	//	fName=textField_1.getText().trim().toString();
//		mName=textField_2.getText().trim();
	//	lName=textField_3.getText().trim();
	//	Address=textField_4.getText().trim();
	//	AdharNo=textField_5.getText().trim();
		
		if(rdbtnMale.isSelected())
			Gender="Male";
		else
			Gender="Female";
		MobileNo=textField_6.toString();
		EmailID=textField_7.toString();
		Password=fName+AdharNo;
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("hello");
				if(textField_1.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Enter First Name ");
				}
				else if(textField_3.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Enter Last Name");
				}
				else if(textField_4.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Enter Addresss ");
					
				}
				else if(textField_5.getText().isEmpty())
				{
					
					JOptionPane.showMessageDialog(null,"Enter AdharNo");
				}
				else if(textField_6==null)
				{
					
					JOptionPane.showMessageDialog(null,"Enter Mobile no");
				} 
				
				else{
					if(textField_2.getText().isEmpty())
						textField_2.setText("NotEntered");
					if(textField_7.getText()==null)
						textField_7.setText("NotEntered");
				String add[]=textField_4.getText().split(" ");
				int i=add.length;
				String addr="";
				int c=0;
				while(i!=0)
				{
					
                     
					addr=addr+"_"+add[c];
					c++;
					i--;
				}
				
				
				JOptionPane.showMessageDialog(null, "Your UserName is: "+textField_5.getText()+"\nYour Password is: "+textField_1.getText()+textField_5.getText());

				new Client(textField_1.getText(),textField_2.getText(),textField_3.getText(),addr,textField_5.getText(),Gender,textField_6.getText(),textField_7.getText(),textField_1.getText()+textField_5.getText());
				new Booking(textField_1.getText());
				
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				
			}
			}
		});
		btnSubmit.setIcon(new ImageIcon(ClientDetails.class.getResource("/reception/iconImg/1486113792_Button White Check.png")));
		btnSubmit.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 15));
		btnSubmit.setBounds(907, 482, 127, 41);
		contentPane.add(btnSubmit);

		JButton btnNewButton = new JButton("RELOAD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ClientDetailsTable();
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				rdbtnMale.setSelected(true);
				rdbtnFemale.setSelected(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(ClientDetails.class.getResource("/reception/iconImg/1486107877_radio-button_off.png")));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(731, 482, 129, 41);
		contentPane.add(btnNewButton);
		
				

		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ClientDetails.class.getResource("/reception/hotelpics/new.jpg")));
		lblNewLabel_2.setBounds(0, 0, 410, 749);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(ClientDetails.class.getResource("/reception/hotelpics/chambers-hotel-new-york-home4-top (1).jpg")));
		lblNewLabel_3.setBounds(0, 0, 1255, 895);
		contentPane.add(lblNewLabel_3);
		
		
		
				
	}
}
