class Solution {
    public int minOperations(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String st =new String(arr);
        if(s.equals(st))
        return 0;
        if(s.length()==2)
        return -1;
        int count=0;
        int countf = 0;
        for(int i = 0;i<s.length();i++){
        if(s.charAt(s.length()-1)==s.charAt(i))
        count++;
        else if(s.charAt(0)==s.charAt(i))
        countf++;
        }
        if(arr[0]==s.charAt(0) || arr[s.length()-1]==s.charAt(s.length()-1)){
        return 1;
        }
        else if(count>1 || countf>1)
        return 2;
        else if(arr[0]==s.charAt(s.length()-1) && arr[s.length()-1]==s.charAt(0))
        return 3;
        else{
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String t = sb.toString();
            if(t.equals(st))
            return 3;
            else return 2;
        }
    }
}