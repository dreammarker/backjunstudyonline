package threelevel;

import java.util.Scanner;

public class 백준11721열개씩끊어출력하기 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int n = 10;
		String inputs = sc.next();
		sc.close();

		for (int i = 0; i < inputs.length(); ++i) {

			System.out.print(inputs.charAt(i));
			if (i % 10 == 9) {
				System.out.println();
			}

		}
	}

}
