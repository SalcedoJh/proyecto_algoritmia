import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class ListadoDeCelulares extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoDeCelulares frame = new ListadoDeCelulares();
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
	public ListadoDeCelulares() {
		setFrameIcon(new ImageIcon(ListadoDeCelulares.class.getResource("/imagen/listar.png")));
		setTitle("Listado de Celulares");
		setBounds(100, 100, 478, 490);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 437, 389);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(96, 426, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(251, 426, 89, 23);
		getContentPane().add(btnListar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("LISTADO DE CELULARES:\n");
		mostrarCelular(Celulares.modelo0, Celulares.precio0, Celulares.almacenamiento0, Celulares.bateria0, Celulares.camara0);
		mostrarCelular(Celulares.modelo1, Celulares.precio1, Celulares.almacenamiento1, Celulares.bateria1, Celulares.camara1);
		mostrarCelular(Celulares.modelo2, Celulares.precio2, Celulares.almacenamiento2, Celulares.bateria2, Celulares.camara2);
		mostrarCelular(Celulares.modelo3, Celulares.precio3, Celulares.almacenamiento3, Celulares.bateria3, Celulares.camara3);
		mostrarCelular(Celulares.modelo4, Celulares.precio4, Celulares.almacenamiento4, Celulares.bateria4, Celulares.camara4);
		mostrarCelular(Celulares.modelo5, Celulares.precio5, Celulares.almacenamiento5, Celulares.bateria5, Celulares.camara5);
		}
	
	void mostrarCelular(String mod, double pre, double almc, double bat, double cam) {
		txtS.append(String.format("\n%-20s : %s\n", "Modelo", mod));
		txtS.append(String.format("%-20s : %.2f\n", "Precio (s/)", pre));
		txtS.append(String.format("%-20s : %.0f\n", "Almacenamiento (MB)", almc));
		txtS.append(String.format("%-20s : %.0f\n", "Bateria (mAh)", bat));
		txtS.append(String.format("%-20s : %.0f\n", "Camara (MP)", cam));
	}
}
