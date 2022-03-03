package study12;

import java.util.Calendar;

public class study12 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance(); // Calendar 객체 생성
		date.clear();                           // 현재 Calendar 객체에 저장된 정보를 모두 지운다.
		date.set(Calendar.YEAR, 2020);          // Calendar 객체에 2020년의 년도 저장
		date.set(Calendar.MONTH, 11);           // Calendar 객체에 12월의 달 저장
		date.set(Calendar.DAY_OF_MONTH, 25);    // Calendar 객체에 25일의 날짜 저장
		System.out.println("약속 날짜는 "+date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DAY_OF_MONTH)+"일");
	}

}
