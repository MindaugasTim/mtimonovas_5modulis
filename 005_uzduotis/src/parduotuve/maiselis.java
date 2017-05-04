package parduotuve;

import java.util.Scanner;

public class maiselis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Áveskite saldainiø maiðelio kainà: ");
		int kaina = sc.nextInt();
		System.out.print("Áveskite pinigø sumà skirtà saldainiams pirkti: ");
		int pinigine = sc.nextInt();
		
		int rezultatas = pinigine / kaina;
		int pirkimai = 0;
		int kuponai = rezultatas;
		int uzKuponus = 0;
		int likukutis = 0;
		
		while (pirkimai < 4){
			if(kuponai > 2){
				uzKuponus = kuponai / 3;
				likukutis = uzKuponus - 3;
				rezultatas += uzKuponus;
				kuponai = uzKuponus;
				kuponai += likukutis;
			}
			pirkimai++;
		}
		System.out.println(rezultatas);
	}
}
