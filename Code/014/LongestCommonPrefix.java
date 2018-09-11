public class LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.

     If there is no common prefix, return an empty string "".

     Example 1:

     Input: ["flower","flow","flight"]
     Output: "fl"
     Example 2:

     Input: ["dog","racecar","car"]
     Output: ""
     Explanation: There is no common prefix among the input strings.
     Note:

     All given inputs are in lowercase letters a-z.
     */
    public static void main(String[] args) {
        LongestCommonPrefix call = new LongestCommonPrefix();
        System.out.println(call.solution(new String[]{"flower","flow","flight"}));
    }

    private String solution(String[] strs){
        String result = "";
        if (strs.length == 0) return result;
        int min = strs[0].length() ;
        String minString = strs[0];
        for (int i = 0; i < strs.length ; i++) {
            if(min > strs[i].length()) {
                min = strs[i].length();
                minString = strs[i];
            }
        }
        int l = 0;
        for (int i = 0; i < strs.length ; i++) {
            l = 0;
            for (int j = 0; j < minString.length(); j++) {
                if(strs[i].charAt(j) == minString.charAt(j)){
                    l ++ ;
                }else {
                    if(l==0) return "";
                    if(l < min) min = l;
                    break;
                }


            }
        }
        if(min != 0) result = minString.substring(0,min);
        return result;
    }
}
