package org.huaxia;

public class BitDemo {

	public static void main(String[] args) {
		int bitmask = 0x0000000F;
		int val = 0x2222;
		// prints "2"
		System.out.println(val & bitmask);
		System.out.println(val | bitmask);
		System.out.printf("%x\n", ~bitmask);
		System.out.printf("%x\n", val ^ bitmask);
		int number = (int) (2 * Math.pow(16, 3) + 2 * Math.pow(16, 2) + 2 * 16 + 15);
		System.out.println(number);
		int shiftLeft = bitmask << 1;
		System.out.printf("0x%x = %d\n", bitmask, bitmask);
		System.out.printf("0x%x = %d\n", shiftLeft, shiftLeft);
		int shiftRight = bitmask >> 2;
		System.out.printf("0x%x = %d\n", shiftRight, shiftRight);

	}

}
