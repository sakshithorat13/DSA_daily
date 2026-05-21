class reversestring {

    public void reverseString(char[] s) {
        
        reverse(s,0,s.length-1);
    }
    public void reverse(char[] s, int left,int right){
        if(left>= right) return ;
        s[left] = (char)(s[left]+s[right]);
        s[right] = (char)(s[left]-s[right]);
        s[left]=(char)(s[left]-s[right]);
        reverse(s,left+1,right-1);
    }
}