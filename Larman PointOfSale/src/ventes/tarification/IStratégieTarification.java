package ventes.tarification;

import ventes.Monnaie;
import ventes.Vente;

public interface IStrat�gieTarification {
	
	public Monnaie getTotal(Vente v);

}
