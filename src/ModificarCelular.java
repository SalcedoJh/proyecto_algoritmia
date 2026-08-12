import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ModificarCelular extends JInternalFrame implements ActionListener {

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
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarCelular frame = new ModificarCelular();
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
	public ModificarCelular() {
		setFrameIcon(new ImageIcon(ModificarCelular.class.getResource("/imagen/modificar.png")));
		setTitle("Modificar Celular");
		setBounds(100, 100, 519, 201);
		getContentPane().setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0, 0, 503, 144);
		getContentPane().add(contentPane);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblModelo.setBounds(10, 13, 142, 14);
		contentPane.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (s/)");
		lblPrecio.setToolTipText("");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(10, 38, 142, 14);
		contentPane.add(lblPrecio);
		
		lblAlmacenamiento = new JLabel("Almacenamiento (GB)");
		lblAlmacenamiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlmacenamiento.setBounds(10, 63, 155, 14);
		contentPane.add(lblAlmacenamiento);
		
		lblBateria = new JLabel("Batería (mAh)");
		lblBateria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBateria.setBounds(10, 88, 142, 14);
		contentPane.add(lblBateria);
		
		lblCamara = new JLabel("Cámara (MP)");
		lblCamara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCamara.setBounds(10, 113, 142, 14);
		contentPane.add(lblCamara);
		
		txtPrecio = new JTextField();
		txtPrecio.setText("330.0");
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(186, 37, 201, 20);
		contentPane.add(txtPrecio);
		
		txtAlmacenamiento = new JTextField();
		txtAlmacenamiento.setText("256");
		txtAlmacenamiento.setColumns(10);
		txtAlmacenamiento.setBounds(186, 62, 201, 20);
		contentPane.add(txtAlmacenamiento);
		
		txtBateria = new JTextField();
		txtBateria.setText("5000");
		txtBateria.setColumns(10);
		txtBateria.setBounds(186, 87, 201, 20);
		contentPane.add(txtBateria);
		
		txtCamara = new JTextField();
		txtCamara.setText("200");
		txtCamara.setColumns(10);
		txtCamara.setBounds(186, 112, 201, 20);
		contentPane.add(txtCamara);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Xiaomi Redmi Note 15 Pro 5G", "Samsung Galaxy A56 5G", "POCO X8 Pro", "Google Pixel 10a", "Honor Magic7 Lite", "Vivo V70 FE"}));
		cboModelo.setBounds(186, 11, 201, 22);
		contentPane.add(cboModelo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(404, 13, 89, 23);
		contentPane.add(btnCerrar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(404, 40, 89, 23);
		contentPane.add(btnGuardar);
		btnGuardar.addActionListener(this);
		btnCerrar.addActionListener(e -> dispose());
		
		mostrar(Celulares.precio0, Celulares.almacenamiento0, Celulares.bateria0, Celulares.camara0);

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
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
	
	
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		int celularIndex = cboModelo.getSelectedIndex();
		String celular = cboModelo.getSelectedItem().toString();
		
		
		
		guardar(celularIndex);
		JOptionPane.showMessageDialog(this,
	            "se modificó correctamente el modelo \n " + celular,
	            "Aviso",
	            JOptionPane.INFORMATION_MESSAGE);
		
	}
	void guardar(int celularIndex) {
	    double precio = Double.parseDouble(txtPrecio.getText());
	    double almacenamiento = Double.parseDouble(txtAlmacenamiento.getText());
	    double bateria = Double.parseDouble(txtBateria.getText());
	    double camara = Double.parseDouble(txtCamara.getText());

	    switch (celularIndex) {
	        case 0:
	            Celulares.precio0 = precio;
	            Celulares.almacenamiento0 = almacenamiento;
	            Celulares.bateria0 = bateria;
	            Celulares.camara0 = camara;
	            break;
	        case 1:
	            Celulares.precio1 = precio;
	            Celulares.almacenamiento1 = almacenamiento;
	            Celulares.bateria1 = bateria;
	            Celulares.camara1 = camara;
	            break;
	        case 2:
	            Celulares.precio2 = precio;
	            Celulares.almacenamiento2 = almacenamiento;
	            Celulares.bateria2 = bateria;
	            Celulares.camara2 = camara;
	            break;
	        case 3:
	            Celulares.precio3 = precio;
	            Celulares.almacenamiento3 = almacenamiento;
	            Celulares.bateria3 = bateria;
	            Celulares.camara3 = camara;
	            break;
	        case 4:
	            Celulares.precio4 = precio;
	            Celulares.almacenamiento4 = almacenamiento;
	            Celulares.bateria4 = bateria;
	            Celulares.camara4 = camara;
	            break;
	        case 5:
	            Celulares.precio5 = precio;
	            Celulares.almacenamiento5 = almacenamiento;
	            Celulares.bateria5 = bateria;
	            Celulares.camara5 = camara;
	            break;
	    }
	}
}
