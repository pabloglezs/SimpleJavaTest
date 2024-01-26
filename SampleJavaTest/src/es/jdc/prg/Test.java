package es.jdc.prg;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {
	
	private int numPregunta = 0;
	private List<Pregunta> preguntas;
	private ArrayList<Integer> preguntasYaPreguntadas;
	private Usuario user;

	private JPanel contentPane;

	public void setUser(Usuario user) {
		this.user = user;
	}


	public Test() {
		
		PreguntaDAO pr = new PreguntaDAO();
		preguntas = pr.getPreguntas();
		preguntasYaPreguntadas = new ArrayList<Integer>();
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pregunta = new JLabel("PREGUNTA");
		pregunta.setBounds(41, 61, 770, 95);
		contentPane.add(pregunta);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(41, 186, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(41, 309, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JButton siguiente = new JButton("Siguiente");
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preguntaAleatoria();
			}
		});
		siguiente.setBounds(41, 491, 109, 34);
		contentPane.add(siguiente);
	}
	
	
	public void preguntaAleatoria() {
		
		int max = preguntas.size();
		int random = new Random().nextInt(max-1)+1;
		preguntasYaPreguntadas.add(random);
		System.out.println(random);
		
		System.out.println(preguntas.get(random).toString());
		
		RespuestaDAO rd = new RespuestaDAO();
		List<Respuesta> respuestasCorrespondientes = rd.obtenerRespuestasPorPregunta((long)random);
		System.out.println(respuestasCorrespondientes.toString());
		
		
		
	}


	
	
	
	
	
}
