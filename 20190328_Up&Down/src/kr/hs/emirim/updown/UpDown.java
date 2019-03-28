package kr.hs.emirim.updown;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		// makeAnswer
		Random random = new Random();
		int answer = random.nextInt(100) + 1; // 1~100
		while (true) {
			// input
			Scanner scanner = new Scanner(System.in);
			int player = scanner.nextInt();
			// 비교
			if (answer > player) {
				System.out.println("Up");
			} else if (answer < player) {
				System.out.println("Down");
			} else {
				// 결과
				// ==탈출
				System.out.println("정답입니다.");
				break;
			}
		}

	}

}
