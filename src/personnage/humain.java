package personnage;

public class humain {
	 private String nom; 
	 private String BoissonFavorite ;
	 private int argent ;
	 
	 public humain (String nom , String BoissonFavorite , int argent  ) {
		 this.nom = nom;
		 this.BoissonFavorite = BoissonFavorite;
		 this.argent = argent ;
		
	}
	 public String getnom() {
		 return nom;
	 }
	 public String getBoissonFavorite() {
		 return BoissonFavorite;
	 }
	public int getArgent() {
		return argent;
	}
	private void parler(String texte) {
		System.out.println(texte);
	}
	
	private void direBonjour() {
		parler("Bonjour ! je m,appelle " + nom + "et j'aime boire du "+ BoissonFavorite);
		
    }
	public  void boire() {
         parler("Mmmm, un bon verre de" + BoissonFavorite + "! GLOUPS! " );
		
	}
	public void acheter(String bien , int prix) {
		if(argent >= prix ) {
			argent-=prix;
			parler("j'ai"+ argent +"sous poche.je vais pouvoir m'offrir un "+bien +"à"+ prix + "sous.");
		}
		else {
			parler("je n'ai plus que " + argent + "sous en poche. je ne peux même pas m'offrir un"+ bien + "à" + prix + "sous");
		}
		
	}
	protected  void gagnerArgent(int gain) {
		argent +=gain;
		parler("j'ai gagné" + gain + "sous. Maintenant j'ai " + argent + "sous.");
		
	}
	protected  void perdreArgent(int perte) {
		argent -= perte;
		parler("j'ai perdu " + perte + "sous.Maintenant il me reste " + argent +)
		
	}

}
