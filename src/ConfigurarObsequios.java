import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JInternalFrame implements ActionListener {

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
					ConfigurarObsequios frame = new ConfigurarObsequios();
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
	public ConfigurarObsequios() {
		setFrameIcon(new ImageIcon(ConfigurarObsequios.class.getResource("/imagen/obsequio.png")));
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 188);
		getContentPane().setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0, 0, 405, 160);
		getContentPane().add(contentPane);
		
		lbl1unidad = new JLabel("1 unidad");
		lbl1unidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1unidad.setBounds(21, 32, 124, 14);
		contentPane.add(lbl1unidad);
		
		txt1unidad = new JTextField();
		txt1unidad.setText("audífonos");
		txt1unidad.setColumns(10);
		txt1unidad.setBounds(155, 31, 115, 20);
		contentPane.add(txt1unidad);
		
		txt2a5unidades = new JTextField();
		txt2a5unidades.setText("parlante bluetooth");
		txt2a5unidades.setColumns(10);
		txt2a5unidades.setBounds(155, 56, 115, 20);
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
		txt6masunidades.setText("Power bank");
		txt6masunidades.setColumns(10);
		txt6masunidades.setBounds(155, 81, 115, 20);
		contentPane.add(txt6masunidades);
		
		btnAceptarObs = new JButton("Aceptar");
		btnAceptarObs.addActionListener(this);
		btnAceptarObs.setBounds(303, 42, 89, 23);
		contentPane.add(btnAceptarObs);
		
		btnCancelarObs = new JButton("Cancelar");
		btnCancelarObs.addActionListener(this);
		btnCancelarObs.setBounds(303, 73, 89, 23);
		contentPane.add(btnCancelarObs);
		
		txt1unidad.setText(Celulares.obsequio1);
		txt2a5unidades.setText(Celulares.obsequio2);
		txt6masunidades.setText(Celulares.obsequio3);
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelarObs) {
			actionPerformedBtnCancelarObs(e);
		}
		if (e.getSource() == btnAceptarObs) {
			actionPerformedBtnAceptarObs(e);
		}
	}
	protected void actionPerformedBtnAceptarObs(ActionEvent e) {
		Celulares.obsequio1 = txt1unidad.getText();
		Celulares.obsequio2 = txt2a5unidades.getText();
		Celulares.obsequio3 = txt6masunidades.getText();
		dispose();
	}
	protected void actionPerformedBtnCancelarObs(ActionEvent e) {
		dispose();
	}
}
