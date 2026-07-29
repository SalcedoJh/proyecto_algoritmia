import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;

public class ConsultarCelular extends JFrame implements ActionListener{

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConsultarCelular.class.getResource("/imagen/consultar.png")));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Consultar Celular");
		setBounds(100, 100, 450, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblModelo.setBounds(10, 11, 142, 14);
		contentPane.add(lblModelo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(10, 36, 142, 14);
		contentPane.add(lblPrecio);
		
		lblAlmacenamiento = new JLabel("Almacenamiento");
		lblAlmacenamiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlmacenamiento.setBounds(10, 61, 142, 14);
		contentPane.add(lblAlmacenamiento);
		
		lblBateria = new JLabel("Batería");
		lblBateria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBateria.setBounds(10, 86, 142, 14);
		contentPane.add(lblBateria);
		
		lblCamara = new JLabel("Cámara");
		lblCamara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCamara.setBounds(10, 111, 142, 14);
		contentPane.add(lblCamara);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(162, 35, 155, 20);
		contentPane.add(txtPrecio);
		
		txtAlmacenamiento = new JTextField();
		txtAlmacenamiento.setEditable(false);
		txtAlmacenamiento.setColumns(10);
		txtAlmacenamiento.setBounds(162, 60, 155, 20);
		contentPane.add(txtAlmacenamiento);
		
		txtBateria = new JTextField();
		txtBateria.setEditable(false);
		txtBateria.setColumns(10);
		txtBateria.setBounds(162, 85, 155, 20);
		contentPane.add(txtBateria);
		
		txtCamara = new JTextField();
		txtCamara.setEditable(false);
		txtCamara.setColumns(10);
		txtCamara.setBounds(162, 110, 155, 20);
		contentPane.add(txtCamara);
		
		btnCerrar = new JButton("cerrar");
		btnCerrar.addActionListener(e -> dispose());
		btnCerrar.setBounds(335, 9, 89, 23);
		contentPane.add(btnCerrar);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {Celulares.modelo0, Celulares.modelo1, Celulares.modelo2, Celulares.modelo3, Celulares.modelo4, Celulares.modelo5,}));
		cboModelo.setBounds(162, 9, 155, 22);
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
