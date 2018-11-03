package fourlevel;

import java.util.Scanner;

public class 백준10871X보다작은수 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		int a,b,e=0;
		a=scanner.nextInt();
		b=scanner.nextInt();
		int c[]=new int [a];
		int d[]=new int [a];
		for(int i=0;i<=a-1;i++) {
			c[i]=scanner.nextInt();
			if(c[i]<b) {
			d[e]=c[i];
			e++;
			}
		}
		
		for(int i=0;i<=e-1;i++)
			System.out.println(d[i]);
		
			scanner.close();
	}

}
