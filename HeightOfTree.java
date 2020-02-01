import java.util.Scanner;

public class HeightOfTree {
	
	static Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	public static void insert(int ele) {
		root=insertItem(root,ele);
	}
	public static Node insertItem(Node root,int data) {
		if(root==null) {
			return new Node(data);
		}
		else if(root.data>data)
			root.left=insertItem(root.left,data);
		else if(root.data<data)
			root.right=insertItem(root.right,data);
		return root;
				
	}
	public static void height() {
		int height=findHeight(root.left);
		System.out.println("Height of the tree:-"+height);
	}
	public static int findHeight(Node root) {
		if(root==null)
			return 0;
		else {
			int ldepth=findHeight(root.left);
			int rdepth=findHeight(root.right);
			if(ldepth>=rdepth)
				return ldepth+1;
			else
				return rdepth+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightOfTree tree=new HeightOfTree();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int ele=sc.nextInt();
			tree.insert(ele);
		}
		tree.height();
	}

}
