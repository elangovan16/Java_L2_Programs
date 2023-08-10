/*
 *104) Given a string, we have to reverse the string without changing the position of 
 * punctuations and spaces.
Sample: house no : 123@ cbe
Output: ebc32 1o : nes@ uoh*/
public class Program_104_1 {
	public static void main(String[] args) {
		String str="house no : 123@ cbe";
		String result="";
		int len=str.length()-1;
		for(int i=0;i<str.length()&&len>=0;) {
			if((str.charAt(i)+"").matches("[^a-zA-Z0-9]")) {
				result+=str.charAt(i++);
				continue;
			}
			if((str.charAt(len)+"").matches("[a-zA-Z0-9]")) {
				result+=str.charAt(len);
				i++;
				len--;
			}
			else if((str.charAt(len)+"").matches("[^a-zA-Z0-9]")) {
				len--;
			}
		}
		System.out.println(result);
	}
}
