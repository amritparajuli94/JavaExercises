
public class HelloWorldParameters {

	public static void main(String[] args) {

		
		method1();
		
		method2();
		
		System.out.println(method3());

	}
	
	static void method1() {
		System.out.println("Hello");
	}
	
	static void method2() {
		System.out.println("World");
	}
	
	static String method3() {
		return "!"; 
	}
	

}
