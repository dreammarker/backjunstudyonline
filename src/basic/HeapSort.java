package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HeapSort {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine().trim());
		if(num>=1&&num<=10000000) {
			int heap[] = new int [num];
			for(int i=0; i<num;i++) {
				heap[i] = Integer.parseInt(br.readLine().trim());
			}
		int number = heap.length;
		//힙정렬 구성
		for(int i=1;i<number;i++) {
			int c=i;
			//힙정렬 구성하는 부분..
			do {
			int root=(c-1)/2;
			//자식값이 부모보다 크면
			if(heap[root] < heap[c]) {
				int temp	= heap[root]; //기존 부모값을 temp에 담아둔다
				heap[root]   =heap[c];  //기존 자식값을 부모값 
				heap[c] =temp;	//temp에 담아둔 기존 부모값을 자식에 보냄
			}
			c =root;
			}while(c!=0);
		}
		
		for(int i=number-1;i>=0;i--) {
			int temp = heap[0];  //가장 위에있는 값이 크기떄문에 위에있는 값과 교체한다
			heap[0]  = heap[i];
			heap[i]  = temp;
			int root = 0;
			int c	 = 1;
			//바꾸고 난 뒤만큼 다시 위에서 부터 힙정렬..
			do{
				c = 2 * root+1;//자식값
				//자식중에 더 큰 값을 찾는다.
				if(c<i-1&&heap[c]<heap[c+1]) {
					c++;
				}
				//그값이 부모보다 크면  교환한다
				if(c<i&&heap[root]<heap[c]) {
					int temp1 = heap[root];
					heap[root] = heap[c];
					heap[c]    =  temp1;
				}
				root = c;
				
			}while(c<i);
		}
		
			for(int i=0;i<number;i++) {
				System.out.println(heap[i]);
			}
		}
	}
}
