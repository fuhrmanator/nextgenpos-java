package ventes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ventes.tarification.IStrat�gieTarification;

public class Vente {
	private List<LigneArticles> lignesArticles = new ArrayList<LigneArticles>();
	private Date date = new Date();
	private boolean estTerminee = false;
	private Paiement paiement;
	private IStrat�gieTarification tarificationStrat�gie = ventes.tarification.FabriqueStrat�gieTarification
			.getInstance().getStrat�gieTarification();


	public Monnaie getSolde() {
		return paiement.getMontant().minus(getTotal());
	}
	
	public void terminer() {
		estTerminee = true;
	}

	public boolean estTermin�e() {
		return estTerminee;
	}

	public void cr�erLigneArticles(DescriptionProduit desc, int quantit�) {
		LigneArticles la = new LigneArticles(desc, quantit�);
		lignesArticles.add(la);
	}

	/**
	 * Le total rendu est celui comprenant toute tarification appliqu�e
	 * 
	 * @return
	 */
	public Monnaie getTotal() {
		Monnaie total = getTotalAvantRemise();
		if (tarificationStrat�gie != null) {
			total = tarificationStrat�gie.getTotal(this);
		}
		return total;
	}

	/**
	 * Le total calcul� est sans application de remise (tarification reduite)
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

	public void cr�erPaiement(Monnaie comptantRe�u) {
		paiement = new Paiement(comptantRe�u);
	}

}
