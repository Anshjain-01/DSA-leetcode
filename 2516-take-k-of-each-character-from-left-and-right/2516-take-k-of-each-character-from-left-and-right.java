import java.util.*;
class Solution {
    public int takeCharacters(String s, int k) {
        HashMap<Character, Integer> total = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            total.put(ch, total.getOrDefault(ch, 0) + 1);
        }
        if (total.getOrDefault('a', 0) < k ||
            total.getOrDefault('b', 0) < k ||
            total.getOrDefault('c', 0) < k) {
            return -1;
        }
        HashMap<Character, Integer> maxPos = new HashMap<>();
        maxPos.put('a', total.getOrDefault('a', 0) - k);
        maxPos.put('b', total.getOrDefault('b', 0) - k);
        maxPos.put('c', total.getOrDefault('c', 0) - k);
        HashMap<Character, Integer> temp = new HashMap<>();
        int start = 0;
        int ans = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            while (temp.getOrDefault('a', 0) > maxPos.get('a') ||
                   temp.getOrDefault('b', 0) > maxPos.get('b') ||
                   temp.getOrDefault('c', 0) > maxPos.get('c')) {

                char left = s.charAt(start);
                temp.put(left, temp.get(left) - 1);
                if (temp.get(left) == 0) {
                    temp.remove(left);
                }
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }

        return s.length() - ans;
    }
}
