
public class ArithmaticExample {
		public static void main(String[] args) {
			long current = System.currentTimeMillis()/1000; // 초로 변환
			
			System.out.println(current);
			
			long year = 0;
			long month = 0;
			long day = 0 ;
			long week = 0;
			
			long hour = current/60/60%24+9;
			long minute = current/60%60;
			long second = current%60;
			
			System.out.printf("%04d / %02d / %02d  %02d %02d:%02d:%02d\n", year, month, day, week, hour, minute, second);
			/*
			 * GMT, UTC 기준
			 */
			
		}

}
