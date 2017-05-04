package vanduo;

import java.util.Scanner;

public class turis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("áveskite kubo kraðtinës ilgá a: ");
			double a = sc.nextDouble();
			System.out.print("Áveskite rutulio skersmená b: ");
			double b = sc.nextDouble();

			if (a >= b) {
				double kubas = Math.round(Math.pow(a, 3) * 100.00) / 100.00;
				double rutulys = Math.round((4 * Math.PI * (Math.pow((b / 2), 3)) / 3) * 100.00) / 100.00;
				double vanduo = Math.round((kubas - rutulys) * 100.00) / 100.00;
				System.out.println("Kubo tûris: " + kubas);
				System.out.println("Rutulio tûris: " + rutulys);
				System.out.println("Vandens tûris: " + vanduo);
				break;
			} else {
				System.out.println("Rutulys negali but idetas i mazesne deze!!!");
			}

		}

	}

}
