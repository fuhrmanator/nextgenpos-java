package core.ventes;

public class CodeArticle {

	private int code;

	public CodeArticle(int code) {
		this.code = code;
	}

	public String toString() {
		return Integer.toString(code);
	}

	// Puisque CodeArticle est utilis� comme cl� dans les Map, faut red�finir des m�thodes
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
}
