package fourlevel;

import java.util.Scanner;

public class 백준1110더하기사이클 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner scanner = new Scanner(System.in);
		
		int a,cnt=0,sum=0;
		sum=scanner.nextInt();
		a=sum;
		if(a<=99&a>=0) {
			do {
			sum=(sum%10*10)+(sum%10+sum/10)%10;
			cnt++;
			}while(sum!=a);
			System.out.println(cnt);
			}
			scanner.close();
	}

}
