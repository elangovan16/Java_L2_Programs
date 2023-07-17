/*
 * 17.Given an array of integers, compute the maximum value for each integer in the index, 
 * by either summing all the digits or multiplying all the digits. (Choose which operation gives the maximum value)
    • Input:
    • 5
    • 120 24 71 10 59
    • Output:
    • 3 8 8 1 45
Explanation: For index 0, the integer is 120. Summing the digits will give 3,
and whereas Multiplying the digits gives 0. Thus, maximum of this two is 3.*/
import java.util.Arrays;
import java.util.Scanner;
public class Program_17 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("How many elements: ");
		int n=sc.nextInt();
		int ns[]=new int[n];
		
		for(int i=0;i<n;i++) {
		System.out.println("Enter the Element "+(i+1));
			ns[i]=sc.nextInt();
		}
		sc.nextLine();
		sc.close();
		for(int j=0;j<n;j++) {
			int res=ns[j];
			if(ns[j]>=10) {
				String ans=""+ns[j];
				int add=0;
				int mul=1;
				for(int k=0;k<ans.length();k++) {
					add+=Integer.parseInt(ans.charAt(k)+"");
					mul*=Integer.parseInt(ans.charAt(k)+"");
				}
				res=add>mul?add:mul;
				ns[j]=res;
			}
		}
		System.out.println(Arrays.toString(ns));
	}
}
