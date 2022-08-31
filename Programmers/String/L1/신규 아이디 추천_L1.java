class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 7단계의 순차적인 처리 과정
        // 7-1. 대문자 -> 소문자
        new_id = new_id.toLowerCase();
        // 7-2. 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자를 제거한다.
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
        // 7-3. 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환한다.
        new_id = new_id.replaceAll("[.]{2,}", ".");
        // 7-4. 마침표가 처음이나 끝에 위치한다면 제거한다.
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        // 7-5. 빈 문자열이라면, "a"를 대입한다.
        if(new_id == null || new_id.isEmpty()) new_id = "a";
        // 7-6. 길이가 16자 이상이면, 뒤에 문자는 제거한다. -> 제거 후, 끝문자가 마침표라면, 마침표 문자를 제거한다.
        if(new_id.length() >= 16) new_id = new_id.substring(0, 15);
        new_id = new_id.replaceAll("[.]$", "");
        // 7-7. 길이가 2자 이하라면, 길이가 3이 될 때까지 마지막 문자를 반복해서 끝에 붙입니다.
        while(new_id.length() < 3) new_id = new_id + new_id.substring(new_id.length()-1);

        answer = new_id;

        return answer;
    }
}