import java.awt.BorderLayout;
import java.util.Stack;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class floto extends JFrame {

	private JPanel contentPane;
	private JTextField txtloto;
	private JTextField txtjacks;
	private JLabel lbloto2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					floto frame = new floto();
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
	public floto() {
		setTitle("Loto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGenerarNumeros = new JButton("Generar Numeros");
		btnGenerarNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   int pos;
				    int nCartas = 41;
				    
				    Stack < Integer > pCartas = new Stack < Integer > ();
				    for (int i = 0; i < 6 ; i++) {
				      pos = (int) Math.floor(Math.random() * nCartas );
				      while (pCartas.contains(pos)) {
				        pos = (int) Math.floor(Math.random() * nCartas );
				      }
				      pCartas.push(pos);
				    }
				  
			
				    txtloto.setText(pCartas.toString());
				    
				    
				    
				    
				    
				    
				    int posjack;
				    int nJack = 9;
				    
				    Stack < Integer > pJack = new Stack < Integer > ();
				    for (int i = 0; i < 2 ; i++) {
				      posjack = (int) Math.floor(Math.random() * nJack );
				      while (pJack.contains(posjack)) {
				        posjack = (int) Math.floor(Math.random() * nJack );
				      }
				      pJack.push(posjack);
				    }
				  
				   // JLabel lblNumerosquini = new JLabel(pCartas.toString());
				    txtjacks.setText(pJack.toString());
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnGenerarNumeros.setBounds(134, 194, 158, 23);
		contentPane.add(btnGenerarNumeros);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				principal vermain=new principal(); 
		         //línea 2-hacemos visible el formulario que queremos llamar 
		         vermain.setVisible(true); 
		         floto.this.setVisible(false);
				
			}
		});
		btnBack.setBounds(173, 228, 89, 23);
		contentPane.add(btnBack);
		
		txtloto = new JTextField();
		txtloto.setHorizontalAlignment(SwingConstants.CENTER);
		txtloto.setBounds(64, 119, 300, 33);
		contentPane.add(txtloto);
		txtloto.setColumns(10);
		
		txtjacks = new JTextField();
		txtjacks.setHorizontalAlignment(SwingConstants.CENTER);
		txtjacks.setBounds(173, 163, 86, 20);
		contentPane.add(txtjacks);
		txtjacks.setColumns(10);
		
		lbloto2 = new JLabel("");
		lbloto2.setBounds(64, 11, 300, 97);
		contentPane.add(lbloto2);
		ImageIcon fot = new ImageIcon(principal.class.getResource("/Imagenes/loto.jpg"));
		Icon iconoloto = new ImageIcon(fot.getImage().getScaledInstance(lbloto2.getWidth(), lbloto2.getHeight(), Image.SCALE_DEFAULT));
		lbloto2.setIcon(iconoloto);
		this.repaint();
	}

}
