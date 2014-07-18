package core.util;

import core.ventes.CodeArticle;

public class Transformer {

	public static CodeArticle toItemID(int code) {
		return new CodeArticle(code);
	}

	public static CodeArticle toItemID(String text) {
		return new CodeArticle(Integer.parseInt(text));
	}

	public static int toInt(String text) {
		return Integer.parseInt(text);
	}

}
