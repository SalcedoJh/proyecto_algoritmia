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
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.UIManager;
import java.awt.Canvas;
import javax.swing.JTextArea;



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
	private JDesktopPane escritorio;
	private JMenuItem mntmReporte;
	private JLabel icono;
	

/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
		setBounds(100, 100, 660, 620);
		
		menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
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
		mnVentas.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/imagen/verder.png")));
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmReporte = new JMenuItem("Reporte");
		mntmReporte.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/imagen/reporte.png")));
		mntmReporte.addActionListener(this);
		mnVentas.add(mntmReporte);
		
		mnConfiguracion = new JMenu("Configuracion");
		mnConfiguracion.setFont(new Font("Segoe UI", Font.PLAIN, 16));
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
		mnAyuda.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnAyuda);
		
		mntmAcerca = new JMenuItem("Acerca de Tienda");
		mntmAcerca.addActionListener(this);
		mnAyuda.add(mntmAcerca);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		escritorio = new JDesktopPane();
		escritorio.setBackground(UIManager.getColor("Button.light"));
		getContentPane().add(escritorio, "name_240227535591700");
		
		icono = new JLabel("");
		
		Image img = new ImageIcon(
			    this.getClass().getResource("/imagen/logo.jpeg")
			).getImage();

		icono.setIcon(new ImageIcon(img));
		icono.setBounds(86, 0, 481, 448);
		escritorio.add(icono);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmReporte) {
			actionPerformedMntmReporte(e);
		}
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
		Dimension desktopSize = escritorio.getSize();
		Dimension FrameSize = mod.getSize();
		mod.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
		escritorio.add(mod);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmModificar(ActionEvent e) {
		ModificarCelular mod= new ModificarCelular();
		Dimension desktopSize = escritorio.getSize();
		Dimension FrameSize = mod.getSize();
		mod.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
		escritorio.add(mod);
		//mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmListar(ActionEvent e) {
		ListadoDeCelulares mod= new ListadoDeCelulares();
		Dimension desktopSize = escritorio.getSize();
		Dimension FrameSize = mod.getSize();
		mod.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
		escritorio.add(mod);
		//mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		Vender mod= new Vender();
		Dimension desktopSize = escritorio.getSize();
		Dimension FrameSize = mod.getSize();
		mod.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
		escritorio.add(mod);
		//mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmDescuentos(ActionEvent e) {
		ConfigurarDescuento mod= new ConfigurarDescuento();
		Dimension desktopSize = escritorio.getSize();
		Dimension FrameSize = mod.getSize();
		mod.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
		escritorio.add(mod);
		//mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmObsequios(ActionEvent e) {
		ConfigurarObsequios mod= new ConfigurarObsequios();
		Dimension desktopSize = escritorio.getSize();
		Dimension FrameSize = mod.getSize();
		mod.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
		escritorio.add(mod);
		//mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmAcerca(ActionEvent e) {
		Acerca mod= new Acerca();
		Dimension desktopSize = escritorio.getSize();
		Dimension FrameSize = mod.getSize();
		mod.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
		escritorio.add(mod);
		//mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	protected void actionPerformedMntmReporte(ActionEvent e) {
		Reporte mod= new Reporte();
		Dimension desktopSize = escritorio.getSize();
		Dimension FrameSize = mod.getSize();
		mod.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
		escritorio.add(mod);
		//mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
}
