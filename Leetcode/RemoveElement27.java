class RemoveElement27 {

	public static void main(String args[])
	{
		int nums[]={3,2,2,1,5,2,9};
		int val=2;
		removeElement(nums, val);
	}
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        for(int i =0; i < n; i++){
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}