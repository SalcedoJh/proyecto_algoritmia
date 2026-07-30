import java.awt.EventQueue;
import javax.swing.JOptionPane;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ModificarCelular extends JFrame implements ActionListener {

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(ModificarCelular.class.getResource("/imagen/modificar.png")));
		setTitle("Modificar Celular");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblModelo.setBounds(10, 13, 142, 14);
		contentPane.add(lblModelo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setToolTipText("");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(10, 38, 142, 14);
		contentPane.add(lblPrecio);
		
		lblAlmacenamiento = new JLabel("Almacenamiento");
		lblAlmacenamiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlmacenamiento.setBounds(10, 63, 142, 14);
		contentPane.add(lblAlmacenamiento);
		
		lblBateria = new JLabel("Batería");
		lblBateria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBateria.setBounds(10, 88, 142, 14);
		contentPane.add(lblBateria);
		
		lblCamara = new JLabel("Cámara");
		lblCamara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCamara.setBounds(10, 113, 142, 14);
		contentPane.add(lblCamara);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(162, 37, 155, 20);
		contentPane.add(txtPrecio);
		
		txtAlmacenamiento = new JTextField();
		txtAlmacenamiento.setColumns(10);
		txtAlmacenamiento.setBounds(162, 62, 155, 20);
		contentPane.add(txtAlmacenamiento);
		
		txtBateria = new JTextField();
		txtBateria.setColumns(10);
		txtBateria.setBounds(162, 87, 155, 20);
		contentPane.add(txtBateria);
		
		txtCamara = new JTextField();
		txtCamara.setColumns(10);
		txtCamara.setBounds(162, 112, 155, 20);
		contentPane.add(txtCamara);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(e -> dispose());
		btnCerrar.setBounds(335, 11, 89, 23);
		contentPane.add(btnCerrar);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setBounds(162, 11, 155, 22);
		contentPane.add(cboModelo);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {Celulares.modelo0, Celulares.modelo1, Celulares.modelo2, Celulares.modelo3, Celulares.modelo4, Celulares.modelo5,}));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(335, 38, 89, 23);
		contentPane.add(btnGuardar);

	
		
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
		guardar(celularIndex);
		JOptionPane.showMessageDialog(this,
	            "se modificó correctamente el modelo \n " + celularIndex,
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
