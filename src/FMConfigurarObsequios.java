import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class FMConfigurarObsequios extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public FMConfigurarObsequios() {
		setLayout(null);
		
		lblNewLabel = new JLabel("CONFIGURAR OBSEQUIOS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(92, 11, 243, 32);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("1 unidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(29, 63, 124, 14);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("2 a 5 unidades");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(29, 88, 124, 14);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("6 a más unidades");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(29, 113, 124, 14);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(163, 62, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(163, 87, 86, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(163, 112, 86, 20);
		add(textField_2);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(92, 181, 89, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(200, 181, 89, 23);
		add(btnNewButton_1);

	}

}
