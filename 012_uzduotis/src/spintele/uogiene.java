package spintele;

import java.util.Scanner;

public class uogiene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�veskite turim� uogien�s kiek� �auk�teliais: ");
		int n = sc.nextInt();
		System.out.print("ir numatom� vizit� skai�i�: ");
		int m = sc.nextInt();
		Integer[] vizitai = new Integer[m];
		
		System.out.println("Dabar �veskite vis� lankytoj� kodus ir paspauskite"
				+ " �vesties klavi�� ENTER");
		int i = 0;
		while(m>i){
			int kodas = sc.nextInt();
			if(kodas>0&&kodas<4){
				vizitai[i]= kodas;
				i++;
			}
			if(kodas<0||kodas>4){
				System.out.println("Blogas kodas");
			}
		}
		int j = 0;
		int mazy=0, karl=0, frek=0;
		while(){						//???????????????????????
			if(vizitai[j]==1){
				if(n==1){
					mazy++;
					j++;
				}
				n -= 2;
				mazy+=2;
				j++;
			}
			if(vizitai[j]==2){
				if(n<=4){
					j++;
					switch (n){
					case 1: karl+=1; n=0;
					case 2: karl+=2; n=0;
					case 3: karl+=3; n=0;
					case 4: karl+=4; n=0;					
					}
				}
				n-=5;
				karl+=5;
				j++;
			}
			if(vizitai[j]==2){
				if(n<=2){
					switch (n){
					case 1: frek+=1; n=0;
					case 2: frek+=1; n=0;
					}
				}
				n-=3;
				frek+=3;
				j++;
			}
		}
		if(n>0){
			System.out.println("Liko "+n+" �auk�t. uogien�s");
		} else {
			System.out.println("Uogien�s neliko");
		}
		System.out.println("Ma�yliui teko\t"+mazy+"\nKarlsonui\t"+karl+
				"\nPanelei Frekenbok\t"+frek+"�auk�t. uogien�s.");
		
	}
}