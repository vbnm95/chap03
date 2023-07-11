
public class DateTimeExample {
	public static void main(String[] args) {
		
		// 1. 밀리초 -> 초로 변환
		// 2. GMT+9 를 위해 (60*60*9)초 추가
		long current = System.currentTimeMillis()/1000+(60*60*9);
		
		long year = 0;
		long month = 0;
		long day = 0;
		long week = 0;
		
		// 시:분:초 계산
		long hour = current/60/60%24;
		long minute = current/60%60;
		long second = current%60;
		
		// 년/월/일 계산 시작
		long normalYear[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 평년 월별 일수
		long leapYear[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 윤년 월별 일수
		long currentDay = current/60/60/24; // 1970년 1월 1일부터 흐른 일수
		long y = 1970; // 1970년부터 시간의 흐름에 따라 1년씩 증가
		long m = 0; // 월 계산
		long d = 0; // 일 계산
		
		Outter: while(true) { // 1970년 이후로 평년인지 윤년인지 구분하면서 currentDay에서 월 단위로 배열에 저장된 일수를 빼서 현 시점까지 오는 계산
			if((y%4)==0 && (y%100)!=0 || (y%400)==0) { // 윤년에 해당하는 경우
				for(int i=0; i<leapYear.length; i++) {
					currentDay -= leapYear[i]; // currentDay에서 366일 빼줌
					if(currentDay <= 0) {
						m = i+1;
						d = currentDay + leapYear[i] + 1;
						break Outter;
					}
				}
				y++; 
			} else { // 평년에 해당하는 경우
				for(int i=0; i<normalYear.length; i++) {
					currentDay -= normalYear[i]; // currentDay에서 365일 빼줌
					if(currentDay <= 0) {
						m = i+1;
						d = currentDay + normalYear[i] + 1;
						break Outter;
					}
				}
				y++; 
			}
		}
		
		year = y;
		month = m;
		day = d;
		week = d/7+1;
		
		System.out.printf("%04d/%02d/%02d  %02d  %02d:%02d:%02d\n", year, month, day, week, hour, minute, second);

	}
}
