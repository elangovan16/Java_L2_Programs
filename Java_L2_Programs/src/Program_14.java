/*
 * 14.
Sample Input – Alternate SortingInput: {1, 2, 3, 4, 5, 6, 7}
output: {7, 1, 6, 2, 5, 3, 4}*/
import java.util.Arrays;
import java.util.Scanner;
public class Program_14 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int ary[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" Element : ");
			ary[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(ary);
		int ans[]=new int[n];
		int index=0;
		for(int j=0;j<n;j++) {
			if(j%2==0) {
				ans[j]=ary[n-(index+1)];
			}
			else {
				ans[j]=ary[index++];
			}
		
		}
		System.out.println(Arrays.toString(ans));
	}
}