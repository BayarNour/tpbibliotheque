package biblioteque;

public class articles extends document{
		private String nomauteur;
		
public void Edition() {
			System.out.println("le nom d'auteur est "+nomauteur);
			
		}	
public articles(String lenomauteur,String titre,int numid,int nbPages) {
	super(titre,numid,nbPages);
	nomauteur=lenomauteur;
}
public String getnomauteur() {
	return nomauteur;
}


public void setnomacteurs(String lenomauteur) {
	nomauteur=lenomauteur;	
}




	}

