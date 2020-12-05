package abstraite;

public class Test {

	public static void main(String[] args) {
		
		Produit p[] = {new ProduitAlimentaire("Lait uht", 10, 10),new Service("installation ", 100, 5)};
		double somme  = 0;
		for (Produit produit : p) {
			  
			somme += produit.calculTtc();
			System.out.println("le ttc est "+produit.calculTtc());
			produit.afficher();
			
		}
		System.out.println("la some totale est "+somme);

	}

}
