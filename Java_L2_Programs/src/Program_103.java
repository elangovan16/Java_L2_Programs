/*
*103) Find the largest sum contiguous subarray which should not have negative numbers. We have to print
the sum and the corresponding array elements which brought up the
sum.
Sample:
Array : {¬2, 7, 5, ¬1, 3, 2, 9, ¬7}
Output:
Sum : 14
Elements : 3, 2, 9*/

import java.util.HashMap;
import java.util.Map;

public class Program_103 {

	public static void main(String[] args) {
		int[] arr = { -2, 7, 5, -1, 3, 2, 9, -7 };
		int max = 0;
		int sum = 0;
		String s = "";
		Map<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
				s += arr[i] + ",";
				if (sum > max) {
					max = sum;
				}
			} else {
				if (sum > 0) {
					m.put(sum, s);
				}
				sum = 0;
				s = "";
			}
		}
		System.out.println("Sum : " + max);
		System.out.println("Elements :" + m.get(max));
	}
}
