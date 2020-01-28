import java.util.Scanner;

public class StringPermutations {

	static void permute(String str,int start,int end) {
		if(start==end)
			System.out.print(str+" ");
		else {
			for(int i=start;i<=end;i++)
			{
				str=swap(str,start,i);
				permute(str,start+1,end);
				str=swap(str,start,i);
			}
		}
	}
	static String swap(String str,int a,int b) {
		char ch[]=str.toCharArray();
		char temp=ch[a];
		ch[a]=ch[b];
		ch[b]=temp;
		return String.valueOf(ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			String str=sc.next();
			permute(str,0,str.length()-1);
			System.out.println();
		}
	}

}
