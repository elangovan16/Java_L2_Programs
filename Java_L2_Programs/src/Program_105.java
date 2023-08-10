/*
 *105) Given a 2D grid of characters, you have to search for all the words in a dictionary by
moving only along two directions, either right or down. Print the word if it occurs.
Sample :
a z o l
n x h o
v y i v 
o r s e
Dictionary = {van, zoho, love, are, is}
Output:
zoho
love
Is*/
public class Program_105 {
	public static void main(String[] args) {
		char arr[][]={
				{'a','z','o','l'},
				{'n','x','h','o'},
				{'v','y','i','v'},
				{'o','r','s','e'}
			};
		String[] di = {"van","zoho","love","are","is"};
		for(String s:di) {
			if(findWords(arr,s)) {
				System.out.println(s);
			}
		}
	}

	private static boolean findWords(char[][] arr, String s) {
		boolean flag=false;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				while(index<s.length()-1&&arr[i][j]==s.charAt(index)){
					index++;
						if(i<arr.length-1&&arr[i+1][j]==s.charAt(index)){
							i++;
							flag=true;
						}
						else if(j<arr[i].length-1&&arr[i][j+1]==s.charAt(index)) {
							j++;
							flag=true;
					}
						else {
							flag=false;
							continue;
						}
				}
			}
		}
		return flag;
	}
}
