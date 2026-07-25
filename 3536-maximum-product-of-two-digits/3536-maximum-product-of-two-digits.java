class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
        int digit = n%10;
        n = n/10;
        list.add(digit);
        }
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int mult = list.get(i)*list.get(j);
                max = Math.max(max,mult);
            }
        }
        return max;
    }
}