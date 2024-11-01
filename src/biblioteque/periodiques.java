package biblioteque;

public class periodiques extends document{
	private String freq;
	
	public void Edition() {
		System.out.println("la frequence  est" +freq);
	}
	
	public periodiques(String lafreq,String nomauteur,String titre,int numid,int nbPages) {
		super(titre,numid,nbPages);
		freq=lafreq;
	}
	public String getfreq() {
		return freq;
		
	}
	public void setfreq(String lafreq) {
		freq=lafreq;
		
	}
}

