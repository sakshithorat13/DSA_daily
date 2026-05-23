class Searchinsert {
    public int searchInsert(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);


    
        
    }
    
    public int search(int[] nums,int low , int high, int target) {
        
        int mid = (low+high)/2;
         if(low>high){
            return high+1;
            
        }else if(nums[mid] == target){
            return mid;
        }else if(target<nums[mid]){
            return search(nums , low , mid-1,target);
        }else if (target > nums[mid]){
            return search(nums , mid+1, high,target);
        }
        return 0;
        

    
        
    }
}
