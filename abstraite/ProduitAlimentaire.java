package abstraite;

public class ProduitAlimentaire extends Produit {
	double ht;
	double qte;
	final double tva =0.2;
	public ProduitAlimentaire() {
		// TODO Auto-generated constructor stub
	}
	public ProduitAlimentaire(String libelle,double ht, double qte ) {
		super(libelle);
		this.ht = ht;
		this.qte=qte;
		
;
	}

	@Override
	protected double calculTtc() {
		return  ht*qte*(1+tva) ;
	}

	@Override
	protected void afficher() {
		super.afficher();
		System.out.println("la qte  "+qte+",ht est "+ht);
	}

}
