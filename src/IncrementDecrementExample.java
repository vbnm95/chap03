
public class IncrementDecrementExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		int result1 = ++num1 + 10;
		int result2 = num2++ + 10;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(num1);
		System.out.println(num2);
		
		int num = 10;
		++num;
		System.out.println(num);
		
		num++;
		System.out.println(num);
	}

}
