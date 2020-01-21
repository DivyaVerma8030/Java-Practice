import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		if(n<2) {
			System.out.println("Invalid Input");
			return;
		}
		for(int i=0;i<n;i++)
		{
				arr[i]=sc.nextInt();
		}
		int first,second;
		first=second=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>first) {
				second=first;
				first=arr[0];
			}
			else if(arr[i]>second && arr[i]<first)
				second=arr[i];
		}
		if(second==Integer.MIN_VALUE) {
			System.out.println("Largest - "+first);
			System.out.println("There is no second largest");
		}
		System.out.println("Largest - "+first+"\n"+"Second Largest - "+second);

	}

}
