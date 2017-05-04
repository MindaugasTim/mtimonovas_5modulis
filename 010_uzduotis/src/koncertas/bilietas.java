package koncertas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bilietas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Áveskite duomenis: (Dainiaus santaupos)" + "(tëvø duodami pinigai per mënesá): ");
		int a = sc.nextInt();		int b = sc.nextInt();		int sum = a + (b*2);
		System.out.println("Áveskite bilietø kainas KC, DJ, PA, EH, FG sektoriuose.");
		int kc = sc.nextInt();		int dj = sc.nextInt();		int pa = sc.nextInt();
		int eh = sc.nextInt();		int fg = sc.nextInt();
		Integer[] sektoriai = { kc, dj, pa, eh, fg };	
		Arrays.sort(sektoriai, Collections.reverseOrder());

		if (sum >= sektoriai[4]){
			for (int i=0; i<sektoriai.length; i++){
				if(sektoriai[i]<=sum){
					if(sektoriai[i]==kc){
					System.out.println("Dainius nusipirks bilietà K arba C sektoriuje " +
						"bilietas kainuos " + kc + " eurø");
					break;
					}
					if(sektoriai[i]==dj){
					System.out.println("Dainius nusipirks bilietà D arba J sektoriuje " +
						"bilietas kainuos " + dj + " eurø");
					break;
					}
					if(sektoriai[i]==pa){
					System.out.println("Dainius nusipirks bilietà P arba A sektoriuje " + 
						"bilietas kainuos " + pa + " eurø");
					break;
					}
					if(sektoriai[i]==eh){
					System.out.println("Dainius nusipirks bilietà E arba H sektoriuje " +
						"bilietas kainuos " + eh + " eurø");
					break;
					}
					if(sektoriai[i]==fg){
					System.out.println("Dainius nusipirks bilietà F arba G sektoriuje " + 
						"bilietas kainuos " + fg + " eurø");
					break;
					}
				}
			}
		} else {
			System.out.println("NEGALËS");
		}
	}
}