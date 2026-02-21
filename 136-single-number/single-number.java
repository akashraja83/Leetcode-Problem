class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1)
                return key;
        }
        return -1;
    }
}