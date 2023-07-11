
public class BitLogicalExample {
	public static void main(String[] args) {
		int num1 = 0b1111_1000;
		int num2 = 0b0001_1111;
		
		/*
		 * num1 = 0b1111_1000;
		 * num2 = 0b0001_1111;
		 * 
		 * 
		 */
		
		int result1 = num1 & num2;
		int result2 = num1 | num2;
		int result3 = num1 ^ num2;
		
		System.out.printf("%04d = %8s\n", result1, Integer.toBinaryString(result1));
		System.out.printf("%04d = %8s\n", result2, Integer.toBinaryString(result2));
		System.out.printf("%04d = %8s\n", result3, Integer.toBinaryString(result3));
	}
}
