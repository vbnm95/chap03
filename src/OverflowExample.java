
public class OverflowExample {
	public static void main(String[] args) {
		byte bmax = Byte.MAX_VALUE;
		byte bmin = Byte.MIN_VALUE;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("bmax ="+bmax);
		System.out.println("bmin ="+bmin);
		
		System.out.println("max ="+max);
		System.out.println("min ="+min);
		
		System.out.println("++max ="+ ++max);
	}
}
