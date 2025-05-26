package DSA;

public class selectionsort {
	public static void main(String args[]) {
		int nums[]= {4,2,6,9,8};
		int size=nums.length;
		int temp=0;
		
		int minindex=-1;
		System.out.println("before sort");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		for(int i=0;i<size-1;i++) {
			minindex=i;
			for(int j=i+1;j<size;j++) {
				if(nums[minindex]>nums[j])
					minindex=j;
			}
			temp=nums[minindex];
			nums[minindex]=nums[i];
			nums[i]=temp;
			
			
		}
		
		
		System.out.println();
		System.out.println("after sort");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		
	}
	}


