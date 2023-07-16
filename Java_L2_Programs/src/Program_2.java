/*
 * 2. Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then ma
ke its adjacent cells as 0.*/
import java.util.Scanner;
public class Program_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row : ");
		int row=sc.nextInt();
		System.out.print("Enter the Coloum : ");
		int column=sc.nextInt();
		sc.close();
		int ary[][]=new int[row][column];
		int count=0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(count%2==0) {
					ary[i][j]=1;
					count++;
				}
				else {
					ary[i][j]=0;
					count++;
				}
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print((ary[i][j])+" ");
			}
			System.out.println();
		}
	}
	
}