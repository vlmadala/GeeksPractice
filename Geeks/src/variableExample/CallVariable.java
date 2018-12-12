package variableExample;

public class CallVariable {
	public static void main(String[] args) {
		int a = 100; 
		int b = 200;
		int c = a+b;
		System.out.println(c);
		
		A insta = new A();
		System.out.println(insta.a);
		System.out.println(insta.b);
		System.out.println(c);
		
	}

}
