package Lecture40;

import java.util.HashSet;

public class Intersectionof2arrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set =  new HashSet<>();
		HashSet<Integer> ans =  new HashSet<>();
		
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		
		for (int i = 0; i < nums2.length; i++) {
			if(set.contains(nums2[i])) {// common element found
				ans.add(nums2[i]);
			}
		}
		
		int k = 0;
		int arr[] = new int[ans.size()];
		
		for (int i : ans) {
			arr[k] = i;
			k++;
		}
		
		return arr;
		
	}

}
