package sodyba;

public class triusiai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bm=3, vd=5, pa=5, trk=6, trkain=30, svbm=8, svvd=7, pasv=6;
		String veis1="";	String veis2="";	String veis3="";
		// Neiðmasèiau kur panaudoti trk kintamajá... ;)
		if(true){
			if(bm*trkain>=vd*trkain&&bm*trkain>=pa*trkain){
				veis1="Belgijos milþinus";
				if(vd*trkain==bm*trkain){
					veis2=" arba Vokietijos dëmëtuosius";
				}
				if(pa*trkain==bm*trkain){
					veis3=" arba Prancûzijos avinus";
				}
			}
			else if(vd*trkain>=bm*trkain&&vd*trkain>=pa*trkain){
				veis1="Vokietijos dëmëtuosius";
				if(bm*trkain==vd*trkain){
					veis2=" arba Belgijos milþinus";
				}
				if(pa*trkain==vd*trkain){
					veis3=" arba Prancûzijos avinus";
				}
			}
			else if(pa*trkain>=vd*trkain&&pa*trkain>=bm*trkain){
				veis1="Prancûzijos avinus";
				if(vd*trkain==pa*trkain){
					veis2=" arba Vokietijos dëmëtuosius";
				}
				if(pa*trkain==bm*trkain){
					veis3=" arba Belgijos milþinus";
				}
			}
		}
		
		System.out.println("Auginant "+veis1+veis2+veis3+" pelnas bus didziausias");
		System.out.println("Didþiausi uþauga "+didziausias(svbm, svvd, pasv));
	}
	
	public static String didziausias(int a, int b, int c){
		String veisle="";
		if (a>b&&a>c){
			veisle="Belgijos milþinai";
		} else if (b>a&&b>c){
			veisle="Vokietijos dëmëtieji";
		} else if (c>b&&c>a){
			veisle="Prancûzijos avinai";
		}
		return veisle;
	}
}