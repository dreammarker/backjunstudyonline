package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sss {
	 
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            String floor = String.valueOf(n%h); // 층수를 나타낸다 -> 손님의 해당 번째를 건물 높이만큼 나눠주고 나머지가 층수
            String roomNumber = String.valueOf(n/h+1); // 방 호수를 나타낸다 -> 몫만큼 건물 꼭대기까지 다 채워지고 다음 호수
                                                    // 꼭대기층까지 YYXX가 꽉 찼으면 YY(XX+1)로 
            
            if(floor.equals("0")){ // 꼭대기층으로 배당될 경우
                floor = String.valueOf(h);
                roomNumber = String.valueOf(n/h);
            }
            
            if(roomNumber.length() == 1){
                roomNumber = "0"+roomNumber;
            }
            
            bw.write(floor+roomNumber);
            bw.newLine();
        }
        bw.flush();
    }
 
}