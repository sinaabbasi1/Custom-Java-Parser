import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;

public class FrameGUI extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtrPublicClassExample;
	private JScrollPane scrollPane_1;
	private JTextArea textArea_1;
	private JScrollPane scrollPane_2;
	private JTextArea textArea_2;
	private JLabel lblNewLabel;
	private JLabel lblScanner;
	private JLabel lblParser;
	private JButton btnNewButton;
	private JScrollPane scrollPane_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGUI frame = new FrameGUI();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					//e.printStackTrace();
				}
			}
		});
	}

	// Functions
	public void makeInput(String inputString) {

		BufferedWriter bw = null;
		try {
			String mycontent = inputString;
			// Specify the file name and path here
			File file = new File("input.in");

			/*
			 * This logic will make sure that the file gets created if it is not present at
			 * the specified location
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(mycontent);
//			System.out.println("File written Successfully");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}

	public void parser() {

		PrintStream out = new PrintStream(new TextAreaOutputStream(textArea_2));
		// redirect standard output stream to the TextAreaOutputStream
		System.setOut(out);
		// redirect standard error stream to the TextAreaOutputStream
		System.setErr(out);
		// now test the mechanism
//		System.out.println("Hello World");

		try {
			if (textArea.getText().isBlank()) {
				// read code area
				String a = txtrPublicClassExample.getText();
				makeInput(a);
				String[] input = { "input.in" };
				JavaParser.main(input);
			} else {
				String b = textArea.getText();
				String[] input_2 = {b};
				JavaParser.main(input_2);
			}
//			String[] input = { "C:\\Users\\sinaa\\Desktop\\Project\\input.in" };
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	public void scanner() {

		PrintStream out = new PrintStream(new TextAreaOutputStream(textArea_1));
		// redirect standard output stream to the TextAreaOutputStream
		System.setOut(out);
		// redirect standard error stream to the TextAreaOutputStream
		System.setErr(out);
		// now test the mechanism
//		System.out.println("Hello World");

		try {
			if (textArea.getText().isBlank()) {
				// read code area
				String a = txtrPublicClassExample.getText();
				makeInput(a);
				String[] input = { "input.in" };
				Scanner.main(input);
			} else {
				String b = textArea.getText();
				String[] input_2 = {b};
				Scanner.main(input_2);
			}
//			String[] input = { "C:\\Users\\sinaa\\Desktop\\Project\\input.in" };
			
//			Example.main(null);
		} catch (Exception e1) {
			//e1.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public FrameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1017, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 71, 450, 322);
		contentPane.add(scrollPane);

		txtrPublicClassExample = new JTextArea();
		scrollPane.setViewportView(txtrPublicClassExample);
		txtrPublicClassExample.setTabSize(4);
		txtrPublicClassExample.setText(
				"public class Example {\r\n\r\n\tpublic static void main(String[] args) {\r\n\t\t\r\n\t\t\r\n\t}\r\n}");
		txtrPublicClassExample.setFont(new Font("Monospaced", Font.PLAIN, 15));

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(518, 39, 473, 263);
		contentPane.add(scrollPane_1);

		textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea_1.setTabSize(4);
		textArea_1.setEditable(false);

		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(518, 334, 473, 261);
		contentPane.add(scrollPane_2);

		textArea_2 = new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea_2.setTabSize(4);
		textArea_2.setEditable(false);

		lblNewLabel = new JLabel("Code Area");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 22));
		lblNewLabel.setBounds(155, 11, 155, 40);
		contentPane.add(lblNewLabel);

		lblScanner = new JLabel("Scanner");
		lblScanner.setHorizontalAlignment(SwingConstants.CENTER);
		lblScanner.setFont(new Font("Consolas", Font.BOLD, 22));
		lblScanner.setBounds(518, 0, 117, 40);
		contentPane.add(lblScanner);

		lblParser = new JLabel("Parser");
		lblParser.setHorizontalAlignment(SwingConstants.CENTER);
		lblParser.setFont(new Font("Consolas", Font.BOLD, 22));
		lblParser.setBounds(518, 296, 117, 40);
		contentPane.add(lblParser);

		btnNewButton = new JButton("GENERATE");
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parser();
				scanner();
			}

		});
		btnNewButton.setBounds(186, 549, 124, 46);
		contentPane.add(btnNewButton);

		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(36, 491, 450, 47);
		contentPane.add(scrollPane_3);

		textArea = new JTextArea();
		scrollPane_3.setViewportView(textArea);
		textArea.setTabSize(4);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));

		lblNewLabel_1 = new JLabel("You can type your code here...");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(108, 37, 276, 28);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("You can enter the address of input file in here...");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(64, 439, 422, 28);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("OR");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Consolas", Font.BOLD, 30));
		lblNewLabel_3.setBounds(8, 438, 69, 34);
		contentPane.add(lblNewLabel_3);
	}
}
