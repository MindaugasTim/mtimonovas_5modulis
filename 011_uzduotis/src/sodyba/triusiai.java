package sodyba;

public class triusiai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bm=3, vd=5, pa=5, trk=6, trkain=30, svbm=8, svvd=7, pasv=6;
		String veis1="";	String veis2="";	String veis3="";
		// Nei�mas�iau kur panaudoti trk kintamaj�... ;)
		if(true){
			if(bm*trkain>=vd*trkain&&bm*trkain>=pa*trkain){
				veis1="Belgijos mil�inus";
				if(vd*trkain==bm*trkain){
					veis2=" arba Vokietijos d�m�tuosius";
				}
				if(pa*trkain==bm*trkain){
					veis3=" arba Pranc�zijos avinus";
				}
			}
			else if(vd*trkain>=bm*trkain&&vd*trkain>=pa*trkain){
				veis1="Vokietijos d�m�tuosius";
				if(bm*trkain==vd*trkain){
					veis2=" arba Belgijos mil�inus";
				}
				if(pa*trkain==vd*trkain){
					veis3=" arba Pranc�zijos avinus";
				}
			}
			else if(pa*trkain>=vd*trkain&&pa*trkain>=bm*trkain){
				veis1="Pranc�zijos avinus";
				if(vd*trkain==pa*trkain){
					veis2=" arba Vokietijos d�m�tuosius";
				}
				if(pa*trkain==bm*trkain){
					veis3=" arba Belgijos mil�inus";
				}
			}
		}
		
		System.out.println("Auginant "+veis1+veis2+veis3+" pelnas bus didziausias");
		System.out.println("Did�iausi u�auga "+didziausias(svbm, svvd, pasv));
	}
	
	public static String didziausias(int a, int b, int c){
		String veisle="";
		if (a>b&&a>c){
			veisle="Belgijos mil�inai";
		} else if (b>a&&b>c){
			veisle="Vokietijos d�m�tieji";
		} else if (c>b&&c>a){
			veisle="Pranc�zijos avinai";
		}
		return veisle;
	}
}