package mokiniai;

import java.util.Scanner;

public class testas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0, min, pirm, pask, vid, mok, i=0, x;
		System.out.print("Pirmieji bagë: ");
		min = sc.nextInt();
		x=min;
		Integer[] minutes = new Integer[min];
		while(x<16){
			System.out.print(x+" min. baigë ");
			mok = sc.nextInt();
			minutes[i]=mok;
			i++;
			sum+=mok;
			x++;
		}
		pirm=	minutes[0];
		pask=	minutes[min-1];
		vid=	sum/(min-1);
		System.out.println("\nTestà raðë "+sum+" mokiniai.\n"+min+"-tà minutæ baigë "+pirm
				+" mokinys(-iai).\nPaskutinæ minutæ baigë "+pask+" mokinys(-iai).\n"
				+"vidutiniðkai per minutæ baigë "+vid+" mokiniai.");
	}
}