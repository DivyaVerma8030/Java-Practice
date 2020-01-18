import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	char[] ch1=s1.toCharArray();
	char[] ch2=s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	int temp=0;
	if(s1.length()==s2.length()) {
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
				temp=1;
		}
		if(temp==0)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
	else
		System.out.println("Not Anagrams");
}
}
