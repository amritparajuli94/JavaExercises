package test;

public class Split {
	public static void main(String args[]) {
		String Str = new String("hello -how -are -you -Amrit?");
		System.out.println("Return Value :");

		for (String retval : Str.split("-")) {
			System.out.println(retval);
		}
	}

}
