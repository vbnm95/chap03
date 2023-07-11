
public class NanInfinityExample {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 0;
		
		
		System.out.println("by zero");
		
		//int result1 = num1 / num2;
		
		double d1 = 5;
		double d2 = 0;
		
		double result1 = d1/d2;
		double result2 = d1%d2;
		
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		System.out.println(Double.isInfinite(result1) + ": result1 = "+result1);
		System.out.println(Double.isInfinite(result2) + ": result2 = "+result2);
		
		System.out.println(result1 == Double.POSITIVE_INFINITY);
		System.out.println(result2 == Double.NaN);
		System.out.println(Double.isNaN(result2));
		
		System.out.println("Program End...");
	}
}
