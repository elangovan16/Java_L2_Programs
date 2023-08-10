/*
 * 4.In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced
with a new selected color. Following is the problem statement to do this task.
Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all adj
acent same colored pixels with the given color.
Example:
Input:
screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
{1, 1, 1, 1, 1, 1, 0, 0},
{1, 0, 0, 1, 1, 0, 1, 1},
{1, 2, 2, 2, 2, 0, 1, 0},
{1, 1, 1, 2, 2, 0, 1, 0},
{1, 1, 1, 2, 2, 2, 2, 0},
{1, 1, 1, 1, 1, 2, 1, 1},
{1, 1, 1, 1, 1, 2, 2, 1},
};
x = 4, y = 4, newColor = 3
The values in the given 2D screen indicate colors of the pixels.
x and y are coordinates of the brush, newColor is the color that
should replace the previous color on screen[x][y] and all surrounding
pixels with same color.
Output:
Screen should be changed to following.
screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
{1, 1, 1, 1, 1, 1, 0, 0},
{1, 0, 0, 1, 1, 0, 1, 1},
{1, 3, 3, 3, 3, 0, 1, 0},
{1, 1, 1, 3, 3, 0, 1, 0},
{1, 1, 1, 3, 3, 3, 3, 0},
{1, 1, 1, 1, 1, 3, 1, 1},
{1, 1, 1, 1, 1, 3, 3, 1},
};*/

import java.util.Scanner;

public class Program_4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int screen[][] = {
				{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 0, 0},
				{1, 0, 0, 1, 1, 0, 1, 1},
				{1, 2, 2, 2, 2, 0, 1, 0},
				{1, 1, 1, 2, 2, 0, 1, 0},
				{1, 1, 1, 2, 2, 2, 2, 0},
				{1, 1, 1, 1, 1, 2, 1, 1},
				{1, 1, 1, 1, 1, 2, 2, 1},
				};
		System.out.println("Before Modified Array");
		print_Screen(screen);
		System.out.println();
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the replace number");
		int replace_num=sc.nextInt();
		sc.close();
		
		for(int i=0;i<screen.length;i++) {
			for(int j=0;j<screen[0].length;j++) {
				if(screen[i][j]==num) {
					screen[i][j]=replace_num;
				}
			}
		}
		
		System.out.println("After Modified Array"+"\n");
		print_Screen(screen);
	}
	public static void print_Screen(int[][] screen) {
		for(int i=0;i<screen.length;i++) {
			for(int j=0;j<screen[0].length;j++) {
				System.out.print(screen[i][j]+" ");
			}
			System.out.println();
		}
	}
}