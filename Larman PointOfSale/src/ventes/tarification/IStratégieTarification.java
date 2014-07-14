package ventes.tarification;

import ventes.Monnaie;
import ventes.Vente;

public interface IStratégieTarification {
	
	public Monnaie getTotal(Vente v);

}
