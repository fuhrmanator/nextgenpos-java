package core.ventes.tarification;

import core.ventes.Monnaie;
import core.ventes.Vente;

// visibilit� package (pas public) pour cacher l'impl�mentation
class Strat�giePourcentageRemise implements IStrat�gieTarification {

	@Override
	public Monnaie getTotal(Vente v) {
		return v.getTotalAvantRemise().multiply(pourcentage);
	}
	
	private float pourcentage;

	Strat�giePourcentageRemise(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	
}
