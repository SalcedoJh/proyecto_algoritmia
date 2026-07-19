import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class FMAcercaDe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTienda;
	private JLabel lblAutores;
	private JLabel lblName1;
	private JLabel lblName2;
	private JLabel lblName3;
	private JSeparator separator;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMAcercaDe frame = new FMAcercaDe();
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
	public FMAcercaDe() {
		setTitle("Acerca de la tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTienda = new JLabel("Tienda");
		lblTienda.setFont(new Font("Arial", Font.BOLD, 44));
		lblTienda.setBounds(124, 11, 150, 49);
		contentPane.add(lblTienda);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Arial", Font.BOLD, 26));
		lblAutores.setBounds(153, 74, 104, 31);
		contentPane.add(lblAutores);
		
		lblName1 = new JLabel("Jhomerson Salcedo");
		lblName1.setFont(new Font("Arial", Font.BOLD, 16));
		lblName1.setBounds(124, 116, 162, 26);
		contentPane.add(lblName1);
		
		lblName2 = new JLabel("Yeison Inchustegui");
		lblName2.setFont(new Font("Arial", Font.BOLD, 16));
		lblName2.setBounds(124, 148, 162, 26);
		contentPane.add(lblName2);
		
		lblName3 = new JLabel("Webb Ruiz");
		lblName3.setFont(new Font("Arial", Font.BOLD, 16));
		lblName3.setBounds(158, 185, 95, 26);
		contentPane.add(lblName3);
		
		separator = new JSeparator();
		separator.setBounds(10, 61, 414, 2);
		contentPane.add(separator);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(161, 227, 89, 23);
		contentPane.add(btnCerrar);

	}
}
