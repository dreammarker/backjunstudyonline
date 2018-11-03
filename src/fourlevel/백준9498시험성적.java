package fourlevel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준9498시험성적 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bw = new BufferedReader(isr);

		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter br = new BufferedWriter(osw);
		String line = null;
		try {
			line = bw.readLine();
			int l = Integer.parseInt(line);
			if (90 <= l && l <= 100) {
				System.out.println("A");
			} else if (80 <= l && l <= 89) {
				System.out.println("B");
			} else if (70 <= l && l <= 79) {
				System.out.println("C");
			} else if (60 <= l && l <= 69) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
			br.flush();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
