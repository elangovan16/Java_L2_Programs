/*
 * 9. Reverse the words in the given String1 from the first occurrence of String2 in String1 by maintaining white Spaces.
example: String1 = Input: This is a test String only String2 = st Output: This is a only String test*/
import java.util.Scanner;
public class Program_9 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String-1");
		String s1=sc.nextLine();
		System.out.println("Enter the String-2");
		String s2=sc.nextLine();
		String ans="";
		sc.close();
		String[] ary=s1.split("\\s+");
		
		for(int i=0;i<ary.length;i++) {
			if(ary[i].contains(s2)) {
				String temp=ary[i];
				ary[i]=ary[ary.length-1];
				ary[ary.length-1]=temp;
				break;
			}
		}
		for(String a:ary) {
			ans+=a+" ";
		}
		System.out.println(ans);
	}
}