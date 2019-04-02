package kr.hs.emirim.randomnumber;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int start = 17;
		int end = 17;
		Random random = new Random();
		int randomNumber = random.nextInt(end-start+1)+start;	//start~end 랜덤숫자 뽑자
		System.out.println(randomNumber);

	}

}
