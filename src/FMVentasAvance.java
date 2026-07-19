import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSlider;

public class FMVentasAvance extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNumVenta;
	private JLabel lblImporte;
	private JLabel lblPorcentaje;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMVentasAvance frame = new FMVentasAvance();
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
	public FMVentasAvance() {
		setType(Type.UTILITY);
		setTitle("Avance de Ventas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNumVenta = new JLabel("Venta Nro. 5");
		lblNumVenta.setBounds(44, 11, 104, 14);
		contentPane.add(lblNumVenta);
		
		lblImporte = new JLabel("Importe total general acumulado: $1240");
		lblImporte.setBounds(44, 36, 198, 14);
		contentPane.add(lblImporte);
		
		lblPorcentaje = new JLabel("Porcentaje de la cuota diaria: %20");
		lblPorcentaje.setBounds(44, 61, 198, 14);
		contentPane.add(lblPorcentaje);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(94, 91, 89, 23);
		contentPane.add(btnAceptar);

	}
}
