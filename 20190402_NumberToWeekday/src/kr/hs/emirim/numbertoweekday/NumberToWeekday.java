package kr.hs.emirim.numbertoweekday;

import java.util.Scanner;

public class NumberToWeekday {

	public static void main(String[] args) {
		String[] weekdays = {"월","화","수","목","금","토","일"};
		
		//숫자입력하자
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		//요일 출력하자	(1 => 월요일, 2 => 화요일, ... , 7 => 일요일)
		System.out.println(weekdays[inputNumber-1]+"요일");
		
//		switch (inputNumber) {
//		case 1:
//			System.out.println("월요일");
//			break;
//
//		default:
//			break;
//		}
//		if(inputNumber == 1)
//			System.out.println("월요일");
	}

}





