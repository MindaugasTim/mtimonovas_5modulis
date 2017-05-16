package termometras;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double[] termometras = new Double[7];
		int val = 0, i = 0, v=0, ats=0;
		System.out.println("Áveskite matavimus:");
		while(i<=6){
			System.out.print(val+" val. buvo: ");
			val+=4;
			double temperatura = sc.nextDouble();
			termometras[i]=temperatura;	
			if(termometras[v]<termometras[i]){
				v=i;
			}
			i++;
		}
		if		(v==0){	ats=0;	}
		else if (v==1){	ats=4;	}
		else if (v==2){	ats=8;	}
		else if (v==3){	ats=12;	}
		else if (v==4){	ats=16;	}
		else if (v==5){	ats=20;	}
		else if (v==6){	ats=24;	}
		System.out.println("Aukðèiausia temperatûra buvo "+ats+" val.");
	}
}