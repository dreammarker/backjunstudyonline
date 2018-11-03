package threelevel;

import java.util.Scanner;

public class 백준11720숫자의합 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String inputs = sc.next();
        sc.close();
         
        int result = 0;
        for (int i = 0; i < n; ++i) {
           result += Integer.parseInt(inputs.substring(i, i + 1));
        }
        System.out.println(result);
	}

}
