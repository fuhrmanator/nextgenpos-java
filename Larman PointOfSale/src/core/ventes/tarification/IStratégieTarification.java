package core.ventes.tarification;

import core.ventes.Monnaie;
import core.ventes.Vente;

public interface IStrat�gieTarification {
	
	public Monnaie getTotal(Vente v);

}
