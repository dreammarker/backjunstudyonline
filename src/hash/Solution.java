package hash;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
/*    	String answer = "";
    	int val= 0;
    	Map< String,Integer> hm = new HashMap<>();
    	
    	for(String part : participant){
    		if(hm.get(part)==null){
    			hm.put(part, 1);
    		}
    		else{
    			val = hm.get(part)+1;
    			hm.put(part, val);
    		}
    	}
    	for(String comp: completion){
    		val = hm.get(comp) - 1;
    		hm.put(comp, val);
    	}
    	
    	for(String key : hm.keySet()){
    		if(hm.get(key)==1) answer = key;
    	}
        return answer;*/
    	//정렬한뒤에
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	int i;
    	for(i=0;i<completion.length;i++){
    		if(!participant[i].equals(completion[i])){
    			return participant[i];
    		}
    	}
    	return participant[i];
    }
}