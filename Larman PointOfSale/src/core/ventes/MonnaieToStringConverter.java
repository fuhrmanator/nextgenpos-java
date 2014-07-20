package core.ventes;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

// ///////////////////////////
// Convertisseur pour simplifier l'utilisation dans JDA
@Converter(autoApply = true)
public class MonnaieToStringConverter implements
		AttributeConverter<Monnaie, String> {

	@Override
	public String convertToDatabaseColumn(Monnaie attribute) {
		return (attribute == null) ? null : attribute.toDbString();
	}

	@Override
	public Monnaie convertToEntityAttribute(String dbData) {
		return (dbData == null) ? null
				: new Monnaie(Double.parseDouble(dbData));
	}
}
