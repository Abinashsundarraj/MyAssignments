package week1.day2;

import java.util.Iterator;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,6,2,5,4,8};
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					System.out.println("Duplicate number is:"+nums[i]);
					
				}
				
			}
			
		}

	}

}
