
public class BitShitfExample {
	public static void main(String[] args) {
		int num = 0b0000_0001;
		
		int r1 = num << 1;
		int r2 = num << 2;
		int r3 = num << 4;
		
		System.out.printf("%d = %8s\n", r1, Integer.toBinaryString(r1));
		System.out.printf("%d = %8s\n", r2, Integer.toBinaryString(r2));
		System.out.printf("%d = %8s\n", r3, Integer.toBinaryString(r3));
	}
}
