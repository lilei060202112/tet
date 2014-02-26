package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestGUI {

	private JFrame frame;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
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
	public TestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(173, 51, 120, 44);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		//final:�ڲ���ʹ���ⲿ�ඨ��ı�������ע��Ҫ��final��
		final JLabel lblMessage = new JLabel("Enter Your Name");
		lblMessage.setBounds(189, 177, 126, 24);
		frame.getContentPane().add(lblMessage);
		
		JButton btnSubmit = new JButton("New button");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("Hello "+txtName.getText()+" !");
			}
		});
		btnSubmit.setBounds(189, 124, 93, 30);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("��Բ", Font.PLAIN, 18));
		lblName.setBounds(125, 57, 46, 30);
		frame.getContentPane().add(lblName);
		
	}
}
