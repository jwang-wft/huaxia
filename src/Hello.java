public class Hello {
	static String helloWorld = "Hello, the World!";
	
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(String.format("%d: %s (%s)", i, helloWorld, "for-loop"));
		}

		int i = 1;
		boolean flag = true;
		while (flag) {
			System.out.println(String.format("%d: %s (%s)", i, helloWorld, "while-loop"));
			if (i++ >= 5) {
				flag = false;
			}
		}
	}
}
