package biblioteque;

public class bibliotheque {
	private document listdoc[];
	private int nbdoc;
	private int capmax;
	
	public bibliotheque(int lecapmax) {
		capmax=lecapmax;
		listdoc=new document[capmax];
		
		
	}
	public int getcapacite() {
		return capmax;
	}
	public void ajout_doc(document d){
		listdoc[nbdoc]=d;
		nbdoc++;
		
	}
	public void supprimer_doc(int numid ) {
		int i=0;
		while(numid!=listdoc[i].getnumid() && i<nbdoc){
			i=i+1;
			
		}
		int num=i;
		if(i==nbdoc) {
			System.out.println("erreur: pas trouver");
			
		}
		else {
			for(int j=num;j<nbdoc;j++) {
				listdoc[j]=listdoc[j+1];
				
				
			}
		}
	}
	 public void Inventaire_doc() {
	        System.out.println("Inventaire des documents:");
	        for (int i = 0; i < nbdoc; i++) {
	            if (listdoc[i] != null) {
	                String typeDoc = "Document inconnu";
	                if (listdoc[i] instanceof livres) {
	                    typeDoc = "Livre";
	                } else if (listdoc[i] instanceof articles) {
	                    typeDoc = "Article";
	                } else if (listdoc[i] instanceof periodiques) {
	                    typeDoc = "Periodique";
	                }
	                
	                System.out.println("ID: " + listdoc[i].getnumid() + ", Type: " + typeDoc);
	            }
	        }
	    }
	
	
	
	public int getNombre_document() {
		return nbdoc;
	}
	
	public bibliotheque liste_livre() {
		bibliotheque bib=new bibliotheque(nbdoc);
		for(int i=0;i<nbdoc;i++) {
			if (listdoc[i] instanceof livres) {
				ajout_doc(listdoc[i]);
			}
			
			
		}
		return bib;
		
	}
	public bibliotheque liste_article(){
		bibliotheque biblio=new bibliotheque(nbdoc);
		for(int i=0;i<nbdoc;i++) {
			if (listdoc[i] instanceof articles) {
				ajout_doc(listdoc[i]);
			}
			
			
		}
		return biblio;
		
	}
	public bibliotheque liste_docsimples(){
		bibliotheque doc=new bibliotheque(nbdoc);
		for(int i=0;i<nbdoc;i++) {
			if (listdoc[i] instanceof document) {
				ajout_doc(listdoc[i]);
			}
			
			
		}
		return doc;
		
	}
	public bibliotheque liste_periodique(){
		bibliotheque per=new bibliotheque(nbdoc);
		for(int i=0;i<nbdoc;i++) {
			if (listdoc[i] instanceof periodiques) {
				ajout_doc(listdoc[i]);
			}
			
		}
		return per;
		
	}
	
	

}
