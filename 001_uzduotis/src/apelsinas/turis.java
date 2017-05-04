package apelsinas;

public class turis {

	private double skersmuo;
	private double zievStoris;
	private double minkstimas;
	
	public double minkstimoTuris (double skersmuo, double zievStoris){
		skersmuo = skersmuo / 2;
		skersmuo = skersmuo - zievStoris;
		minkstimas = Math.round((4 * Math.PI * (Math.pow(skersmuo, 3) )/3)*100.00)/100.00;
		return minkstimas;
	}
	
	public double getSkersmuo() {
		return skersmuo;
	}
	public void setSkersmuo(double skersmuo) {
		this.skersmuo = skersmuo;
	}
	public double getZievStoris() {
		return zievStoris;
	}
	public void setZievStoris(double zievStoris) {
		this.zievStoris = zievStoris;
	}

	public double getMinkstimas() {
		return minkstimas;
	}

	public void setMinkstimas(double minkstimas) {
		this.minkstimas = minkstimas;
	}
	
}
