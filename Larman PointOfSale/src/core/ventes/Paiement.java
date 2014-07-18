package core.ventes;

public class Paiement {
	private Monnaie montant;
	public Paiement(Monnaie montantPresente) { montant = montantPresente;}
	public Monnaie getMontant() { return montant;}
}
