/*Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false */

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words= s.split(" ");
        int n=pattern.length();
        if(n!=words.length)
        return false;
        HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Boolean>used=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!words[i].equals(map.get(ch)))
                return false;
                else
                continue;
            }else{
                if(used.containsKey(words[i]))
                return false;
                map.put(ch,words[i]);
                used.put(words[i],true);
            }
        }
        return true;
    }
}
