package autobusas;

import java.util.Scanner;

public class tvarkarastis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int v;
		int m;
		
		System.out.print("Kada autobusas i�vyko i� Vilniaus? ");
		int vi = sc.nextInt();
		int mi = sc.nextInt();
		
		System.out.print("Kiek laiko autobusas va�iavo i� Vilniaus � Panev���? ");
		int vp = sc.nextInt();
		int mp = sc.nextInt();
		
		System.out.print("Kelias minutes autobusas stov�jo Panev��yje? ");
		int ms = sc.nextInt();
		
		System.out.print("Kiek laiko autobusas va�iavo i� Panev��io � Ryg�? ");
		int vr = sc.nextInt();
		int mr = sc.nextInt();
		
		v = vi + vp + vr;
		m =	mi + mp + ms + mr;	
		if(true){
			if(m >= 60){
				m -= 60;
				v += 1;
				if(v >= 24){
					v -= 24;
				}
			}
			System.out.println("Autobusas  �  Ryg� atvyks: "+v+" val. "+m+" min.");
		}
		
		
		
		
	}

}
