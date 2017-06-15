package debesis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class liutis {

	private static final String input = "input.txt";
	private static final String output = "output.txt";
	
	public static void main(String[] args) {

		BufferedReader br = null;
		FileWriter fw = null;
		try {
			br = new BufferedReader(new FileReader(input));
			fw = new FileWriter(output);
			String line = null, vyd;
	
			int valD = 0, valM = 1, mazK = 0, daugK = 0, viso = 0; double vid = 0;
			int n = Integer.parseInt(br.readLine()), i=0;
			
			String[] krituliai = new String[n];
			
			while ((line = br.readLine()) != null) {
				krituliai[i]=line;
				viso+= Integer.parseInt(line);
				i++;
			}
			if(krituliai.length>0){
			mazK=Integer.parseInt(krituliai[0]);
			}
			for(i=0;i<n;i++){
				if(daugK<Integer.parseInt(krituliai[i])){
					daugK=Integer.parseInt(krituliai[i]);
					valD = i + 1;
				}
				if(mazK>Integer.parseInt(krituliai[i])){
					mazK=Integer.parseInt(krituliai[i]);
					valM = i + 1;
				}
			}
			NumberFormat formatter = new DecimalFormat("#.00");
			vid = (double)viso / (double)n;
			vyd = formatter.format(vid);
			fw.write("Liuties metu iskrito "+viso+" mm krituliu"
					+"\nDaugiausia krituliu iskrito "+daugK+" mm per "+valD+" liuties valanda"
					+"\nMaziausia krituliu iskrito "+mazK+" mm per "+valM+" liuties valanda"
					+"\nVidutiniðkai per valanda iskrito "+vyd+" mm krituliu");
			
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