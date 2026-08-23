class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int a = (int) ch;
         String b = binary(a);
    while (b.length() < 8) {
          b = "0" + b;
            }
     sb.append(b);
        }
  String r = sb.toString();
 String t = sb.reverse().toString();
     return r.equals(t);
    }
    public String binary(int a) {
 return Integer.toBinaryString(a);
    }
}