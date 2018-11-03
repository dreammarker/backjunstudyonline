package fourlevel;

import java.util.Scanner;

public class 백준10817세_수 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100) && (c >= 1 && c <= 100)) {
			d = (a > b ? (c > a ? a : (c > b ? c : b)) : (c > b ? b : (c > a ? c : a)));
			System.out.println(d);
		}
		sc.close();
	}

}
