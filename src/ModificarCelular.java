import java.awt.EventQueue;

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
		setTitle("Modificar Celular");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		txtPrecio.setText("Precio");
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(162, 37, 155, 20);
		contentPane.add(txtPrecio);
		
		txtAlmacenamiento = new JTextField();
		txtAlmacenamiento.setText("Almacenamiento");
		txtAlmacenamiento.setColumns(10);
		txtAlmacenamiento.setBounds(162, 62, 155, 20);
		contentPane.add(txtAlmacenamiento);
		
		txtBateria = new JTextField();
		txtBateria.setText("Bateria");
		txtBateria.setColumns(10);
		txtBateria.setBounds(162, 87, 155, 20);
		contentPane.add(txtBateria);
		
		txtCamara = new JTextField();
		txtCamara.setText("Camara");
		txtCamara.setColumns(10);
		txtCamara.setBounds(162, 112, 155, 20);
		contentPane.add(txtCamara);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 11, 89, 23);
		contentPane.add(btnCerrar);
		
		cboModelo = new JComboBox();
		cboModelo.setBounds(162, 11, 155, 22);
		contentPane.add(cboModelo);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {
				Celulares.modelo0,
				String.valueOf(Celulares.modelo1),
				String.valueOf(Celulares.modelo2),
				String.valueOf(Celulares.modelo3),
				String.valueOf(Celulares.modelo4),
				String.valueOf(Celulares.modelo5),
		}));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(335, 38, 89, 23);
		contentPane.add(btnGuardar);

	
	cboModelo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String seleccion = cboModelo.getSelectedItem().toString();
			
			if (seleccion == Celulares.modelo0) {
				txtPrecio.setText(Celulares.precio0+"");
				txtAlmacenamiento.setText(Celulares.almacenamiento0+"");
				txtBateria.setText(Celulares.bateria0+"");
				txtCamara.setText(Celulares.camara0+"");
			}
			else if (seleccion == Celulares.modelo1) {
				txtPrecio.setText(Celulares.precio1+"");
				txtAlmacenamiento.setText(Celulares.almacenamiento1+"");
				txtBateria.setText(Celulares.bateria1+"");
				txtCamara.setText(Celulares.camara1+"");
			}
			else if (seleccion == Celulares.modelo2) {
				txtPrecio.setText(Celulares.precio2+"");
				txtAlmacenamiento.setText(Celulares.almacenamiento2+"");
				txtBateria.setText(Celulares.bateria2+"");
				txtCamara.setText(Celulares.camara2+"");
			}
			else if (seleccion == Celulares.modelo3) {
				txtPrecio.setText(Celulares.precio3+"");
				txtAlmacenamiento.setText(Celulares.almacenamiento3+"");
				txtBateria.setText(Celulares.bateria3+"");
				txtCamara.setText(Celulares.camara3+"");
			}
			else if (seleccion == Celulares.modelo4) {
				txtPrecio.setText(Celulares.precio4+"");
				txtAlmacenamiento.setText(Celulares.almacenamiento4+"");
				txtBateria.setText(Celulares.bateria4+"");
				txtCamara.setText(Celulares.camara4+"");
			}
			else if (seleccion == Celulares.modelo5) {
				txtPrecio.setText(Celulares.precio5+"");
				txtAlmacenamiento.setText(Celulares.almacenamiento5+"");
				txtBateria.setText(Celulares.bateria5+"");
				txtCamara.setText(Celulares.camara5+"");
			}
		}
	});



		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
