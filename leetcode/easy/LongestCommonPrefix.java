package leetcode.easy;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        String[] strs = {"flower", "flow", "flight"};
        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
                String longer = "";
        String temp = strs[0];
        String temp2;
        boolean matched = false;
        for (int j = 0; j < temp.length(); j++) {
            temp2 = temp.substring(0,temp.length() - j);
            System.out.println("TEMP2:" + temp2);
            matched = true;
            for (int i = 1; i < strs.length; i++) {
                System.out.println("Index of-->"+ strs[i].indexOf(temp2));
                if ( (strs[i].indexOf(temp2)==-1)) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                longer = temp2;
                break;
            }

        }
        System.out.println("LONGER" + longer);
        return longer;
    }
    private static String reverseString(String str){
        StringBuilder nstr = new StringBuilder();
        for (int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i); //extracts each character
            nstr.insert(0, ch); //adds each character in front of the existing string
        }
        return nstr.toString();
    }
}
