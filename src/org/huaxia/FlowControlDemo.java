package org.huaxia;

public class FlowControlDemo {

	public static void main(String[] args) {
		int testscore = 96;
		char grade;

		if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if (testscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
		System.out.println(findEvenNumber(129));
		System.out.println(findEvenNumber(1298));		
	}
	
	private static String findEvenNumber(int number) {
		String value = "";
		switch(number%2) {
		case 0:
			value = String.format("The number %d is an even number.",number);
			break;
		case 1:
			value = String.format("The number %d is an odd number.",number);
			break;
		}
		return value;
	}
}
