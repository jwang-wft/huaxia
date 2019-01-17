public class Hello {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ": Hello, the World! (for-loop)");
		}

		int i = 1;
		boolean flag = true;
		while (flag) {
			System.out.println(i + ": Hello, the World! (for-loop)");
			if (i++ >= 5) {
				flag = false;
			}
		}
	}
}
