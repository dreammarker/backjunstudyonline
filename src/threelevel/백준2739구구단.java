package threelevel;

import java.util.Scanner;

public class 백준2739구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		b = sc.nextInt();
		if (b >= 1 && b <= 9) {
			for (a = 1; a <= 9; a++) {
				System.out.println(b + " * " + a + " = " + (a * b));
			}
		}
		sc.close();
	}

}
