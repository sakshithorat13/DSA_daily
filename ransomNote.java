class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch1 = magazine.charAt(i);
            map.put(ch1 , map.getOrDefault(ch1, 0)+1);

        }
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;


            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
        
    }
}
