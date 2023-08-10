/*
 *104) Given a string, we have to reverse the string without changing the position of 
 * punctuations and spaces.
Sample: house no : 123@ cbe
Output: ebc32 1o : nes@ uoh*/
public class Program_104 {
	public static void main(String[] args) {
		String str="house no : 123@ cbe";
		String result="";
		String regex="[^a-zA-Z0-9]+";
		int left=0,right=str.length()-1;
		while(left<str.length()&&right>=0) {
			if((str.charAt(left)+"").matches(regex)) {
				result += str.charAt(left);
				left++;
				continue;
			}
			while((str.charAt(right)+"").matches(regex)) {
				right--;
				System.out.println(left);
			}
		    result += str.charAt(right--);
		    left++;
		    
		}
		System.out.println(result);
	}
}
