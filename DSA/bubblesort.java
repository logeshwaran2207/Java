package DSA;

public class bubblesort {
	public static void main(String args[]) {
		int nums[]= {0,1,0,1,0,1};
		int size=nums.length;
		int temp=0;
		System.out.println("before sort");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		
		for(int i=0;i<size;i++) {
			for(int j=1;j<size-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				   }
		     	}
			}
		System.out.println();
		
		
		System.out.println("after sort");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		
	}

}
