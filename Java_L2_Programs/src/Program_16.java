/*
 * 16.Assume there exists infinite grid, you’re given initial position x, y.
 *  Inputs will be movements either L or R or U or D. After n inputs, you need to give the current position.
    • Input: 
    • 4 5 //initial position x, y
    • 9 //number of movements
    • U L R R D D U L R //7 movements
    • Output:
4,6*/
import java.util.Scanner;
public class Program_16 {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter initial position - x");
		int x=sc.nextInt();
		System.out.println("Enter initial Position - y");
		int y=sc.nextInt();
		System.out.println("Enter number of movements : ");
		int move=sc.nextInt();
		System.out.println("Enter the move here using space(Ex:U D L R)");
		sc.nextLine();
		String moves=sc.nextLine();
		sc.close();
		String[] movesAry=moves.split(" ");
		for(int i=0;i<move;i++) {
			if(movesAry[i].equalsIgnoreCase("u")) {
				--x;
			}
			else if(movesAry[i].equalsIgnoreCase("d")) {
				++x;
			}
			else if(movesAry[i].equalsIgnoreCase("l")) {
				--y;
			}
			else {
				++y;
			}
		}
		System.out.println("Final position of (x,y) = "+x+","+y);
	}
}
