
/*
 * 102)Given an array, find the minimum of all the greater numbers for each element in the array.
Sample:Array : {2, 3, 7, ¬1, 8, 5, 11}
Output:
{2¬>3, 3¬>5, 7¬>8, ¬1¬>2, 8¬>11, 5¬>7, 11¬>}*/
import java.util.Arrays;

public class Program_102 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, -1, 8, 5, 11 };
		int[] copy = arr.clone();
		Arrays.sort(copy);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "-->");
			for (int j = 0; j < arr.length; j++) {
				if (j >= arr.length - 1)
					break;
				else if (arr[i] == copy[j]) {
					System.out.print(copy[j + 1] + ",");
					break;
				}
			}
		}
	}
}
