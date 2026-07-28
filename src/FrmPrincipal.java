import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrmPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmListar;
	private JMenuItem mntmVender;
	private JMenuItem mntmDescuentos;
	private JMenuItem mntmObsequios;
	private JMenuItem mntmAcerca;
	

/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultar = new JMenuItem("Consultar Celular");
		mntmConsultar.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/imagen/consultar.png")));
		mntmConsultar.addActionListener(this);
		mnMantenimiento.add(mntmConsultar);
		
		mntmModificar = new JMenuItem("Modificar Celular");
		mntmModificar.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/imagen/modificar.png")));
		mntmModificar.addActionListener(this);
		mnMantenimiento.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar Celular");
		mntmListar.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/imagen/listar.png")));
		mntmListar.addActionListener(this);
		mnMantenimiento.add(mntmListar);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/imagen/verder.png")));
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mnConfiguracion = new JMenu("Configuracion");
		menuBar.add(mnConfiguracion);
		
		mntmDescuentos = new JMenuItem("Configurar descuentos");
		mntmDescuentos.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/imagen/descuento.png")));
		mntmDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmDescuentos);
		
		mntmObsequios = new JMenuItem("Configurar obsequios");
		mntmObsequios.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/imagen/obsequio.png")));
		mntmObsequios.addActionListener(this);
		mnConfiguracion.add(mntmObsequios);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcerca = new JMenuItem("Acerca de Tienda");
		mntmAcerca.addActionListener(this);
		mnAyuda.add(mntmAcerca);
		getContentPane().setLayout(null);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		if (e.getSource() == mntmAcerca) {
			actionPerformedMntmAcerca(e);
		}
		if (e.getSource() == mntmObsequios) {
			actionPerformedMntmObsequios(e);
		}
		if (e.getSource() == mntmDescuentos) {
			actionPerformedMntmDescuentos(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListar) {
			actionPerformedMntmListar(e);
		}
		if (e.getSource() == mntmModificar) {
			actionPerformedMntmModificar(e);
		}
		if (e.getSource() == mntmConsultar) {
			actionPerformedMntmConsultar(e);
		}
	}
	protected void actionPerformedMntmConsultar(ActionEvent e) {
		ConsultarCelular mod= new ConsultarCelular();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmModificar(ActionEvent e) {
		ModificarCelular mod= new ModificarCelular();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmListar(ActionEvent e) {
		ListadoDeCelulares mod= new ListadoDeCelulares();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		Vender mod= new Vender();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmDescuentos(ActionEvent e) {
		FrmConfigurarDescuento mod= new FrmConfigurarDescuento();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmObsequios(ActionEvent e) {
		FrmConfigurarObsequios mod= new FrmConfigurarObsequios();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmAcerca(ActionEvent e) {
		FrmAcerca mod= new FrmAcerca();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
}
