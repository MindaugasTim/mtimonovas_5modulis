package bites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class medus {

	private static final String input = "input.txt";
	private static final String output = "output.txt";
	
	public static void main(String[] args) {
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			br = new BufferedReader(new FileReader(input));
			String line = null, vyd;
			fw = new FileWriter(output);
			
			int kg = 0, lietDien = 0, palankDien = 0; double vid = 0;
			
			int tempD, tempN;
			String[] temper = new String[3];
			
			
			int n = Integer.parseInt(br.readLine());
			while ((line = br.readLine()) != null) {
				if(line.startsWith("1")){
					temper = line.split(" ");
					tempD = Integer.parseInt(temper[1]);
					tempN = Integer.parseInt(temper[2]);
					if(tempD>25&&tempN>16){
						kg++; 
					}
					if(tempD<21&&tempN<=14){
						kg+=2; 
					}
					if(tempD>=21&&tempD<=25&&tempN>=14&&tempN<=16){
						kg+=3; palankDien++; 
					}
				}
				if(line.startsWith("0")){
					lietDien++; 
				}
			}
			vid = (double)kg / (double)n;
			NumberFormat formatter = new DecimalFormat("#.000");
			vyd = formatter.format(vid);
			fw.write("Per "+n+" dienø bitës suneðë "+kg+" kilogramø medaus"
					+"\nLietingø dienø kiekis " + lietDien
					+"\nMeduneðiui palankiausiø dienø kiekis "+palankDien
					+"\nVidutiniðkai bitës per dienà prineðë medaus "+vyd+" kg.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}