package spintele;

import java.util.Scanner;

public class uogiene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Áveskite turimà uogienës kieká ðaukðteliais: ");
		int n = sc.nextInt();
		System.out.print("ir numatomø vizitø skaièiø: ");
		int m = sc.nextInt();
		Integer[] vizitai = new Integer[m];
		
		System.out.println("Dabar áveskite visø lankytojø kodus ir paspauskite"
				+ " ávesties klaviðà ENTER");
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
		int j = 0, x=1;
		int mazy=0, karl=0, frek=0;
		while(x==1 && n>0 && m>=j+1 ){			
			if(vizitai[j].equals(1)){
				if(n==1){
					mazy++;
					n-=1;
					x=0;
					System.out.println("1if "+n);
				}
				if(n>1){
				n -= 2;
				mazy+=2;
				j++;
				System.out.println("1 "+n);
				}
			}
			if(vizitai[j].equals(2)){
				if(n<=4){
					switch (n){
					case 1: karl+=1; n=0; x=0; System.out.println("2if1 "+n); break;
					case 2: karl+=2; n=0; x=0; System.out.println("2if2 "+n); break;
					case 3: karl+=3; n=0; x=0; System.out.println("2if3 "+n); break;
					case 4: karl+=4; n=0; x=0; System.out.println("2if4 "+n); break;				
					}
				}
				if(n>4){
				n-=5;
				karl+=5;
				j++;
				System.out.println("2 "+n);
				}
			}
			if(vizitai[j].equals(3)){
				if(n<=2){
					switch (n){
					case 1: frek+=1; n=0; x=0; System.out.println("3if1 "+n); break;
					case 2: frek+=2; n=0; x=0; System.out.println("3if2 "+n); break;
					}
				}
				if(n>2){
				n-=3;
				frek+=3;
				j++;
				System.out.println("3 "+n);
				}
			}
			else if(n==0){
				break;
			}
		}
		if(n>0){
			System.out.println("Liko "+n+" ðaukðt. uogienës");
		} else {
			System.out.println("Uogienës neliko");
		}
		System.out.println("Maþyliui teko\t\t"+mazy+"\nKarlsonui\t\t"+karl+
				"\nPanelei Frekenbok\t"+frek+"\tðaukðt. uogienës.");
		
	}
}