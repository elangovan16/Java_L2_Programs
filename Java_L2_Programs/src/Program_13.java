/*
 * 13.Print the word with odd letters – PROGRAM
Sample Output-
P      P
 R    R 
  O  O  
   G   
  R  R  
 A    A 
M      M*/
import java.util.Scanner;
public class Program_13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter odd letter word");
		String str=sc.nextLine();
		sc.close();
		int len =str.length();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if( (i==j) || i+j==len-1) {
					System.out.print(str.charAt(i));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}