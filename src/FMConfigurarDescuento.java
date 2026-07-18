import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FMConfigurarDescuento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textDescuento1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textDescuento2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textDescuento3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textDescuento4;
	private JLabel lblNewLabel_7;
	private JButton btnAceptarDesc;
	private JButton btnCancelarDsc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMConfigurarDescuento frame = new FMConfigurarDescuento();
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
	public FMConfigurarDescuento() {
		setTitle("Configurar porcentaje de descuento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 29, 142, 14);
		contentPane.add(lblNewLabel);
		
		textDescuento1 = new JTextField();
		textDescuento1.setColumns(10);
		textDescuento1.setBounds(162, 28, 86, 20);
		contentPane.add(textDescuento1);
		
		lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setBounds(252, 31, 17, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("6 a 10 unidades");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 54, 142, 14);
		contentPane.add(lblNewLabel_2);
		
		textDescuento2 = new JTextField();
		textDescuento2.setColumns(10);
		textDescuento2.setBounds(162, 53, 86, 20);
		contentPane.add(textDescuento2);
		
		lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setBounds(252, 56, 17, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("11 a 15 unidades");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 79, 142, 14);
		contentPane.add(lblNewLabel_4);
		
		textDescuento3 = new JTextField();
		textDescuento3.setColumns(10);
		textDescuento3.setBounds(162, 78, 86, 20);
		contentPane.add(textDescuento3);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(252, 81, 17, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Más de 15 unidades");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 104, 142, 14);
		contentPane.add(lblNewLabel_6);
		
		textDescuento4 = new JTextField();
		textDescuento4.setColumns(10);
		textDescuento4.setBounds(162, 103, 86, 20);
		contentPane.add(textDescuento4);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(252, 106, 17, 14);
		contentPane.add(lblNewLabel_7);
		
		btnAceptarDesc = new JButton("Aceptar");
		btnAceptarDesc.setBounds(315, 52, 89, 23);
		contentPane.add(btnAceptarDesc);
		
		btnCancelarDsc = new JButton("Cancelar");
		btnCancelarDsc.setBounds(315, 77, 89, 23);
		contentPane.add(btnCancelarDsc);

	}
}
