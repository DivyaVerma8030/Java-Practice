import java.util.Scanner;

public class MaxOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		for(int i=0;i<n-k+1;i++) {
			int max=arr[i];
			for(int j=i;j<i+k;j++) {
				if(arr[j]>max)
					max=arr[j];
			}
			System.out.print(max+" ");
		}

	}

}
