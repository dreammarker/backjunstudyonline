package fourlevel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 백준1546평균 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int a = sc.nextInt();
		int b;
		for(int i=0; i<a;i++) {
			b= sc.nextInt();
			list.add(b);
			
		}
	
		double max= Collections.max(list);
		double sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i)/max*100;
		}
		System.out.printf("%.2f",sum/list.size());
	}

}
