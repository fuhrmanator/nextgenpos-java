package ventes.tarification;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * FabriqueStratégieTarification classe singleton, voir la Figure F23.12 de UML 2 et les design patterns de Larman
 * @author Cris
 *
 */
public class FabriqueStratégieTarification {
	
	private static FabriqueStratégieTarification instance;
	
	public synchronized static FabriqueStratégieTarification getInstance () {
		if (instance == null) {
			instance = new FabriqueStratégieTarification();
		}
		return instance;
	}
	
	public IStratégieTarification getStratégieTarification() {
		String nomClasse = System
				.getProperty("strategietarification.class.name");
		IStratégieTarification stratégie = null;
		if (nomClasse != null) {
			System.out.println("Stratégie de tarification trouvée: " + nomClasse);
			try {
				// instancier une stratégie avec pourcentage
				String pourcentage = System.getProperty("strategietarification.class.percentage");
				Class[] floatArgClass = new Class[] {float.class};
				if (pourcentage != null) {
					System.out.println("Pourcentage pour tarification: " + pourcentage);
					Class stratégieClass = Class.forName(nomClasse);
					try {
						// puisque le constructeur est visible seulement dans le package, faut getDeclaredConstructor
						Constructor stratégieConstructor = stratégieClass.getDeclaredConstructor(floatArgClass);
						Object[] floatArg = new Object[] {Float.parseFloat(pourcentage)/100};
						try {
							stratégie = (IStratégieTarification) stratégieConstructor.newInstance(floatArg);
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (NoSuchMethodException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} else {
					stratégie = (IStratégieTarification) Class.forName(nomClasse)
						.newInstance();
				}
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return stratégie;
	}

}
