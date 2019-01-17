public class Hello {
	static String helloWorld = "Hello, the World!";
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + helloWorld);
		}

		int i = 1;
		boolean flag = true;
		while (flag) {
			System.out.println(i + helloWorld);
			if (i++ >= 5) {
				flag = false;
			}
		}
	}
}
