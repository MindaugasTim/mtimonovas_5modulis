package apelsinas;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("�veskite apelsino skersmen�: ");
		double sker = sc.nextDouble();
		System.out.println("�veskite apelsino �ievel�s stor�:");
		double ziev = sc.nextDouble();

		turis t = new turis();
		t.minkstimoTuris(sker, ziev);
		System.out.println("Apelsino mink�timo t�ris: "+t.getMinkstimas());
	}

}
