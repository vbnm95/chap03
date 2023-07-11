
public class RealToIntExample {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		
		double result = apple - 7*pieceUnit;
		
		System.out.printf("%.5f\n", result);
		
		int apple2 = 10;
		int pieceUnit2 = 1;
		
		double result2 = apple2 - 7*pieceUnit2;
		
		System.out.println(result2/10.0);
	}
}
