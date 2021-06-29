public class Solution2 {

    public static String solution(String s) {
        String answer = s;

        String[] str = answer.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
           if (!(str[i].equals(""))) {
                String str2 = str[i];

                for (int idx = 0; idx < str2.length(); idx++) {
                    StringBuilder sb = new StringBuilder();

                    if (idx % 2 == 0) {
                        sb.append(Character.toUpperCase(str2.charAt(idx)));
                    } else {
                        sb.append(Character.toLowerCase(str2.charAt(idx)));
                    }

                    result.append(sb);
                }
                result.append(" ");
            }
        }
        answer = String.valueOf(result);
        answer = answer.trim();
        return answer;
    }

    public static void main(String[] args) {
//        solution("try hello world");
       solution("    i  love you i hate ");
    }
}


