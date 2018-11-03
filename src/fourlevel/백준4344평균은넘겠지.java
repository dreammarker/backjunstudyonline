package fourlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준4344평균은넘겠지 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int cunt=sc.nextInt();
		for(int z=0;z<cunt;z++) {
		double b=0;
		int c;		
		int a = sc.nextInt();
		if(a<1||a>1000)
			break;
		double sum=0;
		for(int i=0; i<a;i++) {
				c=sc.nextInt();
				if(c>=0||c<=100)
				{
				sum+=c;
				list.add(c);
				}
		}
		sum=sum/list.size();
		for(int j=0;j<a;j++) {
			if(list.get(j)>sum)
				b++;
		}
		int t=list.size();
		System.out.printf("%.3f",(b*100)/t);
		System.out.print("%\n");
		list.clear();
		}
	}

}
