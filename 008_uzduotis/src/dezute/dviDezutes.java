package dezute;

import java.util.Scanner;

public class dviDezutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Áveskite dviejø dëþuèiø matmenys (a1,b1,c1,a2,b2,c2):");
		int a1 = sc.nextInt();		int b1 = sc.nextInt();		int c1 = sc.nextInt();	
		int a2 = sc.nextInt();		int b2 = sc.nextInt();		int c2 = sc.nextInt();
		
		int[] matmenys = {a1,b1,c1,a2,b2,c2};
		int sum1, sum2, valid = 1;
		sum1=a1+b1+c1;		sum2=a2+b2+c2;
		
		if(true){
			for (int i=0; i<matmenys.length; i++){
				if (matmenys[i]>100){
					System.out.println("Dëþutës nepalyginamos");
					valid = 0;
					break;
				}
			}
			if (sum1<sum2 && valid == 1){
				System.out.println("Pirmoji telpa antroje");
			}
			if (sum1>sum2 && valid == 1){
				System.out.println("Antroji telpa pirmoje");
			}
			if (sum1==sum2 && valid == 1){
				System.out.println("Abi vienodø matmenø");
			}
		}
	}
}
