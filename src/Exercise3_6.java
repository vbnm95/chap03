
public class Exercise3_6 {
	public static void main(String[] args) {
		int n = (int)(Math.random()*100 + 10);
		System.out.printf("%d : %d\n", n, ((n/10+1)*10) - n);
	}
}
