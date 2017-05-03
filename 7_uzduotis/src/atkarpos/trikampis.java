package atkarpos;

import java.util.Scanner;

public class trikampis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Áveskite trikampio atkarpø ilgius (jø yra trys): ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if ((a + b > c && c >= a && c >= b) || (b + c > a && a >= b && a >= c) || (a + c > b && b >= a && b >= c)) {
			if (a != b && b != c) {
				if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) || b * b == a * a + c * c
						|| c * c == a * a + b * b) {
					System.out.println("Trikampis yra statusis");

				} else {
					System.out.println("Trikampis yra ávairiakraðtis");
				}
			}
			if (a == b && b == c) {
				System.out.println("Trikampis yra lygiakraðtis");
			}
			if ((a == b || b == c || c == a) && (a != b || b != c || c != a)) {
				System.out.println("Trikampis yra lygiaðonis");
			}
		} else {
			System.out.println("Trikampio sudaryti negalima");

		}

	}

}