import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		// 반복
		while (true) {
			Scanner scanner = new Scanner(System.in);
			// input
			// 변수에 대입
			String inputString = scanner.nextLine();
			if(inputString.equals("exit")) {
				// 변수 출력
				System.out.println("안녕, 잘가");
				break;
			}
			System.out.println(inputString);
		}

	}

}







