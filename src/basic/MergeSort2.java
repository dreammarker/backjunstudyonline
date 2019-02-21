package basic;

public class MergeSort2 {
	static int number = 8;
	static int sorted[] = new int [8];
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
	
	public static void main(String[] args) {
		int array[] = {7,6,5,8,3,5,9,2};
		mergeSort(array, 0 , number-1);
		for(int i = 0;i<number;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
}
