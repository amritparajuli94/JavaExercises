package warmUp;

public class PosNeg {
	public boolean posNeg(int a, int b, boolean negative) {

		if (!negative && (a < 0 && b > 0) || (a > 0 && b < 0) && !negative || negative && (a < 0 && b < 0)) {
			return true;
		}
		return false;
		// if(((a<0)&&(b>0) && !negative) || ((a>0)&&(b<0) && !negative)
		// || ((a<0)&&(b<0) && negative)){
		// return true;
		// }
		// else return false;
	}

}
