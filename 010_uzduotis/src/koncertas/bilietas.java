package koncertas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bilietas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�veskite duomenis: (Dainiaus santaupos)" + "(t�v� duodami pinigai per m�nes�): ");
		int a = sc.nextInt();		int b = sc.nextInt();		int sum = a + (b*2);
		System.out.println("�veskite biliet� kainas KC, DJ, PA, EH, FG sektoriuose.");
		int kc = sc.nextInt();		int dj = sc.nextInt();		int pa = sc.nextInt();
		int eh = sc.nextInt();		int fg = sc.nextInt();
		Integer[] sektoriai = { kc, dj, pa, eh, fg };	
		Arrays.sort(sektoriai, Collections.reverseOrder());

		if (sum >= sektoriai[4]){
			for (int i=0; i<sektoriai.length; i++){
				if(sektoriai[i]<=sum){
					if(sektoriai[i]==kc){
					System.out.println("Dainius nusipirks biliet� K arba C sektoriuje " +
						"bilietas kainuos " + kc + " eur�");
					break;
					}
					if(sektoriai[i]==dj){
					System.out.println("Dainius nusipirks biliet� D arba J sektoriuje " +
						"bilietas kainuos " + dj + " eur�");
					break;
					}
					if(sektoriai[i]==pa){
					System.out.println("Dainius nusipirks biliet� P arba A sektoriuje " + 
						"bilietas kainuos " + pa + " eur�");
					break;
					}
					if(sektoriai[i]==eh){
					System.out.println("Dainius nusipirks biliet� E arba H sektoriuje " +
						"bilietas kainuos " + eh + " eur�");
					break;
					}
					if(sektoriai[i]==fg){
					System.out.println("Dainius nusipirks biliet� F arba G sektoriuje " + 
						"bilietas kainuos " + fg + " eur�");
					break;
					}
				}
			}
		} else {
			System.out.println("NEGAL�S");
		}
	}
}