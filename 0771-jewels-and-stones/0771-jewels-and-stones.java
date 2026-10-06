class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int n=jewels.length();
        int m=stones.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}