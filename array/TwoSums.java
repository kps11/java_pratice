package java_pratice.array;

import java.util.Arrays;

public class TwoSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,6,3};
		int target = 6;
		
		int [] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));
		
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
		// Store original indices with their values
		int[][] indexedNums = new int[nums.length][2];
		for (int i = 0; i < nums.length; i++) {
			indexedNums[i][0] = nums[i];
			indexedNums[i][1] = i;
		}
		
		// Sort based on values
		Arrays.sort(indexedNums, (a, b) -> a[0] - b[0]);
		
		int left = 0;
		int right = nums.length - 1;
		
		while (left < right) {
			int sum = indexedNums[left][0] + indexedNums[right][0];
			if (sum == target) {
				return new int[]{indexedNums[left][1], indexedNums[right][1]};
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		
		return new int[]{-1, -1};
	}
	

}
