package sixlevel;

import java.util.Scanner;

public class 백준1152단어의개수 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine().trim();
		sc.close();
		if(a.isEmpty()) {
			System.out.println(0);
		}else {

			System.out.println(a.split(" ").length);
		}
	}

}
