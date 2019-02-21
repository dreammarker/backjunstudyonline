package basic;

public class QicSot {
	static int number= 10;
	static int data[] = {1,3,5,7,9,2,4,6,8,10};
	public static void quick(int data[],int start, int end) {
		if(start>=end) {
			return;
		}
		
		int key = start;
		int i	= start+1;
		int j	= end;
		int temp;
		
		while(i<=j) { //엇갈릴떄 까지 반복
			
			while(data[i]<=data[key]) {
				i++;
			}
			
			while(data[j]>=data[key]&&j>start) {
				j--;
			}
			
			if(i > j) {
				temp		=	data[j];
				data[j]		=	data[key];
				data[key]	=	temp;
			}
			else {
				temp	=	data[j];
				data[j]	=	data[i];
				data[i]	=	temp;
			}
		}
		quick(data,start,j-1);
		quick(data,j+1,end);
	}
	public static void main(String[] args) {
		quick(data,0,number-1);
		for(int i=0; i<number; i++) {
			System.out.print(data[i]+" ");
		}
	
	}

}
