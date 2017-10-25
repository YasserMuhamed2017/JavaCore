	package com.example.yasser;
	
	public class Exercise {
		public static  Node root;
		public Exercise(){
			this.root = null;
		}
		
		public boolean find(int id){
		//TODO   write search code here
		if (id == 4)
		return true;
		else 
		return false;
		}
		 
	 
		public void insert(int id){
			Node newNode = new Node(id);
			if(root==null){
				root = newNode;
				return;
			}
			Node current = root;
			Node parent = null;
			while(true){
				parent = current;
				if(id<current.data){				
					current = current.left;
					if(current==null){
						parent.left = newNode;
						return;
					}
				}else{
					current = current.right;
					if(current==null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
		public void display(Node root){
			if(root!=null){
				display(root.left);
				System.out.print(" " + root.data);
				display(root.right);
			}
		}
		public static void main(String arg[]){
			Exercise b = new Exercise();
			b.insert(8);
			b.insert(5);
			b.insert(4);
			b.insert(1);
			b.insert(7);
			b.insert(7);
			b.insert(7);
			b.insert(9);
			b.insert(260);
			b.insert(115);
			b.insert(115);
			b.insert(116);
			System.out.println("Original Tree : ");
			b.display(b.root);		
			System.out.println("");
			System.out.println(" 4 is exists : " + b.find(4));
		  
		}
	}
	
	class Node{
		int data;
		Node left;
		Node right;	
		public Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
