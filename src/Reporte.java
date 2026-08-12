import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Reporte extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea txtReporte;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reporte frame = new Reporte();
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
	public Reporte() {
		setFrameIcon(new ImageIcon(Reporte.class.getResource("/imagen/reporte.png")));
		setTitle("Reporte");
		setBounds(100, 100, 441, 366);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("REPORTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(190, 11, 84, 21);
		getContentPane().add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 49, 363, 228);
		getContentPane().add(scrollPane);
		
		txtReporte = new JTextArea();
		txtReporte.setEditable(false);
		txtReporte.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(216, 288, 89, 23);
		btnCerrar.addActionListener(e -> dispose());
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(106, 288, 89, 23);
		getContentPane().add(btnListar);

	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		listar();
	}
	void listar() {
		txtReporte.setText("REPORTE DE VENTA\n\n");
		txtReporte.append(String.format("\n%-30s : %d",Celulares.modelo0, Celulares.cant0)+" und");
		txtReporte.append(String.format("\n%-30s : %d",Celulares.modelo1, Celulares.cant1)+" und");
		txtReporte.append(String.format("\n%-30s : %d",Celulares.modelo2, Celulares.cant2)+" und");
		txtReporte.append(String.format("\n%-30s : %d",Celulares.modelo3, Celulares.cant3)+" und");
		txtReporte.append(String.format("\n%-30s : %d",Celulares.modelo4, Celulares.cant4)+" und");
		txtReporte.append(String.format("\n%-30s : %d",Celulares.modelo5, Celulares.cant5)+" und");

	}
}
