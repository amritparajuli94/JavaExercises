package warmUp;

public class MissingChar {
	public String missingChar(String str, int n) {
		String s = str.substring(0, n);

		String l = str.substring(n + 1, str.length());

		return s + l;
	}

}
