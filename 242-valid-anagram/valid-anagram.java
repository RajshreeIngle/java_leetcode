class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String new_s1 = new String(s1);
        String new_s2 = new String(s2);
        return new_s1.equals(new_s2);
    }
}