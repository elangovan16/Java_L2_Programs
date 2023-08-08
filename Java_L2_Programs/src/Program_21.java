/*
 * 21.Given N. print the following snake pattern (say N = 4). condition: must not use arrays ( 1D array or 2D
array like Matrix ).
 1  2  3  4
 8  7  6  5
 9 10 11 12
16 15 14 13*/
import java.util.Scanner;
public class Program_21 {
	public static void main(String[] args) {
		int n;
		int count =1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N :");
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2!=0) {
					System.out.printf("%2d ",count++);
				}
				else {
					System.out.printf("%2d ",(n*i)-j+1);
					count++;
				}
			}
			System.out.println();
		}
	}
}
