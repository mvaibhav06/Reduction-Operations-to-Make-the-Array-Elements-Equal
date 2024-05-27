class ReductionOperations {
    
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int out = 0;
        Set<Integer> temp = new HashSet<>();
        temp.add(nums[0]);
        for(int i=0; i<nums.length; i++){
            if(!temp.contains(nums[i])){
                out += temp.size();
                temp.add(nums[i]);
            }else{
                out += temp.size()-1;
            }
        }
        return out;
    }
}
