import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmConfigurarObsequios extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl1unidad;
	private JTextField txt1unidad;
	private JTextField txt2a5unidades;
	private JLabel lbl2a5unidades;
	private JLabel lbl6masunidades;
	private JTextField txt6masunidades;
	private JButton btnAceptarObs;
	private JButton btnCancelarObs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConfigurarObsequios frame = new FrmConfigurarObsequios();
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
	public FrmConfigurarObsequios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmConfigurarObsequios.class.getResource("/imagen/obsequio.png")));
		setTitle("Configurar obsequios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 421, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1unidad = new JLabel("1 unidad");
		lbl1unidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1unidad.setBounds(21, 32, 124, 14);
		contentPane.add(lbl1unidad);
		
		txt1unidad = new JTextField();
		txt1unidad.setColumns(10);
		txt1unidad.setBounds(155, 31, 86, 20);
		contentPane.add(txt1unidad);
		
		txt2a5unidades = new JTextField();
		txt2a5unidades.setColumns(10);
		txt2a5unidades.setBounds(155, 56, 86, 20);
		contentPane.add(txt2a5unidades);
		
		lbl2a5unidades = new JLabel("2 a 5 unidades");
		lbl2a5unidades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2a5unidades.setBounds(21, 57, 124, 14);
		contentPane.add(lbl2a5unidades);
		
		lbl6masunidades = new JLabel("6 a más unidades");
		lbl6masunidades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl6masunidades.setBounds(21, 82, 124, 14);
		contentPane.add(lbl6masunidades);
		
		txt6masunidades = new JTextField();
		txt6masunidades.setColumns(10);
		txt6masunidades.setBounds(155, 81, 86, 20);
		contentPane.add(txt6masunidades);
		
		btnAceptarObs = new JButton("Aceptar");
		btnAceptarObs.setBounds(303, 42, 89, 23);
		contentPane.add(btnAceptarObs);
		
		btnCancelarObs = new JButton("Cancelar");
		btnCancelarObs.addActionListener(this);
		btnCancelarObs.setBounds(303, 73, 89, 23);
		contentPane.add(btnCancelarObs);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelarObs) {
			actionPerformedBtnCancelarObs(e);
		}
	}
	protected void actionPerformedBtnCancelarObs(ActionEvent e) {
		dispose();
	}
}
