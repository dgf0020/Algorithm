class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        // 일단 전부 다 초로 바꾸자
        int video_time = Integer.parseInt(video_len.split(":")[0]) * 60 + Integer.parseInt(video_len.split(":")[1]);
		int pos_time =  Integer.parseInt(pos.split(":")[0]) * 60 + Integer.parseInt(pos.split(":")[1]);
        int start_time =  Integer.parseInt(op_start.split(":")[0]) * 60 + Integer.parseInt(op_start.split(":")[1]);
        int end_time =  Integer.parseInt(op_end.split(":")[0]) * 60 + Integer.parseInt(op_end.split(":")[1]);
        
        
        if (start_time <= pos_time && pos_time <= end_time) {
            pos_time = end_time;
        }
        
        for (int i = 0; i < commands.length; i++) {    
            if (commands[i].equals("next")) {
                pos_time += 10;
                
                if (pos_time > video_time) {
                    pos_time = video_time;
                }
            }
            else if (commands[i].equals("prev")) {
                pos_time -= 10;
                
                if (pos_time < 0) {
                    pos_time = 0;
                }
            }
            
            if (start_time <= pos_time && pos_time <= end_time) {
                pos_time = end_time;
            }
        }
        
        if (pos_time / 60 < 10) {
            answer += "0";
        }
        answer += pos_time / 60;
        answer += ":";
        if (pos_time % 60 < 10) {
            answer += "0";
        }
        answer += pos_time % 60;
        
               
        return answer;
    }
}