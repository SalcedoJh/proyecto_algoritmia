import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Vender extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 104, 414, 146);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		contentPane.add(lblModelo);
		
		lblPrecio = new JLabel("Precio ($)");
		lblPrecio.setBounds(10, 36, 46, 14);
		contentPane.add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 46, 14);
		contentPane.add(lblCantidad);
		
		cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {
				Celulares.modelo0,
				String.valueOf(Celulares.modelo1),
				String.valueOf(Celulares.modelo2),
				String.valueOf(Celulares.modelo3),
				String.valueOf(Celulares.modelo4),
				String.valueOf(Celulares.modelo5),
		}));
		cboModelo.setBounds(98, 7, 154, 22);
		contentPane.add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(98, 33, 154, 22);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(98, 58, 154, 22);
		contentPane.add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(335, 7, 89, 23);
		contentPane.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 32, 89, 23);
		contentPane.add(btnCerrar);
		
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccion = cboModelo.getSelectedItem().toString();
				
				if (seleccion == Celulares.modelo0) {
					txtPrecio.setText(Celulares.precio0+"");
				}
				else if (seleccion == Celulares.modelo1) {
					txtPrecio.setText(Celulares.precio1+"");
				}
				else if (seleccion == Celulares.modelo2) {
					txtPrecio.setText(Celulares.precio2+"");
				}
				else if (seleccion == Celulares.modelo3) {
					txtPrecio.setText(Celulares.precio3+"");
				}
				else if (seleccion == Celulares.modelo4) {
					txtPrecio.setText(Celulares.precio4+"");
				}
				else if (seleccion == Celulares.modelo5) {
					txtPrecio.setText(Celulares.precio5+"");
				}
			}
		});
		
		// salida de boleta temporal
		txtS.setText("BOLETA DE VENTA\n\n");
		txtS.append("Modelo\t\t: " + Celulares.modelo0);
		txtS.append("\nPrecio\t\t: " + Celulares.precio0);
		txtS.append("\nCantidad\t\t: 3");
		txtS.append("\nImporte Compra\t: $240");
		txtS.append("\nImporte Descuento\t: $20");
		txtS.append("\nImporte a Pagar\t: $220");
		txtS.append("\nObsequio\t\t: Banco de carga");

	}
}
