class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String ,String> map = new HashMap<>();
        for (List<String> row : knowledge) {
            map.put(row.get(0),row.get(1));
    }
int i = 0;
String res = "";
    while(i!=s.length()){
        char ch = s.charAt(i);
       if(ch=='('){
        i++;
        String t = "";
        while(s.charAt(i)!=')'){
            t = t+s.charAt(i);
            i++;
        }
        if(map.containsKey(t)){
            res = res+map.get(t);
            i++;
        }
        else{
            res = res+"?";
            i++;
        }
       }
       else{
        res = res+ch;
        i++;
       }
    }
    return res;
    }
}