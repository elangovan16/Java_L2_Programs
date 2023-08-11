/*15.Given an array of values persons[], each represents the weight of the persons. There will be infinite bik
es available. Given a value K which represents the maximum weight that a bike accommodates. Along wit
h that one more condition, a bike can carry two persons at a time. You need to find out the least number o
f times, the bike trips are made.*/
import java.util.Arrays;

public class Program_15 {
	public static void main(String[] args) {
		int k=10;
		int[] persons= {3,2,8,4,5,1,9,9};
		Arrays.sort(persons);
		System.out.println("Least Number of trips: "+bikeTrips(persons,k));
	}

	private static int bikeTrips(int[] persons, int k) {
		int trips=0;
		int left=0;
		int right=persons.length-1;
		
		while(left<=right) {
			if(persons[left]+persons[right]<=k) {
				left++;
			}
			right--;
			trips++;
		}
		return trips;
	}
}