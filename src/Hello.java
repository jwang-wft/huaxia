public class Hello {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println( i + ": Hello, the World! (for-loop)");
		}
		
		boolean flag = true;
		while(flag ) {
			System.out.println("Hello, the World! (while-loop)");			
			flag = false;
		}
	}
}
