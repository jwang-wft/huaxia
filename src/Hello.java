public class Hello {
	static String helloWorld = "Hello, the World!";
	
	public static void main(String[] args) {
		int i1 = 5;
		int i2 = 6;
		Hello h = new Hello();
		int i3 = h.add (i1, i2);
		System.out.printf("%d + %d = %d\n", i1, i2, i3);
		
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
	
	public int add (int i1, int i2) {
		return i1 + i2;
	}
}
