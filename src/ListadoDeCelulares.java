import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class ListadoDeCelulares extends JFrame {

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
		setTitle("Listado de Celulares");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 280);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(111, 305, 89, 23);
		contentPane.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(225, 305, 89, 23);
		contentPane.add(btnListar);
		
		txtS.setText("LISTADO DE CELULARES:\n\n");
		txtS.append(Celulares.modelo0+"\n");
		txtS.append(Celulares.precio0+"\n");
		txtS.append(Celulares.almacenamiento0+"\n");
		txtS.append(Celulares.bateria0+"\n");
		txtS.append(Celulares.camara0+"\n");

	}
}
