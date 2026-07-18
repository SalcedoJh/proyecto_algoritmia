import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class FMListadoDeCelulares extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMListadoDeCelulares frame = new FMListadoDeCelulares();
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
	public FMListadoDeCelulares() {
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
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(111, 305, 89, 23);
		contentPane.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(225, 305, 89, 23);
		contentPane.add(btnListar);
		
		textArea.setText("LISTADO DE CELULARES:\n\n");
		textArea.append(Celulares.modelo0+"\n");
		textArea.append(Celulares.precio0+"\n");
		textArea.append(Celulares.almacenamiento0+"\n");
		textArea.append(Celulares.bateria0+"\n");
		textArea.append(Celulares.camara0+"\n");

	}
}
