/*
 * 10. calculate Maximum number of chocolates can eat and Number of wrappers left in hand.
Money: Total money one has to spend.
Price: price per chocolate.
wrappers: minimum number of wrappers for exchange choco: number of chocolate for wrappers.
Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)
example: input: Money:40 Price:1 wrappers:3 choco:1 Max visit:1 Output: total chocolate can eat: 53 wrappers left in hand:14*/

import java.util.Scanner; 
public class Program_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How much money do you have : ");
		int total=sc.nextInt();
		System.out.print("Price of one Chocolate : ");
		int price=sc.nextInt();
		System.out.print("Minimum number of wrappers for exchange choco : ");
		int wrap_count=sc.nextInt();
		System.out.println("Max visit");
		int visit=sc.nextInt();
		sc.close();
		int chocolate=0,wrappers=0;
		
		chocolate+=(total/price);
		wrappers+=chocolate;
		while(visit>0) {
			chocolate+=wrappers/wrap_count;
			int temp=wrappers/wrap_count;
			wrappers=wrappers%wrap_count;
			wrappers+=temp;
			visit--;
		}
		System.out.println("Total chocolate can eat : "+chocolate);
		System.out.println("Wrappers left in hand : "+wrappers);
	}
}