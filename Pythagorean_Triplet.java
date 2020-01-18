import java.util.Scanner;

public class Pythagorean_Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int l=0;l<t;l++) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				for(int k=0;k<n;k++)
				{
					if(arr[i]*arr[i]+arr[j]*arr[j]==arr[k]*arr[k])
						temp=1;
				}
			}
		}
		if(temp==1)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
	}

}
