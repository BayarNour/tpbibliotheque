package biblioteque;

public class livres extends articles {
	private String nomediteur;
	
	
	public void Edition() {
		System.out.println("le nom d'editeur est" +nomediteur);
	}
	
	public livres(String lenomediteur,String nomauteur,String titre,int numid,int nbPages) {
		super(nomauteur,titre,numid,nbPages);
		nomediteur=lenomediteur;
	}
	public String getnomediteur() {
		return nomediteur;
		
	}
	public void setnomediteur(String lenomediteur) {
		nomediteur=lenomediteur;
		
	}
	}

