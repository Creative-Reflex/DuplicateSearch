package modules;
import com.google.common.*;
import com.google.thirdparty.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("unused")
public class SearchGUI {

	private JFrame frame;
	private JTextField textField;
	
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (Exception e) {
       // handle exception
    	System.out.println("Sorry, an unexpected error occurred /n while loading user interface.");
    }
    
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchGUI window = new SearchGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()  {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Raleway Medium", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(271, 328, 119, 42);
		frame.getContentPane().add(btnNewButton);
		
		
		
		 FileChooser filechooser = new FileChooser();
		filechooser.setBounds(164, 186, 119, 31);
		frame.getContentPane().add(filechooser);
		
		JCheckBox chckbxCat = new JCheckBox("MD5");
		chckbxCat.setBounds(370, 224, 97, 23);
		frame.getContentPane().add(chckbxCat);
		
		JCheckBox chckbxSize = new JCheckBox("Size");
		chckbxSize.setBounds(176, 224, 97, 23);
		frame.getContentPane().add(chckbxSize);
		
		JCheckBox chckbxFiletype = new JCheckBox("Filetype");
		chckbxFiletype.setBounds(370, 250, 97, 23);
		frame.getContentPane().add(chckbxFiletype);
		
		JCheckBox chckbxDataCreated = new JCheckBox("Data Created");
		chckbxDataCreated.setBounds(176, 250, 119, 23);
		frame.getContentPane().add(chckbxDataCreated);
		
		JCheckBox chckbxOriginOfFile = new JCheckBox("Origin of File");
		chckbxOriginOfFile.setBounds(370, 276, 97, 23);
		frame.getContentPane().add(chckbxOriginOfFile);
		
		JCheckBox chckbxDateModified = new JCheckBox("Date Modified");
		chckbxDateModified.setBounds(176, 276, 119, 23);
		frame.getContentPane().add(chckbxDateModified);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaption);
		textField.setBounds(370, 192, 168, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchLabel = new JLabel("Type file name here (optional)");
		lblSearchLabel.setBounds(370, 158, 168, 23);
		frame.getContentPane().add(lblSearchLabel);
		
		JLabel lblStartSearching = new JLabel("Start searching for duplicates now...");
		lblStartSearching.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblStartSearching.setBounds(232, 106, 267, 55);
		frame.getContentPane().add(lblStartSearching);
		
		JLabel lblFolderStatus = new JLabel();
		lblFolderStatus.setBounds(152, 161, 143, 14);
		frame.getContentPane().add(lblFolderStatus);
		
		
		
		
	
	}
	 
	
}

