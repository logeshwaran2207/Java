
package DSA;

public class insertionsort {
	public static void main(String args[]) {
		int nums[]= {4,2,6,9,8};
		int size=nums.length;
		
		
		for(int i=1;i<size;i++) {
			int key=nums[i];
			int j=i-1;
			while(j>=0 && nums[j]>key) {
				nums[j+1]= nums[j];
				j--;
			}
			nums[j+1]=key;
			
		}
		for(int num:nums) {
			System.out.print(num +" ");
		}

}
}
