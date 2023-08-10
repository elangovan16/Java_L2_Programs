
public class Program_106 {
	private static String reverse(String[] arr,int l,String ans) {
		if(l==0) {
			return ans+=arr[l];
		}
		ans+=arr[l]+" ";
		return reverse(arr,--l,ans);
	}
	public static void main(String args[]) {
		String ans="";
		String s="one two three four five six seven eight nine ten";
		String[] arr=s.split("\\s+");
		int l=arr.length-1;
		System.out.println(reverse(arr,l,ans));
	}
}