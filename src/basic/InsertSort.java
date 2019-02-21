package basic;

public class InsertSort {

	public static void main(String[] args) {
		int i,j,temp;
		int arr[]= {1,3,5,7,9,2,4,6,8,10};
		for(i=0;i<9;i++) {
			j=i;
			while(arr[j]>arr[j+1]) {
				temp     = arr[j];
				arr[j]   = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		
		for(int a=0;
				a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
	}

}
