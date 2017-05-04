package mokykla;

public class klase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mok = 1;

		while (true) {
			if (mok % 7 == 0 && mok % 3 == 0 && mok % 2 == 0) {
				int penketai = mok / 7;
				int ketvertai = mok / 3;
				int trejetai = mok / 2;
				int neigemi = mok - (penketai + ketvertai + trejetai);
				
				System.out.println("Kontrolinio rezultatai:\n"+
			"Klasëje mokosi "+mok+" mokiniai\n"+
			"Klasëje "+penketai+" mokiniai gavo penketus\n"+
			"Klasëje "+ketvertai+" mokiniai gavo ketvertus\n"+
			"Klasëje "+trejetai+" mokiniai gavo trejetus\n"+
			"Klasëje "+neigemi+" mokiniø gavo nepatenkinamà paþymá");
				break;
			}
			else {
				mok++;
			}
		}
	}

}
