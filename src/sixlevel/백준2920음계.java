package sixlevel;

import java.util.Scanner;

public class 백준2920음계 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }
        sc.close();
         
        String output = "";
        for (int i = 0; i < inputs.length - 1; i++) {
            if (inputs[i] == inputs[i + 1] - 1) {
                output = "ascending";
            } else if (inputs[i] == inputs[i + 1] + 1) {
                output = "descending";
            } else {
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
	}

}
