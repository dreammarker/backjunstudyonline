package basic;


import java.util.Arrays;

public class Solution2 {
/*    public static int[] solution(int[] array, int[][] commands) {
        int [] answer = new int [commands.length];
        int index =0;
    	for(int i=0;i<commands.length;i++){
    		int start = commands[i][0];
    		int end   = commands[i][1];
    		int k	  = commands[i][2];
    		
    		int []temp =  new int [end-start+1];
    		int a =0;
    		for(int j=start-1;j<end;j++){
    			temp[a++] = array[j];
    		}
    		Arrays.sort(temp);
    		answer[index++]= temp[k-1];
    	}
        return answer;
    }*/
    public String solution(int[] numbers) {
    	for(int i=0;i<numbers.length;i++){
    		String number=String.valueOf(numbers[i]);
    		number.charAt(0);
    	}
    	String answer = "";
        return answer;
    }
}

