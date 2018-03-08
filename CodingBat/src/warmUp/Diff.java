package warmUp;

public class Diff {
	public int diff21(int n) {
		int diff = 21 - n;

		if (n > 21) {
			diff = Math.abs(diff) * 2;
		}
		return diff;
	}

}
