package threelevel;

import java.util.Scanner;

public class 백준8393합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0;

		b = sc.nextInt();

		for (a = 0; a <= b; a++) {
			c += a;
		}
		System.out.println(c);

		sc.close();

	}

}
