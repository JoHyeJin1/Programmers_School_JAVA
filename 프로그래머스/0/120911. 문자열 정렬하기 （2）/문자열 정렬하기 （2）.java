class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray(); // 문자열 → 배열

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return new String(arr); // 배열 → 문자열
    }
}
