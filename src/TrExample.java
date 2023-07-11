
public class TrExample {
	public static void main(String[] args) {
		double r1 = Math.random();
		
		System.out.println(r1);
		System.out.println(r1*80);
		System.out.println((int)r1*80 % 2 == 0 ? "짝수":"홀수");
	}
}
