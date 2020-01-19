import java.util.Scanner;

public class ReverseString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//No of test cases
		for(int i=0;i<t;i++)
		{
			String str=sc.next();//Input string
			String arr[]=str.split("\\.");//Split strings into string array
			//Displaying string
			for(int j=arr.length-1;j>=0;j--)
			{
				System.out.print(arr[j]);
				if(j!=0)
					System.out.print(".");
			}
		}
	}
}
