class Solution {
    public int lengthOfLongestSubstring(String s) {
       ArrayList<Character> ns = new ArrayList<Character>();
            int bigger = 0;
            int i = 0; 

            while (i < s.length()) {
                char currentChar = s.charAt(i);
                if (!ns.contains(currentChar)) {
                    ns.add(currentChar);
                    bigger = Math.max(bigger, ns.size());
                    i++;
                } else {
                    ns.remove(0);
                }
            }
        
        return bigger;
    }
}
