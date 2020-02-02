import java.util.Scanner;

public class StackMinElement {

	static Node top;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void insert(int ele) {
		Node newNode=new Node(ele);
		if(top==null) {
			top=newNode;
		}
		else {
			newNode.next=top;
			top=newNode;
		}
	}
	public void minElement() {
		if(top==null) {
			System.out.println("Stack is empty");
			return;
		}
		Node curr=top;
		int min=curr.data;
		while(curr!=null) {
			if(curr.data<min)
				min=curr.data;
			curr=curr.next;
		}
		System.out.println("Min element of the stack:-"+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMinElement stack=new StackMinElement();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int ele=sc.nextInt();
			stack.insert(ele);
		}
		stack.minElement();
	}

}
