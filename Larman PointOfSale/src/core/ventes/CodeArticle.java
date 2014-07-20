package core.ventes;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.Id;

public class CodeArticle {
	private int code;

	public CodeArticle() {
		// needed by JPA
	}

	public CodeArticle(int code) {
		this.code = code;
	}

	public String toString() {
		return "CodeArticle:" + Integer.toString(code);
	}

	// Puisque CodeArticle est utilis� comme cl� dans les Map, faut red�finir
	// des m�thodes
	public int hashCode() {
		return code;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof CodeArticle))
			return false;
		if (obj == this)
			return true;

		CodeArticle rhs = (CodeArticle) obj;
		return rhs.code == this.code;
	}

	public int getCode() {
		return code;
	}

}
