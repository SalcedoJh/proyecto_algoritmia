import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ListadoDeCelulares extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListadoDeCelulares.class.getResource("/imagen/listar.png")));
		setTitle("Listado de Celulares");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 280);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(111, 305, 89, 23);
		contentPane.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(225, 305, 89, 23);
		contentPane.add(btnListar);


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
		txtS.append(String.format("\n%-18s : %s\n", "Modelo", mod));
		txtS.append(String.format("%-18s : %.2f\n", "Precio $", pre));
		txtS.append(String.format("%-18s : %.0f\n", "Almacenamiento MB", almc));
		txtS.append(String.format("%-18s : %.0f\n", "Bateria mAh", bat));
		txtS.append(String.format("%-18s : %.0f\n", "Camara MP", cam));
	}
}
