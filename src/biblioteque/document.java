package biblioteque;

public class document {
	private String titre;
	private int numid;
	private int nbPages;

	public void Edition() {
		System.out.println("le titre est"+titre+"le numeros d'indentité est"+numid+"le nombre de page est"+nbPages);
		
	}
	public document(String untitre,int lenumid,int lenbPages) {
		titre=untitre;
		numid=lenumid;
		nbPages=lenbPages;
		
	}
	public String gettitre() {
		return titre;
		
	}
	public int getnumid() {
		return numid;
		
	}
	public int getnbPages() {
		return nbPages;
		
	}
	public void settitre(String untitre) {
		titre=untitre;
		
	}
	public void setnumid(int lenumid) {
		numid=lenumid;
		
	}
	public void setnbPages(int lenbPages) {
		nbPages=lenbPages;
		
	}
}
