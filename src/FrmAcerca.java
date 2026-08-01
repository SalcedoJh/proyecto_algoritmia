import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmAcerca extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnCerrarAcer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAcerca frame = new FrmAcerca();
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
	public FrmAcerca() {
		setTitle("Acerca de Tienda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setBounds(132, 11, 167, 50);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Autores");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(175, 75, 80, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("SALCEDO HUAMANI Jhomerson");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel_2.setBounds(111, 102, 250, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("INCHAUSTEGUI AGREDA Yeison Arnildo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel_3.setBounds(80, 127, 299, 14);
		contentPane.add(lblNewLabel_3);
		
		btnCerrarAcer = new JButton("Cerrar");
		btnCerrarAcer.addActionListener(this);
		btnCerrarAcer.setBounds(175, 196, 89, 23);
		contentPane.add(btnCerrarAcer);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrarAcer) {
			actionPerformedBtnCerrarAcer(e);
		}
	}
	protected void actionPerformedBtnCerrarAcer(ActionEvent e) {
		dispose();
	}
}
