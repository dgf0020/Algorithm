import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
		
		String[] todays = today.split("\\.");
		
		int days = 0;
		
		days += (Integer.parseInt(todays[0]) - 2000) * 12 * 28;
		days += Integer.parseInt(todays[1]) * 28;
		days += Integer.parseInt(todays[2]);
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < terms.length; i++) {
			String[] term = terms[i].split(" ");
			
			map.put(term[0], Integer.parseInt(term[1]));
		}
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < privacies.length; i++) {
			String[] pri = privacies[i].split(" ");
			
			String[] pri_day = pri[0].split("\\.");
			
			int pri_days = 0;
			
			pri_days += (Integer.parseInt(pri_day[0]) - 2000) * 12 * 28;
			pri_days += Integer.parseInt(pri_day[1]) * 28;
			pri_days += Integer.parseInt(pri_day[2]);
			
			int result = pri_days + map.get(pri[1]) * 28;
			
			if (days >= result) {
				list.add(i + 1);
			}
		}
		answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}