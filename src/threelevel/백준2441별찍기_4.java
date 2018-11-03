package threelevel;

import java.util.Scanner;

public class 백준2441별찍기_4 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		b = sc.nextInt();
		int c;

		if (b >= 1 && b <= 100) {
			for (a = 1; a <= b; a++) {

				for (c = 1; c <= b; c++) {
					if (c <= a - 1) {
						System.out.print(" ");
					}
				}
				for (c = 1; c <= b; c++) {
					if (c >= a)
						System.out.print("*");
				}

				System.out.println();
			}

		}
		sc.close();
	}

}
