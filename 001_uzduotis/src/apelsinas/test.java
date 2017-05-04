package apelsinas;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("áveskite apelsino skersmená: ");
		double sker = sc.nextDouble();
		System.out.println("áveskite apelsino þievelës storá:");
		double ziev = sc.nextDouble();

		turis t = new turis();
		t.minkstimoTuris(sker, ziev);
		System.out.println("Apelsino minkðtimo tûris: "+t.getMinkstimas());
	}

}
