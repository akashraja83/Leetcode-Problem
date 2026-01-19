class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = First(nums,target);
        int last = Last(nums,target);
        return new int[]{first,last};
    }
    public int First(int[] arr,int target){
        int left=0;
        int right = arr.length-1;
        int first = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                first = mid;
                right = mid-1;
            }
            else if(arr[mid] < target)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return first;
    }
    public int Last(int[] arr,int target){
        int left=0;
        int right = arr.length-1;
        int last = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                last = mid;
                left = mid+1;
            }
            else if(arr[mid] < target)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return last;
    }
}