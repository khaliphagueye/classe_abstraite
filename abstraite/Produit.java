package abstraite;

public abstract class Produit {
	private String libelle;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
public Produit(String  libelle) {
	// TODO Auto-generated constructor stub
	this.libelle=libelle;
}
	protected abstract double calculTtc();
	protected  void afficher() {
		System.out.println("Libellé est "+libelle);
	}
	protected String getLibelle() {
		return libelle;
	}
	protected  void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	

}
 