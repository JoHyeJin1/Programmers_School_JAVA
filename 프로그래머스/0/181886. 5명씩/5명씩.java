class Solution {
    public String[] solution(String[] names) {
        int size = 0;
        if(names.length % 5 == 0){
            size = names.length / 5;
        }else{
            size = names.length / 5 + 1;
        }
        
        int j = 0;
        String[] answer = new String[size];
        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0){
                answer[j++] = names[i];
            }
        }
        return answer;
    }
}