/*3. Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the
sum of elements at higher indexes. For example, in an array A:
Example :
Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Input: A[] = {1, 2, 3}
Output: -1
 * */
public class Program_3 {
	public static void main(String[] args) {
		int ary[]= {-7,1,5,2,-4,3,0};
		int ary_mid=ary.length/2;
		int ary_right=0,ary_left=0;
		for(int i=0;i<ary_mid;i++) {
			ary_left+=ary[i];
			ary_right+=ary[ary_mid+i+1];
		}
		if(ary_left==ary_right) {
			System.out.println(ary_mid);
		}
		else {
			System.out.println(-1);
		}
	}
}