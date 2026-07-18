import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FMConfigurarObsequios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textObsequio1;
	private JTextField textObsequio2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textObsequio3;
	private JButton btnAceptarObs;
	private JButton btnCancelarObs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMConfigurarObsequios frame = new FMConfigurarObsequios();
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
	public FMConfigurarObsequios() {
		setTitle("Configurar obsequios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("1 unidad");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(21, 32, 124, 14);
		contentPane.add(lblNewLabel);
		
		textObsequio1 = new JTextField();
		textObsequio1.setColumns(10);
		textObsequio1.setBounds(155, 31, 86, 20);
		contentPane.add(textObsequio1);
		
		textObsequio2 = new JTextField();
		textObsequio2.setColumns(10);
		textObsequio2.setBounds(155, 56, 86, 20);
		contentPane.add(textObsequio2);
		
		lblNewLabel_1 = new JLabel("2 a 5 unidades");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 57, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("6 a más unidades");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(21, 82, 124, 14);
		contentPane.add(lblNewLabel_2);
		
		textObsequio3 = new JTextField();
		textObsequio3.setColumns(10);
		textObsequio3.setBounds(155, 81, 86, 20);
		contentPane.add(textObsequio3);
		
		btnAceptarObs = new JButton("Aceptar");
		btnAceptarObs.setBounds(303, 42, 89, 23);
		contentPane.add(btnAceptarObs);
		
		btnCancelarObs = new JButton("Cancelar");
		btnCancelarObs.setBounds(303, 73, 89, 23);
		contentPane.add(btnCancelarObs);

	}

}
