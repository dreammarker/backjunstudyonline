package threelevel;

import java.util.Scanner;

public class 백준2440별찍기_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		b = sc.nextInt();
		int c;

		if (b >= 1 && b <= 100) {
			for (a = 1; a <= b; a++) {

				// for(c=1;c<=b;c++) {
				// if(c-1>=a) {
				// System.out.print(" ");
				// }
				// }
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
