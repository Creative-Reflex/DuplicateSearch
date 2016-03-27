package modules;
//Kleston Masters
//Source code for folder search partially from: 
//http://stackoverflow.com/questions/10083447/selecting-folder-destination-in-java
//written in part by: npinti (on Stackoverflow.com)
//adapted for DuplicateFinder project. (No need reinventing the wheel).

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;


@SuppressWarnings("unused")
public class FileChooser extends JPanel
   implements ActionListener {
   	private static final long serialVersionUID = 7963965039008617603L;
   	static protected String folderName;
   	protected int folderSelected = 0;//this is set to 1 in the IF function if a folder is chosen.
   	JButton goSelect;

   JFileChooser chooser;
   String choosertitle;

  public FileChooser() {
    goSelect = new JButton("Select folder");
    goSelect.addActionListener(this);
    add(goSelect);
   }

  public void actionPerformed(ActionEvent e) {            
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
    	folderSelected = 1;
    	chooser.getCurrentDirectory();
    }
    else {
      System.out.println("No Selection ");
      }
     }
  
  	
  	

  public String getFolderName() {
	  
	  
	  if(folderSelected == 1){
		  folderName = chooser.getCurrentDirectory().toString();
		  
		  return folderName ;
	  }
	  return folderName = "No folder selected";
  }
  
  public void setFolderName(String folderName){
	  this.folderName = folderName;
	  
  }
 

public Dimension getPreferredSize(){
    return new Dimension(200, 200);
    } 


}
