package javaproject_ageOfAntHill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class SaveManager {
	private static final String DEFAULT_FILENAME = "files/save.aoa";
	private String filename;
	private Save[] saves;
	
	public SaveManager(){
		this.filename = DEFAULT_FILENAME;
	}
	
	

	public SaveManager(String filename){
		this.filename = filename;
	}
	
	public void readSaves(){
		//Reading the file
		LinkedList<String> saves = new LinkedList<String>();
		try {
		    BufferedReader in = new BufferedReader(new FileReader(this.filename));
		    String str;
		    
		    while ((str = in.readLine()) != null) {
		        saves.add(str);
		    }
		    in.close();
		} catch (IOException e) {
			System.out.println("Error reading file : " + e);
			return;
		}
		
		
		//Parsing the output
		
		
		
		
		System.out.println();
	
		return;
	}
	
	public String listSaves() {
		String ret = "";
		for(Save elem : this.saves){
			ret += elem.getName() + "\n";
		}
		return ret;
	}
	
}
