import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class MainWindow {



	private JFrame frmKalkulator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmKalkulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


		});
	}


	public MainWindow() {
		initialize();
	}


	private void initialize() {
		frmKalkulator = new JFrame();
		frmKalkulator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmKalkulator.setMinimumSize(new Dimension(800, 600));
		frmKalkulator.setTitle("Kalkulator");
		frmKalkulator.setBounds(100, 100, 450, 300);
		frmKalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKalkulator.getContentPane().setLayout(null);
		
		JLabel lblKalkulatorWersja = new JLabel("Kalkulator wersja 2.0");
		lblKalkulatorWersja.setBounds(67, 34, 184, 94);
		frmKalkulator.getContentPane().add(lblKalkulatorWersja);
		
		JTextArea txtrOutput = new JTextArea();
		txtrOutput.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrOutput.setBounds(12, 232, 758, 292);
		frmKalkulator.getContentPane().add(txtrOutput);
		
		JButton btnPobierzDane = new JButton("Pobierz dane");
		btnPobierzDane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {

				Szczecinska3133.skan();
				txtrOutput.setText(Szczecinska3133.wyniki);
		
			}
		});
	
	
		btnPobierzDane.setBounds(263, 69, 219, 25);
		frmKalkulator.getContentPane().add(btnPobierzDane);
		

	}
}
