/*
   1. Replace every element with the greatest element on right side
Last Updated: 06-05-2019
Given an array of integers, replace every element with the next greatest element (greatest element on the
right side) in the array. Since there is no element next to the last element, replace it with -1. For example,
if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
 */
public class Program_1 {

	public static void main(String[] args) {
		int[] ary={16,17,4,3,2};
		System.out.print("Before Modified :");
		print(ary);
		System.out.println();
		for(int i=0;i<ary.length;i++) {
			int max=-1;
			for(int j=i+1;j<ary.length;j++) {
				int temp=ary[j];
				max=Math.max(ary[j],max);
				if(temp>max) {
					temp=max;
				}
			}
			ary[i]=max;
		}
		System.out.print("After Modified :");
		print(ary);
	}
	public static void print(int ary[]) {
		for(int a:ary) {
			System.out.print(a+" ");
		}
	}
}