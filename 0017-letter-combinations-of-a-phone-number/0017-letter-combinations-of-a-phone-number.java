class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        HashMap<Integer,List<Character>> map = new HashMap<>();
        map.put(2, new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        map.put(3, new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        map.put(4, new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        map.put(5, new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        map.put(6, new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        map.put(7, new ArrayList<>(Arrays.asList('p', 'q', 'r','s')));
        map.put(8, new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        map.put(9, new ArrayList<>(Arrays.asList('w', 'x', 'y','z')));
        list.add("");
        for (int i = 0;i<digits.length();i++) {
            int num =digits.charAt(i)-'0';
            List<String>temp =new ArrayList<>();
            for (String str:list) {
                for (char ch:map.get(num)) {
                temp.add(str+ch);
                }
            }
            list=temp;
        }
        return list;
    }
    }