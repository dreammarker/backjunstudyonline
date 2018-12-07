package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 백준10828스택 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		for(int i=0;i<num;i++){
			String action[] = br.readLine().trim().split(" ");
			if(action[0].equals("push")){
				stack.push(action[1]);
			}
			else if(action[0].equals("top")){
				if(stack.size()!=0)
				System.out.println(stack.peek());
				else
				System.out.println(-1);
			}
			else if(action[0].equals("size")){
				System.out.println(stack.size());
			}
			else if(action[0].equals("pop")){
				if(stack.size()!=0)
				System.out.println(stack.pop());
				else
				System.out.println(-1);
			}
			else if(action[0].equals("empty")){
				if(stack.size()!=0)
					System.out.println(0);
				else 
					System.out.println(1);
			}
		}
		
	}

}
