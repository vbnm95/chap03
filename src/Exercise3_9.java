
public class Exercise3_9 {
	public static void main(String[] args) {
		char ch ='z';
		boolean b = (65 <= ch && ch <= 90 || 97 <= ch && ch <= 122 || 48 <= ch && ch <= 57)? true : false;
		
		System.out.println(ch);
		System.out.println(b);
	}
}
//65-90 대문자
//97-122 소문자
//48-57 숫자