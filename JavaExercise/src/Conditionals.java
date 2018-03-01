
public class Conditionals {

	public static void main(String[] args) {

		System.out.println(exampleMethod(4 , 6 , false));

	}

	private static int exampleMethod(int x, int y , boolean yes){
		if(yes == true) {
			return x + y;
		}
		
		else 
		return x * y;
		
	}
}
