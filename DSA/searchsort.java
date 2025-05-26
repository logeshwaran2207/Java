package DSA;

public class searchsort {
	public static void main(String args[]) {
		int nums[]= {1,5,33,88,7,8};
		quicksort(nums,0,nums.length-1);
		
	for(int n:nums) {
		System.out.print(n+" ");}
	}
	

	public static void quicksort(int[] nums, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
			
		 int pi=partition(nums,low,high);
		 quicksort(nums,low,pi-1);
		 quicksort(nums,pi+1,high);
		}
		
		
	}

	public static int partition(int[] nums, int low, int high) {
		int pivot=nums[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
		if(nums[j]<pivot) {	
			i++;
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			
		}
		
		
		}
		int temp=nums[i+1];
		nums[i+1]=nums[high];
		nums[high]=temp;
		
		return i+1;
	}    
	}

	


