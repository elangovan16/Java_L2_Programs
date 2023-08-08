/*
 * 5. Given a matrix of 2D array of n rows and m coloumns. Print this matrix in ZIG-ZAG fashion as shown in
figure.
Example:
Input:
123
456789
Output:
124753689*/
public class Program_5 {
	public static void main(String[] args) {
		int[][] matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		printZigZag(matrix);
	}

	private static void printZigZag(int[][] matrix) {
		int rows=matrix.length;
		int cols=matrix[0].length;
		int row=0,col=0;
		boolean moveUp=true;
		
		for(int i=0;i<rows*cols;i++) {
			System.out.print(matrix[row][col]+" ");
			
			if(moveUp) {
				if(col==cols-1) {
					row++;
					moveUp=false;
				}
				else if(row==0) {
					col++;
					moveUp=false;
				}
				else {
					row--;
					col++;
				}
			}
			else {
				if(row==rows-1) {
					col++;
					moveUp=true;
				}
				else if(col==0) {
					row++;
					moveUp=true;
				}
				else {
					row++;
					col--;
				}
			}
		}
	}
}
