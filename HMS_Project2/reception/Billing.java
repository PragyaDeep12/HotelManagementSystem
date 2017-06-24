package reception;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Billing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */public Billing() {
		// TODO Auto-generated constructor stub
	}
	public Billing(String s,int i) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFood = new JLabel("Food");
		lblFood.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFood.setBounds(100, 30, 112, 55);
		contentPane.add(lblFood);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(294, 41, 76, 33);
		contentPane.add(lblPrice);
		
		JLabel label_1 = new JLabel(s);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(100, 98, 112, 21);
		contentPane.add(label_1);
		String t=String.valueOf(Bill(i));
		double j;
		j=14.5*Bill(i)/100;
		
		JLabel label_2 = new JLabel(t);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(258, 98, 112, 21);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel(String.valueOf(j));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(258, 132, 112, 21);
		contentPane.add(label_4);
		
		JLabel lblVat = new JLabel("Vat:+14.5%");
		lblVat.setBounds(91, 132, 76, 21);
		contentPane.add(lblVat);
	}

	public int Bill(int i)
	{
		int Food_Bill=0;
		switch(i)
		{
		case 0:{
			Food_Bill=150;
			break;
		}

		case 1:{
			Food_Bill=150;
			break;
		}
		case 2:{
			Food_Bill=100;
			break;
		}
		case 3:{
			Food_Bill=100;
			break;
		}
		case 4:{
			Food_Bill=150;
			break;
		}
		case 5:{
			Food_Bill=150;
			break;
		}
		}
		return Food_Bill;
		
	}
}
