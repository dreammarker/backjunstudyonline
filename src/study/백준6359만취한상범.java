//package study;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class 백준6359만취한상범 {
//
//	public static void main(String[] args) throws Exception{
//		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int n = new Integer(br.readLine());
//		for(int i=0;i<n;i++) {
//			int num = new Integer(br.readLine());
//			boolean test[] = new boolean [num];
//			for(int cnt=1;cnt<=num;cnt++) {
//				for(int j=0;j<num;j++) {
//					
//					if((j+1)%cnt==0) {
//						
//						if(test[j] ==true) {
//							test[j] = false;
//						}
//						
//						else if(test[j]==false) {
//							test[j] = true;
//						}
//						
//					}
//				}
//			}
//			int count =0;
//			for(int b=0;b<num;b++) {
//				if(test[b]==true) {
//					count++;
//				}
//			}
//			bw.write(count+"\n");
//
//		}
//		bw.close();
//
//	}
//
//}

package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준6359만취한상범 {

	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		for(int i=0;i<n;i++) {
			int num = new Integer(br.readLine());
			boolean test[] = new boolean [num];
			for(int a=0;a<num;a++) {
				for(int b=a;b<num;b+=(a+1)) {
					test[b] = !test[b];
					}
				}
			
			int count =0;
			for(int c=0;c<num;c++) {
				if(test[c]==true) {
					count++;
				}
			}
			bw.write(count+"\n");

		}
		bw.close();

	}

}
