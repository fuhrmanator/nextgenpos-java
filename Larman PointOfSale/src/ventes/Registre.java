package ventes;

public class Registre {
	private Vente venteEnCours;
	private CatalogueProduits catalogueProduits;
	
	public Registre(CatalogueProduits catalogue) {
		this.catalogueProduits = catalogue;
	}
	
	public void créerNouvelleVente() {
		venteEnCours = new Vente();
		System.out.println("Nouvelle vente");
	}
	
	public void saisirArticle(int codeInt, int quantité) {
		// opération système contient des types primitifs, donc faut convertir le code
		CodeArticle code = new CodeArticle(codeInt);
		DescriptionProduit dp = catalogueProduits.getDescriptionProduit(code);
		if (dp == null) {
			System.out.println("Aucun produit correspondant au code : " + code);
		} else {
			venteEnCours.créerLigneArticles(dp, quantité);
			System.out.println("saisirArticle: " + dp.getDescription() + " (@" + dp.getPrix() + "), quantité = " + quantité + " [sous total: "+ venteEnCours.getTotalAvantRemise() + "]" );
		}
	}

	public void terminerVente() {
		venteEnCours.terminer();
		System.out.println("fin de saisie d'articles");
		System.out.println("Total avant remise: " + venteEnCours.getTotalAvantRemise());
		System.out.println("Total avec remise : " + venteEnCours.getTotal());
		System.out.println("Économie de       : " + venteEnCours.getTotalAvantRemise().minus(venteEnCours.getTotal()));
	}

	public void créerPaiement(double comptantReçu) {
		Monnaie comptantReçuMonnaie = new Monnaie(comptantReçu);
		venteEnCours.créerPaiement(comptantReçuMonnaie);
		System.out.println("Créer paiement: " + comptantReçuMonnaie);
		System.out.println("Solde : " + venteEnCours.getSolde());
	}

}
