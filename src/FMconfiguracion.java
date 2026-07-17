import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FMconfiguracion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblConfigurarPorcentajesDe;

	/**
	 * Create the panel.
	 */
	public FMconfiguracion() {
		setLayout(null);
		
		lblNewLabel = new JLabel("CONFIGURAR DESCUENTOS");
		lblNewLabel.setBounds(134, 11, 155, 14);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("1 a 5 unidades");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(30, 61, 142, 14);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("6 a 10 unidades");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(30, 86, 142, 14);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("11 a 15 unidades");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(30, 111, 142, 14);
		add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Más de 15 unidades");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(30, 136, 142, 14);
		add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(182, 60, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 85, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 110, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(182, 135, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(272, 63, 17, 14);
		add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(272, 88, 17, 14);
		add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(272, 113, 17, 14);
		add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("%");
		lblNewLabel_8.setBounds(272, 138, 17, 14);
		add(lblNewLabel_8);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(75, 206, 89, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(179, 206, 89, 23);
		add(btnNewButton_1);
		
		lblConfigurarPorcentajesDe = new JLabel("CONFIGURAR PORCENTAJES DE DESCUENTOS");
		lblConfigurarPorcentajesDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConfigurarPorcentajesDe.setBounds(43, 36, 377, 14);
		add(lblConfigurarPorcentajesDe);

	}
}
