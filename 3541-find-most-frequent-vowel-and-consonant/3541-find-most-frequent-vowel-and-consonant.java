class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxVowel=0;
        int maxConsonant=0;
        for(char ch:map.keySet()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                maxVowel=Math.max(maxVowel,map.get(ch));
            }
            else{
                maxConsonant=Math.max(maxConsonant,map.get(ch));
            }
        }
        return maxVowel+maxConsonant;
        
    }
}