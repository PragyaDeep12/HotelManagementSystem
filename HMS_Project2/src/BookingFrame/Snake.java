package BookingFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Snake extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Snake frame = new Snake();
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
	public Snake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSnk = new JLabel("snk");
		lblSnk.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent space) {
				JOptionPane.showMessageDialog(null,"hggfhf" );
			}
		});
		lblSnk.setBounds(46, 39, 24, 14);
		contentPane.add(lblSnk);
		
		textField = new JTextField();
		
		textField.setBounds(87, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
