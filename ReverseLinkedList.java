import java.util.Scanner;

public class ReverseLinkedList {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static void insert(int ele) {
		Node newNode=new Node(ele);
		if(head==null)
			head=newNode;
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	public static void reverse() {
		Node current=head,temp=null,prev=null;
		while(current!=null)
		{
			prev=current;
			current=current.next;
			prev.next=temp;
			temp=prev;
		}
		head=prev;
	}
	public static void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList ll=new ReverseLinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int ele=sc.nextInt();
			ll.insert(ele);
		}
		ll.reverse();
		ll.display();
	}

}
