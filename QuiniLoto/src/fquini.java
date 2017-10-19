import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Stack;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;



public class fquini extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnBack;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fquini frame = new fquini();
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
	public fquini() {
		setTitle("Quini ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btgenerarquini = new JButton("Generar Numeros");
		btgenerarquini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//boton generar quini
				
			    int pos;
			    int nCartas = 44;
			    
			    Stack < Integer > pCartas = new Stack < Integer > ();
			    for (int i = 0; i < 6 ; i++) {
			      pos = (int) Math.floor(Math.random() * nCartas );
			      while (pCartas.contains(pos)) {
			        pos = (int) Math.floor(Math.random() * nCartas );
			      }
			      pCartas.push(pos);
			    }
			  
			   // JLabel lblNumerosquini = new JLabel(pCartas.toString());
			    textField.setText(pCartas.toString());
				
				
				
				
				
				
				
			} //void action performed
		});
		btgenerarquini.setBounds(129, 196, 159, 23);
		contentPane.add(btgenerarquini);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Strenuous", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(82, 137, 248, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal vermain=new principal(); 
		         //línea 2-hacemos visible el formulario que queremos llamar 
		         vermain.setVisible(true); 
		         fquini.this.setVisible(false);
				
				
			}
		});
		btnBack.setBounds(160, 228, 89, 23);
		contentPane.add(btnBack);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(fquini.class.getResource("/Imagenes/quini6.png")));
		label.setBounds(41, 0, 327, 126);
		contentPane.add(label);
	}
}
