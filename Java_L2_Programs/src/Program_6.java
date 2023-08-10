/*
 * 6.Remove the duplicates in the String.
Testcase 1:
Input: Java1234
Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
Testcase 2:
Input: Python1223:
Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated
2)
Testcase 3:
Input: aBuzZ9900
Output: aBuzC9012
(Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String. Replace with capital C as th
e letter to be replaced is capital Z. The second 9 turns out to be zero and the zero turns out to ‘1’ and the
second zero turns out to ‘2’*/

import java.util.Scanner;
public class Program_6 {
	public static void main(String[] args) {
		String str,ansStr="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		sc.close();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			for(int j=0;j<ansStr.length();j++) {
				if(c>='0'&&c<='9') {
					if(c==ansStr.charAt(j)) {
						c++;
						j=0;
						if(c>'9') {
							c='0';
						}
					}
				}
				else if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
					if((Math.abs(c-ansStr.charAt(j))==32)||(c==ansStr.charAt(j))) {
						c++;
						j=0;
					}
				}
				else {
					c-=26;
				}
			}
			ansStr+=c;
		}
		System.out.println(ansStr);
	}
}
