package basic;
/*
import java.io.*;
import java.util.Arrays;

public class Backjun1181 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt( br.readLine() );

        Words[] list = new Words[n];

        for( int i = 0 ; i < n ; ++i )
            list[i] = new Words( br.readLine() );

        Arrays.sort( list );

        String tmp = "";

        for(Words w : list){
            String target = w.getWord();
            if( !tmp.equals(target) ){
                sb.append( target + "\n" );
                tmp = target;
            }
        }

        System.out.println(sb);

    }
}

class Words implements Comparable<Words>{

    private String word;

    Words( String word ){
        this.word = word;
    }

    String getWord(){
        return this.word;
    }

    @Override
    public int compareTo(Words o) {
        int thisLen = this.word.length();
        int comLen = o.word.length();

        if( thisLen < comLen )
            return -1;
        else if( thisLen > comLen )
            return 1;
        else
            return this.word.compareTo( o.word );
    }
}
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Backjun1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//몇번 반복?
		int n = Integer.parseInt(br.readLine());
		int len ,tmp,j;
		//HashSet 중복제거
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<n;i++){
			hs.add(br.readLine());
		}
		// 중복제거한 수만큼 
		int size = hs.size();
		String arr[] = new String[size];
		//해쉬값들을 String에  이동
		hs.toArray(arr);
		Arrays.sort(arr,new Comparator<String>() {
			public int compare(String s1,String s2){
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		for(int i=0;i<size;i++){
			len =arr[i].length();
			for(j=i+1;j<size;j++){
				tmp =arr[j].length();
				if(len != tmp) break;
			}
			Arrays.sort(arr,i,j); //같은 길이의 문자열끼리 정렬하는 부분..
			i  = j-1;
		}
		for(int i=0;i<size;i++) bw.write(arr[i]+"\n");
		bw.close();
	}
}
	
	
	



