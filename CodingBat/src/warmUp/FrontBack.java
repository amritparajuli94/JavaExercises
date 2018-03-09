package warmUp;

public class FrontBack {
	public String frontBack(String str) {

		String first;
		String middle;
		String last;

		if (str.length() <= 1) {
			return str;
		} else if (str.length() == 2) {
			first = str.substring(0, 1);
			last = str.substring(1);

			return last + first;
		}

		first = str.substring(0, 1);
		middle = str.substring(1, str.length() - 1);
		last = str.substring(str.length() - 1);

		return last + middle + first;

	}
	// public String frontBack(String str) {
	// if (str.length() <= 1) return str;
	//
	// String mid = str.substring(1, str.length()-1);
	//
	// // last + mid + first
	// return str.charAt(str.length()-1) + mid + str.charAt(0);
	// }

}
