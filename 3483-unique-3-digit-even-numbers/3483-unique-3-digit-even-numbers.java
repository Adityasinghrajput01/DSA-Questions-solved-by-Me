class Solution {
    public int totalNumbers(int[] digits) {
    int count = 0;
    HashMap<String, Integer> map = new HashMap<>();
     for (int i = 0; i < digits.length; i++) {
     if (digits[i] == 0) continue;
    for (int j = 0; j < digits.length; j++) {
    if (j == i) continue;
     for (int k = 0; k < digits.length; k++) {
        if (k == i || k == j) continue;
        if (digits[k] % 2 != 0) continue;
 String t = "" + digits[i] + digits[j] + digits[k];
 if (!map.containsKey(t)) {
     map.put(t, 1);
     count++;
     }
     }
         }
        }
        return count;
    }
}