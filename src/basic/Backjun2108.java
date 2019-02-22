package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjun2108 {
	static int number ;
	static int sorted[] = new int [1000000];
	public static void merge(int a[],int m,int middle,int n){
		int i = m;
		int j = middle+1;
		int k = m;
		//작은 순서대로 배열에 삽입
		//i는 middle까지
		//j는  k까지 
		while(i<=middle && j<=n) {
			if(a[i]<=a[j]) {
				sorted[k] = a[i];
				i++;
			}else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		//남은 데이터도 삽입
		if(i > middle) {
			for(int t=j;t<=n;t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		else {
			for(int t=i;t<=middle;t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		
		//정렬된 배열을 삽입
		for(int t = m; t<=n ; t++) {
			a[t] = sorted[t];
		}
	}
	//재귀함수로 구현하는 것이 가장 좋다.
	static void mergeSort(int a[],int m,int n) {
		//크기가 1보다 큰 경우
		if(m < n) {
			int middle = (m+n)/2;
			mergeSort(a,m,middle);
			mergeSort(a,middle+1,n);
			merge(a,m,middle,n);
		}
		else {
			int middle = (m+n)/2;
			merge(a,m,middle,n);
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count  = Integer.parseInt(br.readLine());
		//산술 평균 
		//중앙값  
		//최반값  
		//범위
		int num[] = new int [count];
		//값 집어넣기
		int sum =0;
		int max = -4000;
		int min = 4000;
		int chiben[] = new int [8001];
		for(int i=0;i<count;i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum+=num[i];
			chiben[num[i]+4000]++; //최빈값 구하기
			max=Math.max(max, num[i]); //최대값
			min=Math.min(min, num[i]); //최소값
		}
		mergeSort(num,0,count-1);
		//산술평균
		bw.write(Math.round(sum/count)+"\n");
		
		//중앙값
		bw.write(num[(int)Math.ceil(count/2)]+"\n");
		
		int ct=0;
		int temp=0;
		int chin=0;
		int cnt=0;
		//최빈값
		for(int i=0;i<=8000;i++) {
			if(cnt==count) {
				break;
			}
			else if(chiben[i]!=0) {
				temp=Math.min(temp, i);
				ct++;
				if(count==1) {
					chin = i-4000;
					break;
				}
				if(ct==2) {
					chin = i-4000;
					break;
				}
			   cnt++;
			}
			
		}
		bw.write(chin+"\n");
		if(count!=1) {
			bw.write((num[count-1]-num[0])+"\n");
		}
		else if(count==1) {
			bw.write("0");
		}
		
		bw.close();
	}

}
