package org.huaxia;

public class BitDemo {

	public static void main(String[] args) {
		int bitmask = 0x0000000F;
		int val = 0x222f;
		// prints "2"
		System.out.println(val & bitmask);
		System.out.println(val | bitmask);
		System.out.printf("%x(%d) 经过补运算符~作用后变成 %x(%d)\n", bitmask, bitmask, ~bitmask, ~bitmask);
		System.out.printf("%x\n", val ^ bitmask);
		System.out.printf("val=%d\n", val);
		int number = (int) (2 * Math.pow(16, 3) + 2 * Math.pow(16, 2) + 2 * 16 + 15);
		System.out.printf("calculated val=%d\n", number);
		int shiftLeft = bitmask << 1;
		System.out.printf("0x%x = %d\n", bitmask, bitmask);
		System.out.printf("0x%x = %d\n", shiftLeft, shiftLeft);
		int shiftRight = bitmask >> 2;
		System.out.printf("0x%x = %d\n", shiftRight, shiftRight);

	}

}
