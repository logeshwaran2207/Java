package DSA;

public class linearsearch {
	

	public static void main(String args[]) {
		int nums[]= {5,6,7,8,9};
		int target= 8;
		
		int result =linearSearch(nums,target);
		
		if (result != -1) {
			System.out.println("element found of index : " +result);
		}
		else {
			System.out.println("element not found");
		}
	}

	public static int linearSearch(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		
		return -1;
	}

}
