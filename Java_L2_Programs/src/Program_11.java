/*
 * 11. 
Sample Input-
2
Hacker
Rank
Sample Output-
Hce akr
Rn ak*/
import java.util.Scanner;
public class Program_11 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("How many word do you Enter : ");
		int n=sc.nextInt();
		String[] ary=new String[n];
		sc.nextLine();
		String temp1="",temp2="";
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" word");
			String temp=sc.nextLine();
			ary[i]=temp;
		}
		sc.close();
		for(int j=0;j<n;j++) {
			for(int k=0;k<ary[j].length();k++) {
				if(k%2==0) {
					temp1+=ary[j].charAt(k);
				}
				else {
					temp2+=ary[j].charAt(k);
				}
			}
			ary[j]=temp1+" "+temp2;
			temp1="";
			temp2="";
		}
		for(String a:ary) {
			System.out.println(a);
		}
	}
}