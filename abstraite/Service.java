package abstraite;

public class Service extends Produit {
	double  taux ;
	double nombreHeure;
	final double tva=0.2;
	
	public Service(double ht) {
		super();
	}
	
public Service() {
	// TODO Auto-generated constructor stub
}
	public Service(String libelle, double taux, double nombreHeure) {
		super(libelle);
		this.taux = taux;
		this.nombreHeure = nombreHeure;
	}


	@Override
	protected double calculTtc() {
	double 	ttc  = taux  *nombreHeure*(1+tva);
		return ttc ;
	}

	@Override
	protected void afficher() {
		super.afficher();
		System.out.println("nombre d'heure "+nombreHeure+"\n taux  : "+taux);

	}

}
