/*
 *7. Print whether the version is upgraded, downgraded or not changed according to the input given.
example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded, Input : Version1 4.0.2 Version2 4.8.4 Output: downgraded*/
import java.util.Scanner;
public class Program_7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Version-1 : ");
		String v1=sc.nextLine();
		System.out.print("Enter Version-2 : ");
		String v2=sc.nextLine();
		sc.close();
		String[] v1_ary=v1.split("\\.");
		String[] v2_ary=v2.split("\\.");
		String v1s="",v2s="";
		int max=(v1_ary.length>v2_ary.length)?v1_ary.length:v2_ary.length;
		for(int i=0;i<max;i++) {
			if(v1_ary.length>i) {
				v1s+=v1_ary[i];
				if(v1_ary[i].length()>1) {
					v2s+=0;
				}
			}
			else {
				v1s+="0";
			}
			if(v2_ary.length>i) {
				v2s+=v2_ary[i];
				if(v2_ary[i].length()>1) {
					v1s+=0;
				}
			}
			else {
				v2s+="0";
			}
		}
		int v1i=Integer.parseInt(v1s);
		int v2i=Integer.parseInt(v2s);
		System.out.println(v1s);
		System.out.println(v2s);
		if(v1i==v2i) {
			System.out.println("Version was not Change");
		}
		else if(v1i>v2i) {
			System.out.println("Version was Downgraded");
		}
		else {
			System.out.println("Version was Upgraded");
		}
	}
}