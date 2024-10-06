import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
        
        for (String name : callings) {
            int idx = map.get(name);
            String bname = players[idx - 1];
            
            map.put(name, idx - 1);
            map.put(bname, idx);
            
            players[idx] = bname;
            players[idx - 1] = name;
        }

		answer = players;
       
        return answer;
    }
}