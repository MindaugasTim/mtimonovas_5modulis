package remontas;

import java.util.Scanner;

public class keliai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Duomenys: taip - 1, ne - 0");
		System.out.print("Ar galima va�iuoti keliu a? ");
		int a = sc.nextInt();
		System.out.print("Ar galima va�iuoti keliu b? ");
		int b = sc.nextInt();
		System.out.print("Ar galima va�iuoti keliu c? ");
		int c = sc.nextInt();
		System.out.print("Ar galima va�iuoti keliu d? ");
		int d = sc.nextInt();
		System.out.print("Ar galima va�iuoti keliu e? ");
		int e = sc.nextInt();
		System.out.print("Ar galima va�iuoti keliu f? ");
		int f = sc.nextInt();
		
		if (a==1) {
			System.out.println("I� ta�ko A � ta�k� B patekti galima.");
		} else if ((b==1&&e==1)||(b==1&&d==1&&f==1)){
			System.out.println("I� ta�ko A � ta�k� B patekti galima.");
		} else if ((c==1&&f==1)||(c==1&&d==1&&e==1)){
			System.out.println("I� ta�ko A � ta�k� B patekti galima.");
		} else {
			System.out.println("I� ta�ko A � ta�k� B patekti negalima.");
		}
	}
}