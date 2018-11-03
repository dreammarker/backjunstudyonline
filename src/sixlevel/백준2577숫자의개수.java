package sixlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2577숫자의개수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 자동 생성된 메소드 스텁
		// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int A = Integer.parseInt(br.readLine());
				int B = Integer.parseInt(br.readLine());
				int C = Integer.parseInt(br.readLine());
				long num=A*B*C;
				int divi[] = new int [10];
				for(int i=0;i<10;i++) {
					divi[i]=0;
				}
				
				while(num>0) {
					A=(int) (num%10);
					divi[A]+=1;
					num/=10;
				}
				for(int i=0;i<10;i++) {
					System.out.println(divi[i]);
				}
				
				
				
				
				/*int n0=0,n10=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;
				if ((A >= 100 && A <= 1000 )&& (B >= 100 && B <= 1000 )&& (C >= 100 && C <= 1000)) {
					long a = A * B * C;
					String []n1 = Long.toString(a).split("");
					for (int i = 0; i < n1.length; i++) {
						if (n1[i].equals("0")) {
							n0+=1;
						} else if (n1[i].equals("1")) {
							n10+=1;
						} else if (n1[i].equals("2")) {
							n2+=1;
						} else if (n1[i].equals("3")) {
							n3+=1;
						} else if (n1[i].equals("4")) {
							n4+=1;
						} else if (n1[i].equals("5")) {
							n5+=1;
						} else if (n1[i].equals("6")) {
							n6+=1;
						} else if (n1[i].equals("7")) {
							n7+=1;
						} else if (n1[i].equals("8")) {
							n8+=1;
						} else if (n1[i].equals("9")) {
							n9+=1;
						}

					}
					System.out.println(n0);
					System.out.println(n10);
					System.out.println(n2);
					System.out.println(n3);
					System.out.println(n4);
					System.out.println(n5);
					System.out.println(n6);
					System.out.println(n7);
					System.out.println(n8);
					System.out.println(n9);
					
				}*/

	}

}
