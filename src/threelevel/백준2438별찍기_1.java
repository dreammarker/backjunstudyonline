package threelevel;

import java.util.Scanner;

public class 백준2438별찍기_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		b = sc.nextInt();

		if (b >= 1 && b <= 100) {
			for (a = 1; a <= b; a++) {
				int c = 1;
				for (; c <= a; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		sc.close();

	}

}
