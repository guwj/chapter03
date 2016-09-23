package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		printDate(now);
		printDate2(now);
		
		//년 월(0-11) 일
		Date d1 = new Date(2000, 8, 1);		// 없어질 예정인 함수여서 작대기 그어져 있음
		System.out.println(d1);
		printDate(d1);
		
		//년 월(0-11) 일 시 분
		Date d2 = new Date(2000, 8, 1, 12, 30);
		System.out.println(d2);
		printDate(d2);
		
		//년 월(0-11) 일 시 분
		Date d3 = new Date(2000, 8, 1, 12, 30, 30);
		System.out.println(d3);
		printDate(d3);
		
		//1970년 1월 1일 00:00:00부터 밀리세컨드 값
		long milliseconds = 24L * 60 * 60 * 1000 * 365 * 50;
		Date d4 = new Date(milliseconds);		// 1970년으로부터 10년 후
		printDate(d4);
		printDate2(d4);
		
	}
	
	private static void printDate(Date d){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss"); //포맷은 마음대로 바꿀 수 있다
		System.out.println(sdf.format(d));
	}
	
	private static void printDate2(Date d){
		//년도 + 1900
		int year = d.getYear();
		
		//월(0-11)
		int month = d.getMonth();
		
		//일
		int date = d.getDate();
		
		//시
		int hour = d.getHours();
		
		//분
		int minutes = d.getMinutes();
		
		//초
		int seconds = d.getSeconds();
		
		System.out.println((year + 1900) + "년" + (month+1) + "월" + (date) + "일" + hour + ":" + minutes + ":"+ seconds);
	}

}
