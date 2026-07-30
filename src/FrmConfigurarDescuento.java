import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmConfigurarDescuento extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl1a5unidades;
	private JTextField txtDesc1;
	private JLabel lblNewLabel_1;
	private JLabel lbl6a10unidades;
	private JTextField txtDesc2;
	private JLabel lblNewLabel_3;
	private JLabel lbl11a15unidades;
	private JTextField txtDesc3;
	private JLabel lblNewLabel_5;
	private JLabel lbmasde15unidades;
	private JTextField txtDesc4;
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
					FrmConfigurarDescuento frame = new FrmConfigurarDescuento();
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
	public FrmConfigurarDescuento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmConfigurarDescuento.class.getResource("/imagen/descuento.png")));
		setTitle("Configurar porcentaje de descuento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 430, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1a5unidades = new JLabel("1 a 5 unidades");
		lbl1a5unidades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1a5unidades.setBounds(10, 29, 142, 14);
		contentPane.add(lbl1a5unidades);
		
		txtDesc1 = new JTextField();
		txtDesc1.setColumns(10);
		txtDesc1.setBounds(162, 28, 86, 20);
		contentPane.add(txtDesc1);
		
		lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setBounds(252, 31, 17, 14);
		contentPane.add(lblNewLabel_1);
		
		lbl6a10unidades = new JLabel("6 a 10 unidades");
		lbl6a10unidades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl6a10unidades.setBounds(10, 54, 142, 14);
		contentPane.add(lbl6a10unidades);
		
		txtDesc2 = new JTextField();
		txtDesc2.setColumns(10);
		txtDesc2.setBounds(162, 53, 86, 20);
		contentPane.add(txtDesc2);
		
		lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setBounds(252, 56, 17, 14);
		contentPane.add(lblNewLabel_3);
		
		lbl11a15unidades = new JLabel("11 a 15 unidades");
		lbl11a15unidades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl11a15unidades.setBounds(10, 79, 142, 14);
		contentPane.add(lbl11a15unidades);
		
		txtDesc3 = new JTextField();
		txtDesc3.setColumns(10);
		txtDesc3.setBounds(162, 78, 86, 20);
		contentPane.add(txtDesc3);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(252, 81, 17, 14);
		contentPane.add(lblNewLabel_5);
		
		lbmasde15unidades = new JLabel("Más de 15 unidades");
		lbmasde15unidades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbmasde15unidades.setBounds(10, 104, 142, 14);
		contentPane.add(lbmasde15unidades);
		
		txtDesc4 = new JTextField();
		txtDesc4.setColumns(10);
		txtDesc4.setBounds(162, 103, 86, 20);
		contentPane.add(txtDesc4);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(252, 106, 17, 14);
		contentPane.add(lblNewLabel_7);
		
		btnAceptarDesc = new JButton("Aceptar");
		btnAceptarDesc.addActionListener(this);
		btnAceptarDesc.setBounds(315, 52, 89, 23);
		contentPane.add(btnAceptarDesc);
		
		btnCancelarDsc = new JButton("Cancelar");
		btnCancelarDsc.addActionListener(this);
		btnCancelarDsc.setBounds(315, 77, 89, 23);
		contentPane.add(btnCancelarDsc);
	
		
		txtDesc1.setText(Celulares.porcentaje1+"");
		txtDesc2.setText(Celulares.porcentaje2+"");
		txtDesc3.setText(Celulares.porcentaje3+"");
		txtDesc4.setText(Celulares.porcentaje4+"");

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptarDesc) {
			actionPerformedBtnAceptarDesc(e);
		}
		if (e.getSource() == btnCancelarDsc) {
			actionPerformedBtnCancelarDsc(e);
		}
	}
	protected void actionPerformedBtnCancelarDsc(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnAceptarDesc(ActionEvent e) {
		Celulares.porcentaje1 = Double.parseDouble(txtDesc1.getText());
		Celulares.porcentaje2 = Double.parseDouble(txtDesc2.getText());
		Celulares.porcentaje3 = Double.parseDouble(txtDesc3.getText());
		Celulares.porcentaje4 = Double.parseDouble(txtDesc4.getText());
		
		dispose();
	}
}
