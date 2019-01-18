package org.huaxia;

public class PrimaryDataType {
	long creditCardNumber = 1234_5678_9012_3456L;
	long socialSecurityNumber = 999_99_9999L;
	int maxInt = 0x7FFF_FFFF;
	float pi =  3.14_15F;
	long hexBytes = 0xFF_EC_DE_5E;
	long hexWords = 0xCAFE_BABE;
	long maxLong = 0x7fff_ffff_ffff_ffffL;
	byte nybbles = 0b0010_0101;
	long bytes = 0b11010010_01101001_10010100_10010010;
	
	public static void main(String[] args) {
		PrimaryDataType pdt = new PrimaryDataType();
		
		System.out.println(pdt.maxInt);
		System.out.println(pdt.creditCardNumber);
		System.out.println(pdt.socialSecurityNumber);
		System.out.println(pdt.hexBytes);
		System.out.println(pdt.bytes);
	}
}
