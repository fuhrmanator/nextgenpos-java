package core.ventes;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

// ///////////////////////
// / Convertisseur pour simplifier le type dans JDA
@Converter(autoApply = true)
public class CodeArticleToIntegerConverter implements
		AttributeConverter<CodeArticle, Integer> {

	public Integer convertToDatabaseColumn(CodeArticle attribute) {
		return (attribute == null) ? null : attribute.getCode();
	}

	public CodeArticle convertToEntityAttribute(Integer dbData) {
		return (dbData == null) ? null : new CodeArticle(dbData);
	}
}
