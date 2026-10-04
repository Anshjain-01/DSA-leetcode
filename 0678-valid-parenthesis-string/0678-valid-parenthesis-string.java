class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stackBracket = new Stack<>();
        Stack<Integer> stackmult = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stackBracket.push(i);
            } 
            else if (s.charAt(i) == '*') {
                stackmult.push(i);
            } 
            else {
                if (!stackBracket.isEmpty()) {
                    stackBracket.pop();
                } 
                else if (!stackmult.isEmpty()) {
                    stackmult.pop();
                } 
                else {
                    return false;
                }
            }
        }

        while (!stackBracket.isEmpty() && !stackmult.isEmpty()) {

            if (stackBracket.peek() < stackmult.peek()) {
                stackBracket.pop();
                stackmult.pop();
            } 
            else {
                return false;
            }
        }

        return stackBracket.isEmpty();
    }
}