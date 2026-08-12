import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Vender extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtS;


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
		setFrameIcon(new ImageIcon(Vender.class.getResource("/imagen/verder.png")));
		setTitle("Vender");
		setBounds(100, 100, 549, 324);
		getContentPane().setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0, 0, 535, 283);
		getContentPane().add(contentPane);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 104, 506, 146);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 78, 14);
		contentPane.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (s/)");
		lblPrecio.setBounds(10, 36, 78, 14);
		contentPane.add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 78, 14);
		contentPane.add(lblCantidad);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Xiaomi Redmi Note 15 Pro 5G", "Samsung Galaxy A56 5G", "POCO X8 Pro", "Google Pixel 10a", "Honor Magic7 Lite", "Vivo V70 FE"}));
		cboModelo.setBounds(98, 7, 197, 22);
		contentPane.add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setText("330.0");
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(98, 33, 197, 22);
		contentPane.add(txtPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(98, 58, 197, 22);
		contentPane.add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(385, 7, 89, 23);
		contentPane.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(385, 32, 89, 23);
		contentPane.add(btnCerrar);
		
		mostrarPrecio(Celulares.precio0);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		int indexModelo = cboModelo.getSelectedIndex();
		switch (indexModelo) {
		case 0: mostrarPrecio(Celulares.precio0); break;
		case 1: mostrarPrecio(Celulares.precio1); break;
		case 2: mostrarPrecio(Celulares.precio2); break;
		case 3: mostrarPrecio(Celulares.precio3); break;
		case 4: mostrarPrecio(Celulares.precio4); break;
		case 5: mostrarPrecio(Celulares.precio5);
		}
	}
	
	void mostrarPrecio(double precio) {
		txtPrecio.setText(String.valueOf(precio));
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		int cantidad;
		double precio, importDesc, importCompra, importPagar;
		String modelo, obsequios;
		int indexModelo = cboModelo.getSelectedIndex();
		
		cantidad = Integer.parseInt(txtCantidad.getText());
		precio = Double.parseDouble(txtPrecio.getText());
		modelo = cboModelo.getSelectedItem().toString();
		
		
		importCompra = precio * cantidad;
		
		if (cantidad>=1 && cantidad<=5)
			importDesc = importCompra*(Celulares.porcentaje1/100);
		else if (cantidad>=6 && cantidad<=10) 
			importDesc = importCompra*(Celulares.porcentaje2/100);
		else if (cantidad>=11 && cantidad<=15) 
			importDesc = importCompra*(Celulares.porcentaje3/100);
		else  
			importDesc = importCompra*(Celulares.porcentaje4/100);
		
		importPagar = importCompra - importDesc;
		
		if (cantidad == 1) obsequios = Celulares.obsequio1;
		else if (cantidad>=2 && cantidad<=5) obsequios = Celulares.obsequio2;
		else obsequios = Celulares.obsequio3;
		
		
		txtS.setText("BOLETA DE VENTA\n\n");
		txtS.append(String.format("%-20s : %s","Modelo", modelo));
		txtS.append(String.format("\n%-20s : %.2f","Precio", precio));
		txtS.append(String.format("\n%-20s : %d","Cantidad", cantidad));
		txtS.append(String.format("\n%-20s : %.2f","Importe Compra", importCompra));
		txtS.append(String.format("\n%-20s : %.2f","Importe Descuento", importDesc));
		txtS.append(String.format("\n%-20s : %.2f","Importe a Pagar", importPagar));
		txtS.append(String.format("\n%-20s : %s","Obsequio", obsequios));
		
		Celulares.contadorVentas ++;
		Celulares.importeTotalAcumulado +=importPagar;
		if (Celulares.contadorVentas %5==0) {
			double porcentajeCuota = (Celulares.importeTotalAcumulado/Celulares.cuotaDiaria)*100;
			String mensaje = String.format(
		            "Venta Nro. %d\n" +
		            "Importe total general acumulado : S/. %.2f\n" +
		            "Porcentaje de la cuota diaria : %.2f%%",
		            Celulares.contadorVentas, Celulares.importeTotalAcumulado, porcentajeCuota
		            );
			JOptionPane.showMessageDialog(this,
			mensaje ,
			"Avance de ventas",
            JOptionPane.INFORMATION_MESSAGE);
		}
		
		contador(indexModelo, cantidad);
		borrar();
	}
	void borrar() {
		txtCantidad.setText("");
	}
	void contador(int cel, int cant) {
		switch (cel) {
		case 0: Celulares.cant0 += cant; break;
		case 1: Celulares.cant1 += cant; break;
		case 2: Celulares.cant2 += cant; break;
		case 3: Celulares.cant3 += cant; break;
		case 4: Celulares.cant4 += cant; break;
		case 5: Celulares.cant5 += cant;
		}
	}
	
}
