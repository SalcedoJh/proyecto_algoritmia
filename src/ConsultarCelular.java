import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarCelular extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAlmacenamiento;
	private JLabel lblBateria;
	private JLabel lblCamara;
	private JTextField txtPrecio;
	private JTextField txtAlmacenamiento;
	private JTextField txtBateria;
	private JTextField txtCamara;
	private JButton btnCerrar;
	private JComboBox cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarCelular frame = new ConsultarCelular();
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
	public ConsultarCelular() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setFrameIcon(new ImageIcon(ConsultarCelular.class.getResource("/imagen/consultar.png")));
		
		setTitle("Consultar Celular");
		setBounds(100, 100, 519, 201);
		getContentPane().setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0, 0, 503, 144);
		getContentPane().add(contentPane);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblModelo.setBounds(10, 11, 142, 14);
		contentPane.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (s/)");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(10, 36, 142, 14);
		contentPane.add(lblPrecio);
		
		lblAlmacenamiento = new JLabel("Almacenamiento (MB)");
		lblAlmacenamiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlmacenamiento.setBounds(10, 63, 166, 14);
		contentPane.add(lblAlmacenamiento);
		
		lblBateria = new JLabel("Batería (mAh)");
		lblBateria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBateria.setBounds(10, 86, 142, 14);
		contentPane.add(lblBateria);
		
		lblCamara = new JLabel("Cámara (MP)");
		lblCamara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCamara.setBounds(10, 111, 142, 14);
		contentPane.add(lblCamara);
		
		txtPrecio = new JTextField();
		txtPrecio.setText("330.0");
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(186, 37, 201, 20);
		contentPane.add(txtPrecio);
		
		txtAlmacenamiento = new JTextField();
		txtAlmacenamiento.setText("256.0");
		txtAlmacenamiento.setEditable(false);
		txtAlmacenamiento.setColumns(10);
		txtAlmacenamiento.setBounds(186, 62, 201, 20);
		contentPane.add(txtAlmacenamiento);
		
		txtBateria = new JTextField();
		txtBateria.setText("5000.0");
		txtBateria.setEditable(false);
		txtBateria.setColumns(10);
		txtBateria.setBounds(186, 87, 201, 20);
		contentPane.add(txtBateria);
		
		txtCamara = new JTextField();
		txtCamara.setText("200.0");
		txtCamara.setEditable(false);
		txtCamara.setColumns(10);
		txtCamara.setBounds(186, 112, 201, 20);
		contentPane.add(txtCamara);
		
		btnCerrar = new JButton("cerrar");
		btnCerrar.addActionListener(e -> dispose());
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(404, 13, 89, 23);
		contentPane.add(btnCerrar);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Xiaomi Redmi Note 15 Pro 5G", "Samsung Galaxy A56 5G", "POCO X8 Pro", "Google Pixel 10a", "Honor Magic7 Lite", "Vivo V70 FE"}));
		cboModelo.setBounds(186, 11, 201, 22);
		contentPane.add(cboModelo);
		
		mostrar(Celulares.precio0, Celulares.almacenamiento0, Celulares.bateria0, Celulares.camara0);

	}
	public void actionPerformed(ActionEvent e) {
		actionPerformedCboModelo(e);
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		
		int celularIndex = cboModelo.getSelectedIndex();
		
		switch (celularIndex) {
		case 0 : mostrar(Celulares.precio0, Celulares.almacenamiento0, Celulares.bateria0, Celulares.camara0); break;
		case 1 : mostrar(Celulares.precio1, Celulares.almacenamiento1, Celulares.bateria1, Celulares.camara1); break;
		case 2 : mostrar(Celulares.precio2, Celulares.almacenamiento2, Celulares.bateria2, Celulares.camara2); break;
		case 3 : mostrar(Celulares.precio3, Celulares.almacenamiento3, Celulares.bateria3, Celulares.camara3); break;
		case 4 : mostrar(Celulares.precio4, Celulares.almacenamiento4, Celulares.bateria4, Celulares.camara4); break;
		case 5 : mostrar(Celulares.precio5, Celulares.almacenamiento5, Celulares.bateria5, Celulares.camara5);
		}
	}
	void mostrar(double pre, double almc, double bat, double cam) {
		txtPrecio.setText(String.valueOf(pre));
		txtAlmacenamiento.setText(String.valueOf(almc));
		txtBateria.setText(String.valueOf(bat));
		txtCamara.setText(String.valueOf(cam));
	}
	

}
