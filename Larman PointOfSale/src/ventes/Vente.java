package ventes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ventes.tarification.IStratégieTarification;

public class Vente {
	private List<LigneArticles> lignesArticles = new ArrayList<LigneArticles>();
	private Date date = new Date();
	private boolean estTerminee = false;
	private Paiement paiement;
	private IStratégieTarification tarificationStratégie = ventes.tarification.FabriqueStratégieTarification
			.getInstance().getStratégieTarification();


	public Monnaie getSolde() {
		return paiement.getMontant().minus(getTotal());
	}
	
	public void terminer() {
		estTerminee = true;
	}

	public boolean estTerminée() {
		return estTerminee;
	}

	public void créerLigneArticles(DescriptionProduit desc, int quantité) {
		LigneArticles la = new LigneArticles(desc, quantité);
		lignesArticles.add(la);
	}

	/**
	 * Le total rendu est celui comprenant toute tarification appliquée
	 * 
	 * @return
	 */
	public Monnaie getTotal() {
		Monnaie total = getTotalAvantRemise();
		if (tarificationStratégie != null) {
			total = tarificationStratégie.getTotal(this);
		}
		return total;
	}

	/**
	 * Le total calculé est sans application de remise (tarification reduite)
	 * 
	 * @return
	 */
	public Monnaie getTotalAvantRemise() {
		// Figure 17.10 -> Conception de Vente.getTotal
		Monnaie total = new Monnaie(new BigDecimal(0), Monnaie.DOLLAR_CANADIEN);
		Monnaie st = null;
		for (LigneArticles la : lignesArticles) {
			st = la.getSousTotal();
//			System.out.println("la.soustotal = " + st);
			total = total.add(st);
		}

		return total;
	}

	public void créerPaiement(Monnaie comptantReçu) {
		paiement = new Paiement(comptantReçu);
	}

}
