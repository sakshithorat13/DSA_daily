class Solution {
    public String decodeString(String s) {
        Stack<String> strst = new Stack<>();
        Stack<Integer> numst = new Stack<>();

        String curr = "";
        int k =0;
        for (int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                k =k*10 +(ch -'0');
            }else if(ch =='['){
                numst.push(k);
                strst.push(curr);

                k =0;
                curr = "";
            }else if (ch ==']'){
                int count = numst.pop();
                String prev = strst.pop();
                String temp = "";
                for(int  j=0;j<count;j++){
                    temp += curr;
                }
                curr = prev + temp;
            }
            else{
                curr += ch;
            }
      }
      return curr;
        
    }
}