package core.ventes.tarification;

import core.ventes.Monnaie;
import core.ventes.Vente;

// visibilité package (pas public) pour cacher l'implémentation
class StratégiePourcentageRemise implements IStratégieTarification {

	@Override
	public Monnaie getTotal(Vente v) {
		return v.getTotalAvantRemise().multiply(pourcentage);
	}
	
	private float pourcentage;

	StratégiePourcentageRemise(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	
}
