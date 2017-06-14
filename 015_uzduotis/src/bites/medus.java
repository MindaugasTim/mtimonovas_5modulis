package bites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class medus {

	private static final String input = "input.txt";
	private static final String output = "output.txt";
	
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(input);
			br = new BufferedReader(fr);
			String line = null;
			br = new BufferedReader(new FileReader(input));
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

			fw.write("Per "+n+" dien� bit�s sune�� "+kg+" kilogram� medaus"
					+"\nLieting� dien� kiekis " + lietDien
					+"\nMedune�iui palankiausi� dien� kiekis "+palankDien
					+"\nVidutini�kai bit�s per dien� prine�� medaus "+vid+"00 kg.");
			//vidutiniskai kintamasis - perfect format.. :)
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}