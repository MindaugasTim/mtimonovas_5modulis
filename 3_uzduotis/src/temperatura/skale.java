package temperatura;

import java.util.Scanner;

public class skale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Temperat�r� skal�s \n�veskite temperat�r� Kelvino skal�je: ");
		//double k = Double.parseDouble(sc.nextLine());
		double k = sc.nextDouble();
		
		double a = 273.16;
		double b = 0.8;
		
		double c = Math.round((k - a)*100.00)/100.00;
		double f = Math.round((k * 9/5 - 459.67)*100.00)/100.00;
		double r = Math.round(((k - a) * b)*100.00)/100.00;
				
		System.out.println("1. "+c+" Celsijaus laipsni�\n2. "+f+" Farenheito laipsni�\n3. "+
r+" Reomi�ro laipsni�\nPrograma darb� baig�. A�i�, kad skai�iavote.");
	}

}
